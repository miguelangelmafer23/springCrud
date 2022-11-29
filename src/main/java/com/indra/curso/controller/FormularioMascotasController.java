package com.indra.curso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.indra.curso.entidad.Mascota;
import com.indra.curso.modelo.GestorMascotas;
import com.indra.curso.persistencia.RepositorioMascotas;

@Controller
public class FormularioMascotasController {
	
	@Autowired
	RepositorioMascotas repositorioMascotas;
	
	@Autowired
	GestorMascotas gestorMascotas;
	
	
	public FormularioMascotasController() {
		super();
		
	}

	//Controller para seleccionar mascota por id ya existente en bbdd
	@GetMapping("/seleccionarMascota")
	public ModelAndView seleccionarMascota(@RequestParam("idMascota") Integer idMascota) {
		
		System.out.println("Seleccionar Mascota: "+idMascota);
		
		
		Mascota mascota = repositorioMascotas.findById(idMascota).orElse(new Mascota());
		
		ModelAndView mav = new ModelAndView("formularioMascotas");
		mav.addObject("mascota", mascota);
		return mav;
	}
	
	
	@GetMapping("/formularioMascotas")
	public ModelAndView verFormularioMascota() {
		ModelAndView mav = new ModelAndView("formularioMascotas");
		mav.addObject("mascota", new Mascota());		
		return mav;
	}
	
	@PostMapping("/insertarMascota")
	public ModelAndView insertarMascota(@ModelAttribute Mascota mascota) {
		
		//llamada a la logica de negocio
		gestorMascotas.insertar(mascota);

		//POST-REDIRECT-GET
		ModelAndView mav = new ModelAndView("redirect:listadoMascotas");
		return mav;
	}
	
	@PostMapping("/modificarMascota")
	public ModelAndView modificarMascota(@ModelAttribute Mascota mascota) {

		gestorMascotas.modificar(mascota);
		
		ModelAndView mav = new ModelAndView("redirect:listadoMascotas");
		return mav;
	}
	
	@PostMapping("/borrarMascota")
	public ModelAndView borrarMascota(@ModelAttribute Mascota mascota) {

		gestorMascotas.borrar(mascota);
		
		ModelAndView mav = new ModelAndView("redirect:listadoMascotas");
		return mav;
	}
	
	
	
	
}
