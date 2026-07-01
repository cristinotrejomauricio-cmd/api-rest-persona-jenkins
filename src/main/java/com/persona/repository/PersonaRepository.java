package com.persona.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.persona.modelo.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Integer>{
	

}
