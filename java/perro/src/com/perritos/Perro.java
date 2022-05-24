package com.perritos;

public class Perro {
	
	//atributos o propiedades
	String nom;
	int edad;
	String raza;
	String tamano;
	
	//constructor
	public Perro(String nom, int edad) {
			this.nom = nom;
			this.edad = edad;
	}
	
	//metodo
	public void ladrar(){
		System.out.println("El perro " + nom + " hace GUAUF!");
	}
	public int edadPerruna(){
		return edad * 7;
	}
	
	//metodo estatico
	public static void mensaje() {
		System.out.println("Esta es una clase Perro");
	}

}
