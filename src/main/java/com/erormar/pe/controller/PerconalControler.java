package com.erormar.pe.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.erormar.pe.model.Personal;
import com.erormar.pe.service.IPersonaService;

@Controller
public class PerconalControler {
	
	@Autowired
	private IPersonaService servicePersona;
	
	@GetMapping("/persona")
	public String tablaPersonal(Model model) {
		List<Personal>lista= servicePersona.buscarTodas();
		model.addAttribute("personal", lista);		
		return"tablaPersona";
	}
	
}
