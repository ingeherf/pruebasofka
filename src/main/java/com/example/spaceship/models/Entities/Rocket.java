package com.example.spaceship.models.Entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
public class Rocket {

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "maximumSpeed", nullable = false)
    private Double speed;

    @Column(name = "weight", nullable = false)
    private Double weight;

    @Column(name = "height", nullable = false)
    private Double height;

    @Column(name = "loadWeight", nullable = false)
    private Double loadWeight;

    @Column(name = "acumulationDistance", nullable = false)
    private Double totalDistance;

    @Column(name = "company", nullable = false, length = 200)
    private String company;

    @Column(name = "country", nullable = false, length = 100)
    private String country;



    /**
     * Métodos que permitirán la modificación de la velocidad en caso que la nave esté activa.
     */
    //public abstract Double acelerar(int velocidad);
    //public abstract Double desacelerar(double velocidad);

}

