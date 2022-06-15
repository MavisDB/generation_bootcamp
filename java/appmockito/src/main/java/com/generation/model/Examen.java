package com.generation.model;

import java.util.ArrayList;
import java.util.List;

public class Examen {
	private Long id;
	private String nom;
	private List<String> preguntas;
	
	public Examen() {
	
		
	}
	
	public Examen(Long id, String nom) {
		this.id = id;
		this.nom = nom ;
		this.preguntas = new ArrayList<>();
	}
	
	//Setters y Getters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<String> getPreguntas() {
		return preguntas;
	}

	public void setPreguntas(List<String> preguntas) {
		this.preguntas = preguntas;
	}
}
