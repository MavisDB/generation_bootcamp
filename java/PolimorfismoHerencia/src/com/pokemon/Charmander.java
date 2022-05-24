package com.pokemon;

public class Charmander extends Pokemon implements TipoFuego, TipoVolador{

	
	public Charmander(int id, int edad, int nivel, String nom, boolean evolucion) {
		super(id, edad, nivel, nom, evolucion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void lanzallamas() {
		System.out.println(getNom() + " esta usando lanzallamas");
	}

	@Override
	public void aranar() {
		System.out.println(getNom() + " esta arañando");
	}
	
	@Override
	public void volar() {
		System.out.println(getNom() + " esta volando");
	}

	@Override
	public void saludar(String mensaje) {
		System.out.println("");
	}
	
}
