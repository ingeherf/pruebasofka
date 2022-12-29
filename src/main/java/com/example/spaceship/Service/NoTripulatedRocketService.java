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
public class NoTripulatedRocketService {

    
    @Autowired
    private NoTripulatedRocketRepo noTripulatedRocketRepo;
    @Autowired
    private PropellerRepository rocket;

    /**
     * Método para agregar una nueva nave no tripulada
     * @param newRocket
     */
    public void addNewShip(NoTripulatedRocket newRocket) {
        if (noTripulatedRocketRepo.findById(newRocket.getId()).isEmpty()) {
            noTripulatedRocketRepo.save(newRocket);
        }
    }


    public List<NoTripulatedRocket> getAll() {
        return noTripulatedRocketRepo.findAll();
    }

    public String getInfo(int id) {
        return noTripulatedRocketRepo.findById(id).toString();
    }
}
