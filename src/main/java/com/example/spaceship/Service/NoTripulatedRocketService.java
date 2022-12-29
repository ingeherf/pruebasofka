package com.example.spaceship.Service;

import com.example.spaceship.models.Entities.NoTripulatedRocket;
import com.example.spaceship.models.Repositories.NoTripulatedRocketRepo;
import com.example.spaceship.models.Repositories.PropellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
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


    /**
     * Toma en cuenta un nodo de tipo NoTripulateRocket para verificar si este se encuentra
     * registrado en la base de datos teniendo como parámetro su nombre. En caso de no
     * ser encontrado, se agrega a la base de datos.
     * @param newShip
     */
    @Override
    public void newShip(NoTripulatedRocket newShip) {
        Optional<List<NoTripulatedRocket>> data = noTripulatedRocketRepo.findByName(newShip.getName());
        if(data.get().isEmpty()) {
            noTripulatedRocketRepo.save(newShip);
        }
    }

    /**
     * Método que conecta el repositorio con el controlador para mostrar a las naves no tripuladas que
     * no han sido eliminadas.
     * @return
     */
    @Override
    public List<NoTripulatedRocket> getAllShipsNoDeleted(Date date) {
        List<NoTripulatedRocket> data = noTripulatedRocketRepo.findByEliminado(date).get();
        return data;
    }

    @Override
    public List<NoTripulatedRocket> getFilterResults(
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
        List<NoTripulatedRocket> data = noTripulatedRocketRepo.filterNTRShip(id, name, speed, weight, height, loadWeight, totalDistance, company, country, eliminado).get();
        return data;
    }


}
