package com.pokemon;

public class TipoPlanta extends Pokemon {
	//atributos
	private int numHojas;
	
	//constructor
	public TipoPlanta(int id, int edad, int nivel, String nom, boolean evolucion, int numHojas) {
		super(id,edad, nivel, nom, evolucion);
		this.numHojas = numHojas;
		
	}
	//metodos
	public void paralizar() {
		System.out.println(getNom() + " esta paralizando");
		
	}
	public void envenenar() {
		System.out.println(getNom() + " esta envenenando");
	}
	public int getNumHojas() {
		return numHojas;
	}
	public void setNumHojas(int numHojas) {
		this.numHojas = numHojas;
	}
	
	

}
