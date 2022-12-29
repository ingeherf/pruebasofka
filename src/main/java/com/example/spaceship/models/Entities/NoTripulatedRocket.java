package com.example.spaceship.models.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * Entidad de naves no tripuladas. Se tiene en cuenta la ID
 */
@Entity
@Table(name = "notripulated")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class NoTripulatedRocket extends Rocket{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idnotripulated")
    private Integer id;



}
