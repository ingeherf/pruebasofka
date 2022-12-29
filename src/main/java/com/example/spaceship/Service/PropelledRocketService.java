package com.example.spaceship.Service;

import com.example.spaceship.models.Entities.PropelledRocket;
import com.example.spaceship.models.Repositories.PropellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropelledRocketService implements IShipService<PropelledRocket>{
    @Autowired
    private PropellerRepository propellerRepository;

    @Override
    public void newShip(PropelledRocket rocket) {
        //En caso que esté vacía la lista significa que este es una nueva nave.
        propellerRepository.save(rocket);

    }

    @Override
    public List<PropelledRocket> getAllShipsNoDeleted() {
        return null;
    }
}
