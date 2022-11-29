package com.indra.curso.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;

import com.indra.curso.entidad.Propietario;

public interface RepositorioPropietarios extends JpaRepository<Propietario, Integer>{

}
