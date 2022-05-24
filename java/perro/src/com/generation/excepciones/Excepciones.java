package com.generation.excepciones;

public class Excepciones {

	public static void main(String[] args) {
		int num1 = 10;
		Integer num2 = null;
		
		float div;
		
		//try catch finally
		try {
			//codigo que vamos a probar
			div = num1/num2;
		}catch(ArithmeticException ex) { //la excepcion a observar
			//lo que se va a realizar cuando se detecte una excepcion
			div = 0.0f;
			System.out.println("Error: " + ex.getMessage());
		
		}catch(NullPointerException ex){
			div = 0.0f;
			System.out.println("Error: " + ex.getMessage());
		} finally {
			System.out.println("Finalizo el try catch");
		}

	}

}
