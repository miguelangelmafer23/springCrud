package com.indra.curso.entidad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mascota {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String family;
	private Integer birthYear;
	private Boolean chip;
	
	
	public Mascota() {
		super();
		
	}

	public Mascota(Integer id, String name, String family, Integer birthYear, Boolean chip) {
		super();
		this.id = id;
		this.name = name;
		this.family = family;
		this.birthYear = birthYear;
		this.chip = chip;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFamily() {
		return family;
	}
	public void setFamily(String family) {
		this.family = family;
	}

	public Integer getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(Integer birthYear) {
		this.birthYear = birthYear;
	}


	public Boolean getChip() {
		return chip;
	}

	public void setChip(Boolean chip) {
		this.chip = chip;
	}


	@Override
	public String toString() {
		return "Mascota [id=" + id + ", name=" + name + ", family=" + family + ", birthYear=" + birthYear + ", chip="
				+ chip + "]";
	}


}
