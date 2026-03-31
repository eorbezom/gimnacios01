package com.erormar.pe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/persona")
public class DetalleController {
	
	
	@GetMapping("/view/{id}")
	public String verPersona(@PathVariable("id") int IdPersona, Model model) {
		System.out.println("El id que estas buscando es: "+IdPersona);
		model.addAttribute("idPersona", IdPersona);
		return"detalle";
	}
	
	
	
	
	
	
	
	

}
