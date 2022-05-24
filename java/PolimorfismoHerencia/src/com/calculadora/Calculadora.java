package com.calculadora;

public class Calculadora {

	//atributos o propiedades
	private int a;
	private int b;
	private int c;
	private int r;
	
	//constructor
	public Calculadora(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public Calculadora(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
		
	}
	public Calculadora(int a, int b, int c, String nom) {
		this.a = a;
		this.b = b;
		this.c = c;
		
	}
	
	
	//metodos
	public void sumar(int a, int b) {
		r = a+b;
		System.out.println("El resultado de la suma es: " + r);
	
	}
	public void sumar(int a, int b, int c) {
		r=a+b+c;
		System.out.println("El resultado de la suma es: " + r);
	
	}
	
	
	//getters y setters

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	
	

}
