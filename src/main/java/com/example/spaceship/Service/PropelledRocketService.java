package com.example.spaceship.Service;

import com.example.spaceship.models.Entities.NoTripulatedRocket;
import com.example.spaceship.models.Entities.PropelledRocket;
import com.example.spaceship.models.Entities.TripulatedRocket;
import com.example.spaceship.models.Repositories.PropellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

@Service
public class PropelledRocketService implements IShipService<PropelledRocket>{

    @Autowired
    private PropellerRepository propellerRepository;

    @Override
    public void newShip(PropelledRocket rocket) {
        //En caso que esté vacía la lista significa que este es una nueva nave.
        Optional<List<PropelledRocket>> data = propellerRepository.findByName(rocket.getName());
        if(data.get().isEmpty()) {
            propellerRepository.save(rocket);
        }

    }

    @Override
    public List<PropelledRocket> getAllShipsNoDeleted(Date date) {
        List<PropelledRocket> data = propellerRepository.findByEliminado(date).get();
        return data;
    }

    @Override
    public List<PropelledRocket> getFilterResults(Integer id, String name, Double speed, Double weight, Double height, Double loadWeight, Double totalDistance, String company, String country, Date eliminado) {
        List<PropelledRocket> data = propellerRepository.filterPShip(id, name, speed, weight, height, loadWeight, totalDistance, company, country, eliminado).get();
        return data;
    }

}
