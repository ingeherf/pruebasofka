package com.example.spaceship.Repositories;

import com.example.spaceship.models.Entities.NoTripulatedRocket;
import com.example.spaceship.models.Entities.TripulatedRocket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface TripulatedRocketRepo extends JpaRepository<TripulatedRocket, Integer> {

    public Optional<List<TripulatedRocket>> findByName(String name);
    public Optional<List<TripulatedRocket>> findByEliminado(Date eliminado);

    @Query("SELECT u FROM TripulatedRocket u WHERE" +
            " u.id = ?1" +
            " OR u.name = ?2" +
            " OR u.speed = ?3" +
            " OR u.weight = ?4" +
            " OR u.height = ?5" +
            " OR u.loadWeight = ?6" +
            " OR u.totalDistance = ?7" +
            " OR u.company = ?8" +
            " OR u.country = ?9")
    public Optional<List<TripulatedRocket>> filterTRShip(
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
