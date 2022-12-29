package com.example.spaceship.models.Repositories;

import com.example.spaceship.models.Entities.NoTripulatedRocket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoTripulatedRocketRepo extends JpaRepository<NoTripulatedRocket, Integer> {

    @Query(value = "SELECT * FROM NoTripulatedRocket p WHERE p.eliminado IS NULL",
    nativeQuery = true)
    public List<NoTripulatedRocket> getNoDeletedRockets();
}
