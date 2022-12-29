package com.example.spaceship.Service;

import com.example.spaceship.models.Entities.NoTripulatedRocket;

import java.util.List;

public abstract class ShipService<T> {

    public abstract void newShip(T newShip);
    public abstract List<T> getAllShipsNoDeleted();

    public abstract void addNewShip(NoTripulatedRocket newRocket);
}
