package com.habilidades.habilidades.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/habilidades")
public class HabilidadesController {
	
	@GetMapping
	public String hello() {
		return "Orientação aos detalhes, resposabilidade pessoal e persistência.";
	}
}
