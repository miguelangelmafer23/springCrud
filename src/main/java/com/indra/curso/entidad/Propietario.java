package com.indra.curso.entidad;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Propietario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String surname;
	private String email;
	private Integer phone;
	private ArrayList<Mascota> mascotas;
	
	public Propietario() {
		super();
	}
	

	public Propietario(Integer id, String name, String surname, String email, Integer phone,
			ArrayList<Mascota> mascotas) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.phone = phone;
		this.mascotas = mascotas;
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

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public ArrayList<Mascota> getMascotas() {
		return mascotas;
	}

	public void setMascotas(ArrayList<Mascota> mascotas) {
		this.mascotas = mascotas;
	}

	@Override
	public String toString() {
		return "Propietario [id=" + id + ", name=" + name + ", surname=" + surname + ", email=" + email + ", phone="
				+ phone + ", mascotas=" + mascotas + "]";
	}
	
}
