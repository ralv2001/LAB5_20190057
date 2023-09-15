package com.example.clase4gtics.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "mascotas")

public class Mascotas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMascotas")
    private int idMascotas;

    @Column(name = "nombre_mascota")
    private String nombre_mascota;

    @Column(name = "genero")
    private String genero;

    @Column(name = "edad")
    private String edad;

    @Column(name = "fecha_nacimiento")
    private String fecha_nacimiento;

    @Column(name = "Vacunado")
    private String Vacunado;

    @Column(name = "Desparasitado")
    private String Desparasitado;

    @ManyToOne
    @JoinColumn (name = "Persona_idPersona")
    private Persona persona;
}
