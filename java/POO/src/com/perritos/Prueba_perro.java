package com.perritos;

public class Prueba_perro {

	public static void main(String[] args) {
		//instanciar
		Perro perro1 = new Perro("Patitas",3);
		Perro perro2 = new Perro("Cookies",1);
		
		
		//cambiar sus atributos
		perro1.raza = "husky";
		perro1.tamano = "mediano";
		
		perro2.raza = "Dalmata";
		perro2.tamano = "Grande";
		
	
		//metodo
		perro1.ladrar();
		
		int edadP = perro1.edadPerruna();
		System.out.println(edadP);
		
		perro2.ladrar();
		
		
		//metodos pubic static void no necesitamos hacer objeto
		perro1.mensaje();
		//perro apartir de objeto, asi se usan los staticos
		Perro.mensaje();
		
		
	}

}
