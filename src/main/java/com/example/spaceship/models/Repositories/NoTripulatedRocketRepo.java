package com.example.spaceship.models.Repositories;

import com.example.spaceship.models.Entities.NoTripulatedRocket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoTripulatedRocketRepo extends JpaRepository<NoTripulatedRocket, Integer> {

}
