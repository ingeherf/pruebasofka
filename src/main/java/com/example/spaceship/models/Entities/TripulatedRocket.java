package com.example.spaceship.models.Entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tripulated")
@Setter
@Getter
@NoArgsConstructor
public abstract class TripulatedRocket extends Rocket{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idTripulated")
    private Integer id;

    @Column(name = "astronautCounter")
    private String astronautasABordo;


    public Double desacelerar(double velocidad, boolean menos0) {
        if (!menos0) {
            setSpeed(0.0);
        }
        else {
            setSpeed(getSpeed() - velocidad);
        }
        return getSpeed();
    }

    @Override
    public Double acelerar(int velocidad) {
        setSpeed(getSpeed() + velocidad);
        return getSpeed();
    }

    @Override
    public Double desacelerar(double velocidad) {
        return (getSpeed() - velocidad <= 0)? 0: desacelerar(velocidad, false);
    }
}
