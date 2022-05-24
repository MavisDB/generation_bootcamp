package com.pokemon;

public class Main {

	public static void main(String[] args) {
		Pokemon chikorita = new Pokemon(152,1,20,"Chikorita", false);
		
		//Utilizando metodos de instancia
		chikorita.comer();
		chikorita.atacar();
		chikorita.dormir();
		System.out.println("* ---------------------------- *");
		
		TipoPlanta chikorita2 = new TipoPlanta(152,1,20,"Chikorita2", false,7);
		chikorita2.comer();
		chikorita2.atacar();
		chikorita2.dormir();
		chikorita2.envenenar();
		chikorita2.paralizar();
		

	}

}
