package com.indra.curso.modelo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.indra.curso.entidad.Propietario;
import com.indra.curso.persistencia.RepositorioPropietarios;

@Service
public class GestorPropietarios {

	@Autowired
	RepositorioPropietarios repositorioPropietarios;

	public GestorPropietarios() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void insertar(Propietario propietario) {
	
		repositorioPropietarios.save(propietario);
	}
	
	@Transactional
	public void modificar(Propietario propietario) {
		//LN...

		repositorioPropietarios.save(propietario);
	}
	
	@Transactional
	public void borrar(Propietario propietario) {
		//LN...

		repositorioPropietarios.delete(propietario);
	}		
}
