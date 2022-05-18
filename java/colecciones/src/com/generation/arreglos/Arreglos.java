package com.generation.arreglos;

import java.util.Arrays;

public class Arreglos {

	public static void main(String[] args) {
		//Matrices / arreglos / array 
		
		/*
		 * numero - 0  
		 * string - null
		 * booleanos - false*/
		
		int[] arrNum = new int[5];
		
		//num basada en 0
		arrNum[0] = 1;
		arrNum[1] = Integer.parseInt("1");
		arrNum[2] = 1323;
		arrNum[3] = 21;
		arrNum[4] = 23213;
		

		System.out.println(Arrays.toString(arrNum));
		
		for(int i=0; i<arrNum.length; i++) {
			System.out.println(arrNum[i]);
		}
		
		//forEach se ejecita por cada uno de loos elemento, no le especificamos
		// num de iteraciones tomando en cuenta los elementos
		int conteo = 0;
		for(int elemento : arrNum) {
			conteo++;
			System.out.println("Elemento" + conteo + " = " + elemento);
			
		}
		
		//Arreglo que guarda objetos
		Persona persona1 = new Persona("Bruno",26);
		Persona persona2 = new Persona("David",17);
		
		//variable de arreglo con [] forma valida pero si se puede hacer
		//Object arrPersona[] = new Object[3];
		//Dan el resultado pero esta es la mejor opcion
		Persona arrPersonas[] = new Persona[3];
		arrPersonas[0] = persona1;
		arrPersonas[1] = persona2;
		arrPersonas[2] = new Persona("Ethan", 12);
		
		//Unobjeto java no lo puedo guardar dentro de la variable
		//guarda las regerencias de ese objeto
		System.out.println(Arrays.toString(arrPersonas));
		
		for(Persona e : arrPersonas) {
			System.out.println(e.nom + " | Edad: " + e.edad);
		}
		
		//Arreglos literales
		String []arrString = {"Hola", "mi", "nombre", "es"};
		System.out.println(Arrays.toString(arrString));
		

		
		
	}

}
