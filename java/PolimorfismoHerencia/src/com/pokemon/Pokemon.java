package com.pokemon;

public class Pokemon {
	//atributos
	private  int id;
	private  int edad;
	private  int nivel;
	protected  String nom;
	private  boolean evolucion;
	
	//constructor
	public Pokemon(int id, int edad, int nivel, String nom, boolean evolucion) {
		this.id = id;
		this.edad = edad;
		this.nivel = nivel;
		this.nom = nom;
		this.evolucion = evolucion;
	}
	//metodos
	public void comer() {
		System.out.println(nom + " esta comiendo");
	}
	public void atacar() {
		System.out.println(nom + " esta atacando");
	}
	public void dormir() {
		System.out.println(nom + " zzzzzZZZZ");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public boolean isEvolucion() {
		return evolucion;
	}
	public void setEvolucion(boolean evolucion) {
		this.evolucion = evolucion;
	}
	
}
