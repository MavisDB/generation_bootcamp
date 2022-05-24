package com.pokemon;

public class Chikorita extends TipoPlanta{
	
	//atributos especificos
	private int numCuernitos;
	
	//constructor
	public Chikorita(int id, int edad, int nivel, String nom, boolean evolucion, int numHojas, int numCuernitos) {
		super(id,edad, nivel, nom, evolucion,numHojas);
		this.numCuernitos = numCuernitos;
	}
	
	//metodo especifico
	public void latigo() {
		System.out.println(getNom() + " latigazo");
	}
	
	public void atacar() {
		System.out.println(getNom() + " tipo planta esta atacando x2");
	}

	//getters y setters
	public int getNumCuernitos() {
		return numCuernitos;
	}

	public void setNumCuernitos(int numCuernitos) {
		this.numCuernitos = numCuernitos;
	}

	@Override
	public String toString() {
		return "Chikorita [numCuernitos=" + numCuernitos + "]";
	}
	
	
	
}
