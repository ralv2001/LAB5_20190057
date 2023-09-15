package com.example.clase4gtics.repository;

import com.example.clase4gtics.entity.Mascotas;
import com.example.clase4gtics.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer> {
}


