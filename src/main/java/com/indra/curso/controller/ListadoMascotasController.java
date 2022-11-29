package com.indra.curso.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.indra.curso.persistencia.RepositorioMascotas;

@Controller
public class ListadoMascotasController {

	@Autowired
	private RepositorioMascotas repositorioMascotas;

	public ListadoMascotasController() {
		super();
		
	}
	
	@GetMapping(path = "/listadoMascotas")
	public ModelAndView verListadoMascotas() {
		ModelAndView mav = new ModelAndView("listadoMascotas");
		mav.addObject("listaMascotas", repositorioMascotas.findAll());
		return mav;
	}	
	
	@GetMapping(path = "/listadoFamily")
	public ModelAndView listadoFiltradoMascotas(@RequestParam("family") String family) {
		ModelAndView mav = new ModelAndView("listadoFiltroMascotas");
		mav.addObject("listaFiltroMascotas", repositorioMascotas.findByFamily(family));
		return mav;
	}	

}
