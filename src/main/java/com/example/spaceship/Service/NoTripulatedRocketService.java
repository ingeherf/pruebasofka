package com.example.spaceship.Service;

import com.example.spaceship.models.Entities.NoTripulatedRocket;
import com.example.spaceship.models.Repositories.NoTripulatedRocketRepo;
import com.example.spaceship.models.Repositories.PropellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
/**
 * Este servicio permitirá la utilización del repositorio JpaRepository
 * teniendo en cuenta la base de datos spaceship en la tabla NoTripullated.
 */
public class NoTripulatedRocketService implements IShipService<NoTripulatedRocket>{

    
    @Autowired
    private NoTripulatedRocketRepo noTripulatedRocketRepo;



    @Override
    public void newShip(NoTripulatedRocket newShip) {
        noTripulatedRocketRepo.save(newShip);
    }

    @Override
    public List<NoTripulatedRocket> getAllShipsNoDeleted() {
        return noTripulatedRocketRepo.getNoDeletedRockets();
    }
}
