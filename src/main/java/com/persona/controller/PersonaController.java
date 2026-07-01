package com.persona.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.persona.modelo.Persona;
import com.persona.service.PersonaService;

@RestController
@RequestMapping("/persona/api/v1")
public class PersonaController {
	
	private final PersonaService personaService;

	public PersonaController(PersonaService personaService) {
		super();
		this.personaService = personaService;
	}
	
	@GetMapping("/listar")
	public ResponseEntity<List<Persona>> listarAllPersonas(){
		List<Persona> personas = personaService.listarPersonas();
		return ResponseEntity.ok(personas);
	}

}
