package com.indra.curso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.indra.curso.persistencia.RepositorioPropietarios;

@Controller
public class ListadoPropietariosController {

	
	@Autowired
	private RepositorioPropietarios repositorioPropietarios;

	public ListadoPropietariosController() {
		super();
		
	}

	@GetMapping(path = "/listadoPropietarios")
	public ModelAndView verListadoPropietarios() {
		ModelAndView mav = new ModelAndView("listadoPropietarios");
		mav.addObject("listaPropietarios", repositorioPropietarios.findAll());
		return mav;
	}	
}
