package com.example.spaceship.Service;

import com.example.spaceship.models.Entities.TripulatedRocket;
import com.example.spaceship.models.Repositories.TripulatedRocketRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TripulatedRocketService implements IShipService<TripulatedRocket>{

    @Autowired
    private TripulatedRocketRepo tripulatedRocketRepo;

    @Override
    public void newShip(TripulatedRocket rocket) {
        tripulatedRocketRepo.save(rocket);
    }

    @Override
    public List<TripulatedRocket> getAllShipsNoDeleted() {
        return null;
    }


}
