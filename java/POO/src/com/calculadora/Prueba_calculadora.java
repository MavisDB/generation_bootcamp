package com.calculadora;

import java.util.Scanner;

public class Prueba_calculadora {

	public static void main(String[] args) {
		System.out.println("Vamos a calcular!");
		
		//Instanciar - Crear un objeto a partir de una clase
		Calculadora cal = new Calculadora();	
		
		//metodo que no retorna nada - void
		cal.sumarMensaje();
		
		
		//metodo que regresa valor
		String mensaje = cal.mensaje();
		System.out.println(mensaje);
		
		double prueba = cal.prueba();
		System.out.println(prueba);
		
		//metodos con argumentos
		int suma = cal.suma(10, 20);
		System.out.println(suma);
		
		cal.sumaM(8,10);
		int resta = cal.resta(8,1);
		System.out.println(resta);
		
		//instanciar
		Areas calAreas = new Areas();
		
		//metodo que no regresa nada - void
		calAreas.mensaje();
		
		//metodo con argumentos
		
	}
}
