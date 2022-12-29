package com.example.spaceship.models.Entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "propeller")
@Setter
@Getter
@NoArgsConstructor
public class PropelledRocket extends Rocket{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idPropeller")
    private Integer id;

    @Column(name = "motorCount", nullable = false)
    private String contadorMotor;

    /*
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
    }*/
}