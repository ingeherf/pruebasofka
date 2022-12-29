package com.example.spaceship.Service;

import com.example.spaceship.models.Entities.NoTripulatedRocket;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Dado que debemos aplicar polimorfismo, en Spring Framework una forma de aplicar esto
 * es agregando la anotación @Service.
 */
@Service
public interface IShipService<T> {
    /**
     * Agrega una nueva nave (Generica)
     * @param newShip
     */
    public void newShip(T newShip);

    /**
     * Obtiene todas los cohetes que no han recibido una eliminación lógica.
     * @return List<T> or an empty list.
     */
    public List<T> getAllShipsNoDeleted();

}
