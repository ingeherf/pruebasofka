package com.example.spaceship.models.Entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "notripulated")
@Setter
@Getter
public class NoTripulatedRocket extends Rocket{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idnotripulated")
    private Integer id;



}
