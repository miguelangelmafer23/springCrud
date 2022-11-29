package com.indra.curso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.indra.curso.entidad.Propietario;
import com.indra.curso.modelo.GestorPropietarios;
import com.indra.curso.persistencia.RepositorioPropietarios;

@Controller
public class FormularioPropietariosController {

	@Autowired
	RepositorioPropietarios repositorioPropietarios;
	
	@Autowired
	GestorPropietarios	gestorPropietarios;

	public FormularioPropietariosController() {
		super();
	}
	
	@GetMapping("/seleccionarPropietario")
	public ModelAndView seleccionarPropietario(@RequestParam("idPropietario") Integer idPropietario) {
		
		System.out.println("Seleccionar Propietario: "+idPropietario);
		
		
		Propietario propietario = repositorioPropietarios.findById(idPropietario).orElse(new Propietario());
		
		ModelAndView mav = new ModelAndView("formularioPropietarios");
		mav.addObject("propietario", propietario);
		return mav;
	}
	
	@GetMapping("/formularioPropietarios")
	public ModelAndView verFormularioPropietario() {
		ModelAndView mav = new ModelAndView("formularioPropietarios");
		mav.addObject("propietario", new Propietario());		
		return mav;
	}
	
	@PostMapping("/insertarPropietario")
	public ModelAndView insertarMascota(@ModelAttribute Propietario propietario) {
		
		//llamada a la logica de negocio
		gestorPropietarios.insertar(propietario);

		//POST-REDIRECT-GET
		ModelAndView mav = new ModelAndView("redirect:listadoPropietarios");
		return mav;
	}
	
	@PostMapping("/modificarPropietario")
	public ModelAndView modificarPropietario(@ModelAttribute Propietario propietario) {

		gestorPropietarios.modificar(propietario);
		
		ModelAndView mav = new ModelAndView("redirect:listadoPropietarios");
		return mav;
	}
	
	@PostMapping("/borrarPropietario")
	public ModelAndView borrarPropietario(@ModelAttribute Propietario propietario) {

		gestorPropietarios.borrar(propietario);
		
		ModelAndView mav = new ModelAndView("redirect:listadoPropietarios");
		return mav;
	}
}
