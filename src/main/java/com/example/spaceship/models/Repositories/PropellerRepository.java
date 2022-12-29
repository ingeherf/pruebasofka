package com.example.spaceship.models.Repositories;

import com.example.spaceship.models.Entities.NoTripulatedRocket;
import com.example.spaceship.models.Entities.PropelledRocket;
import com.example.spaceship.models.Entities.Rocket;
import com.example.spaceship.models.Entities.TripulatedRocket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface PropellerRepository extends JpaRepository<PropelledRocket, Integer> {

    public Optional<List<PropelledRocket>> findByName(String name);

    public Optional<List<PropelledRocket>> findByEliminado(Date eliminado);

    @Query("SELECT u FROM PropelledRocket u WHERE" +
            " u.id = ?1" +
            " OR u.name LIKE %?2%" +
            " OR u.speed = ?3" +
            " OR u.weight = ?4" +
            " OR u.height = ?5" +
            " OR u.loadWeight = ?6" +
            " OR u.totalDistance = ?7" +
            " OR u.company LIKE %?8%" +
            " OR u.country LIKE %?9%")
    public Optional<List<PropelledRocket>> filterPShip(
            Integer id,
            String name,
            Double speed,
            Double weight,
            Double height,
            Double loadWeight,
            Double totalDistance,
            String company,
            String country,
            Date eliminado

    );
}
