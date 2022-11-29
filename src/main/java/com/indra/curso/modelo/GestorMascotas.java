package com.indra.curso.modelo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.indra.curso.entidad.Mascota;
import com.indra.curso.persistencia.RepositorioMascotas;

@Service
public class GestorMascotas {

	
	@Autowired
	RepositorioMascotas repositorioMascotas;

	public GestorMascotas() {
		super();
		
	}
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void insertar(Mascota mascota) {
	
		repositorioMascotas.save(mascota);
	}
	
	@Transactional
	public void modificar(Mascota mascota) {
		//LN...

		repositorioMascotas.save(mascota);
	}
	
	@Transactional
	public void borrar(Mascota mascota) {
		//LN...

		repositorioMascotas.delete(mascota);
	}		
	
}
