package com.example.spaceship.models.Entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "notripulated")
@Setter
@Getter
@NoArgsConstructor
public abstract class NoTripulatedRocket extends Rocket{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idNoTripulated")
    private Integer id;

    @Override
    public String toString() {
        return "This is the no tripullated rocket info: "
                + "\n" + getName()
                + "\n" + getCountry()
                + "\n" + getCompany();


    }

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
