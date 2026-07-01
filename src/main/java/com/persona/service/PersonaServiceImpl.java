package com.persona.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.persona.modelo.Persona;
import com.persona.repository.PersonaRepository;

@Service
public class PersonaServiceImpl implements PersonaService{
	
	private PersonaRepository repository;

	public PersonaServiceImpl(PersonaRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public List<Persona> listarPersonas() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
