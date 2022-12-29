package com.example.spaceship.models.Repositories;

import com.example.spaceship.models.Entities.Rocket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface rocketRepository extends JpaRepository<Rocket, Integer> {

}
