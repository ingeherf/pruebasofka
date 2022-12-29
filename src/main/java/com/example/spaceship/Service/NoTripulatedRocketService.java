package com.example.spaceship.Service;

import com.example.spaceship.models.Entities.NoTripulatedRocket;
import com.example.spaceship.models.Entities.Rocket;
import com.example.spaceship.models.Repositories.NoTripulatedRocketRepo;
import com.example.spaceship.models.Repositories.rocketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoTripulatedRocketService {


    @Autowired
    private NoTripulatedRocketRepo noTripulatedRocketRepo;
    private rocketRepository rocket;

    public void add(NoTripulatedRocket data) {
        if (rocket.findById(data.getIdRocket()).isEmpty()) {
            //En caso que no se encuentre en la base de datos.
            noTripulatedRocketRepo.save(data);
        }
    }

    public List<NoTripulatedRocket> getAll() {
        return noTripulatedRocketRepo.findAll();
    }

}
