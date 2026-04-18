package com.erormar.pe.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.erormar.pe.model.Personal;

@Service
public class PersonaServiceImpl implements IPersonaService{

	private IPersonaService servicePersona;
	
	private List<Personal> lista = null;
	
	public PersonaServiceImpl() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		lista = new LinkedList<Personal>();
		
		try {
			Personal personal1 =new Personal();
			personal1.setId(1);
			personal1.setNombre("Ermeniildo");
			personal1.setApellidos("Orbezo Martinez");
			personal1.setDni(47076286);
			personal1.setfNacimiento(sdf.parse("09-03-1991"));
			personal1.setfIngreso(sdf.parse("01-01-2026"));
			personal1.setImagen("foto1.jpg");
			personal1.setTipoTrabajador("PRESIDENTE FUNDADOR");
			personal1.setSueldo(170000.00);
			personal1.setEstado(false);
			
			Personal personal2 =new Personal();
			personal2.setId(2);
			personal2.setNombre("Larry Bill");
			personal2.setApellidos("Orbezo Ramirez");
			personal2.setDni(74105625);
			personal2.setfNacimiento(sdf.parse("14-02-2016"));
			personal2.setfIngreso(sdf.parse("01-01-2026"));
			personal2.setImagen("foto2.png");
			personal2.setTipoTrabajador("GERENTE OPERACIONES");
			personal2.setSueldo(2000.00);
			personal2.setEstado(false);
			
			Personal personal3 =new Personal();
			personal3.setId(3);
			personal3.setNombre("Anonimus");
			personal3.setApellidos("Sin apellidos");
			personal3.setDni(45612312);
			personal3.setfNacimiento(sdf.parse("19-09-2026"));
			personal3.setfIngreso(sdf.parse("01-01-2026"));
			personal3.setEstado(true);
			personal3.setTipoTrabajador("administracion");
			personal3.setSueldo(1300.00);
			
			
			lista.add(personal1);
			lista.add(personal2);
			lista.add(personal3);
			
			
		} catch (ParseException e) {
			System.out.println("Error: "+e.getMessage());
		}
		
	}
	
	@Override
	public List<Personal> buscarTodas() {
		return lista;
	}

	@Override
	public Personal buscarId(Integer idPersonal) {
		for (Personal p: lista) {
			if(p.getId()==idPersonal) {
				return p;
			}
		}
		return null;
	}
	
}
