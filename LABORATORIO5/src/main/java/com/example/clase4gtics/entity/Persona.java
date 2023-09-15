package com.example.clase4gtics.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "persona")

public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPersona")
    private int idPersona;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "dni")
    private String dni;

    @Column(name = "celular")
    private String celular;

    @Column(name = "tipo_persona")
    private String tipo_persona;

}
