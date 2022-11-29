package com.indra.curso.persistencia;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.indra.curso.entidad.Mascota;

@Repository
public interface RepositorioMascotas extends JpaRepository<Mascota, Integer> {
	
	@Query("select m from Mascota m where family=:family")
	List<Mascota> findByFamily(@Param("family") String family);

}
