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
public class TripulatedRocket extends Rocket{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtripulated")
    private Integer id;

    @Column(name = "astrounautcounter")
    private int astronautasABordo;


}
