package com.example.spaceship.models.Entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

/**
 * La clase Rocket es la clase Padre de los diferentes cohetes.
 * Dado a que se está referenciando unas columnas a través del JPA,
 * es necesario usar la anotación @MappedSuperClass. Cómo su nombre lo indica,
 * mapea los datos de un conjunto de atributos que hay en común entre cierto grupo de tablas.
 * Además, se utiliza la librería Lombok para evitar escribir los Setter y Getter de los atributos
 * y el constructor que solo inicializa esta clase.
 */
@MappedSuperclass
@Setter
@Getter
@NoArgsConstructor
public class Rocket {

    @Column(name = "name", nullable = false, length = 100)
    protected String name;

    @Column(name = "maximumspeed", nullable = false)
    protected Double speed;

    @Column(name = "weight", nullable = false)
    protected Double weight;

    @Column(name = "height", nullable = false)
    protected Double height;

    @Column(name = "loadweight", nullable = false)
    protected Double loadWeight;

    @Column(name = "acumulateddistance", nullable = false)
    protected Double totalDistance;

    @Column(name = "company", nullable = false, length = 200)
    protected String company;

    @Column(name = "country", nullable = false, length = 100)
    protected String country;

    @Column(name = "active", nullable = false)
    protected boolean activo;

    @Column(name = "deleted")
    protected Date eliminado;


}

