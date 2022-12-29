package com.example.spaceship.models.Repositories;

import com.example.spaceship.models.Entities.TripulatedRocket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TripulatedRocketRepo extends JpaRepository<TripulatedRocket, Integer> {

}
