package com.calculadora;

public class Calculadora {
	
	//Metodo que no regresa nada - VOID
	public void sumarMensaje() {
		System.out.println("Sumar");
	}
	
	//Metodo que retorna datos
	public String mensaje() {
		String mensaje = "Realizar operacion";
		return mensaje;
	}
	
	public double prueba() {
		return 2.5;
	}
	
	//Operaciones
	public int suma(int n1, int n2) {
		return n1+n2;
	}
	
	public void sumaM(int n1,int n2) {
		System.out.println("El resultado de la suma es: ");
	}
	
	public int resta(int n1, int n2) {
		return n1-n2;
	}
	
	public int mult(int n1, int n2) {
		return n1*n2;
	}
	
	public double div(int n1, int n2) {
		return n1/n2;
	}

}
