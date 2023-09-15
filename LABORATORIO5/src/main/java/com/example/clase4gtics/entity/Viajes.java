package com.example.clase4gtics.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "viajes")

public class Viajes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idViajes")
    private int idViajes;

    @Column(name = "punto_recojo")
    private String punto_recojo;

    @Column(name = "cant_personas")
    private String cant_personas;

    @Column(name = "cant_perros")
    private String cant_perros;

    @ManyToOne
    @JoinColumn (name = "Persona_idPersona")
    private Persona persona;

    @ManyToOne
    @JoinColumn (name = "Lugares_idLugares")
    private Lugares lugares;

}
