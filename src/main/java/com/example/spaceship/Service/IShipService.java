package com.example.spaceship.Service;

import com.example.spaceship.models.Entities.NoTripulatedRocket;
import org.springframework.stereotype.Service;

import java.sql.Date;
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
    public List<T> getAllShipsNoDeleted(Date date);

    /**
     * Generación de filtro teniendo en cuenta todos los datos que tienen en común
     * los diferentes tipos de naves espaciales.
     * @param id
     * @param name
     * @param speed
     * @param weight
     * @param height
     * @param loadWeight
     * @param totalDistance
     * @param company
     * @param country
     * @param eliminado
     * @return
     */
    public List<T> getFilterResults(
            Integer id,
            String name,
            Double speed,
            Double weight,
            Double height,
            Double loadWeight,
            Double totalDistance,
            String company,
            String country,
            Date eliminado
    );
}
