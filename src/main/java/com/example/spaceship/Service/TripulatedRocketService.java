package com.example.spaceship.Service;

import com.example.spaceship.models.Entities.TripulatedRocket;
import com.example.spaceship.Repositories.TripulatedRocketRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

@Service
public class TripulatedRocketService implements IShipService<TripulatedRocket>{

    @Autowired
    private TripulatedRocketRepo tripulatedRocketRepo;

    @Override
    public void newShip(TripulatedRocket rocket) {
        Optional<List<TripulatedRocket>> data = tripulatedRocketRepo.findByName(rocket.getName());
        if(data.get().isEmpty()) {
            tripulatedRocketRepo.save(rocket);
        }
    }

    @Override
    public List<TripulatedRocket> getAllShipsNoDeleted(Date date) {
        List<TripulatedRocket> data = tripulatedRocketRepo.findByEliminado(date).get();
        return data;
    }

    @Override
    public List<TripulatedRocket> getFilterResults(
            Integer id,
            String name,
            Double speed,
            Double weight,
            Double height,
            Double loadWeight,
            Double totalDistance,
            String company,
            String country,
            Date eliminado)
    {
        List<TripulatedRocket> data = tripulatedRocketRepo.filterTRShip(id, name, speed, weight, height, loadWeight, totalDistance, company, country, eliminado).get();
        return data;
    }
}
