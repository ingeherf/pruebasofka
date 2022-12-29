package com.example.spaceship.models.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "propeller")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PropelledRocket extends Rocket{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpropeller")
    private Integer id;

    @Column(name = "motorcount", nullable = false)
    private String contadorMotor;

}
