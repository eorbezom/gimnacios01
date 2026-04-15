package com.erormar.pe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/persona")
public class DetalleController {
	
	
	@GetMapping("/delete")
	public String borrar(@RequestParam("id") int idPersona, Model model) {
		System.out.println("Se eliminoó el id: "+idPersona);
		model.addAttribute("id", idPersona);
		
		return"mensaje";
	}
	
	@GetMapping("/view/{id}")
	public String verPersona(@PathVariable("id") int IdPersona, Model model) {
		System.out.println("El id que estas buscando es: "+IdPersona);
		model.addAttribute("idPersona", IdPersona);
		return"detalle";
	}
	
	
	
	
	
	
	
	

}
