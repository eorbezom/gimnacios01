package com.erormar.pe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.erormar.pe.model.Personal;
import com.erormar.pe.service.IPersonaService;

@Controller
@RequestMapping("/persona")
public class DetalleController {
	
	@Autowired
	private IPersonaService servicePersona;
	
	@GetMapping("/delete")
	public String borrar(@RequestParam("id") int idPersona, Model model) {
		System.out.println("Se eliminoó el id: "+idPersona);
		model.addAttribute("id", idPersona);
		
		return"mensaje";
	}
	
	@GetMapping("/view/{id}")
	public String verPersona(@PathVariable("id") int IdPersona, Model model) {
		Personal personal = servicePersona.buscarId(IdPersona);
		
		System.out.println("El id : "+personal);
		model.addAttribute("personal", personal);
		return"detalle";
	}
	
	
	
	
	
	
	
	

}
