package com.generation.colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Colecciones {
	public static void main(String[] args) {
		
		//List - ArrayList
		//picoparentesis
		System.out.println("\tList --- ArrayList");
		List<String> miArray = new ArrayList<String>();
		miArray.add("Bruno");
		miArray.add("David");
		miArray.add("Elian");		
		miArray.add(1, "Raquel");
		
		String elemento = miArray.remove(1);
	 	
		System.out.println(miArray);
		System.out.println(miArray.size()); //lenght
		System.out.println(elemento);
		
		//Al usar un metodo static
		//Se puede omitir el nombre de clase al inicio
		//coleciones porque se encuentra en la misma
		//Colecciones.imprimir(miArray);
		//instrucciones dentro del main
		imprimir(miArray);
		
		/* Primitivo / compuesto
		 * Dato simple que maneja el lenguaje JAVA
		 * Se crea objeto o nos permite utilizar 
		 * metos que contienen clases
		 * long / Long
		 * double / Double
		 * boolean / Bloolean
		 * integer / Integer
		 */
		int num1 = 10;
		Integer num2 = 10;
		System.out.println(num2.getClass());
		
		List<Integer> miArray2 = new ArrayList<Integer>();
		
		miArray2.add(3);
		miArray2.add(2332);
		miArray2.add(3246);
		
		imprimir(miArray2);
		

		System.out.println("\tSet --- HashSet");
		Set<String> miSet = new HashSet<String> ();
		//no acepta elementos duplicados
		//no los guatda en un orden especifico
		//La coleccion que funciona mas rapido
		miSet.add("Bruno");
		miSet.add("Bruno");
		miSet.add("Bruno");
		miSet.add("Daniela");
		miSet.add("Elian");

		System.out.println(miSet);
		imprimir(miSet);
		miSet.remove("Daniela");
		System.out.println(miSet.contains("Daniela"));
		
		//Map -- HashMap -- Indice
		//<Key/llave, value/valor
		System.out.println("\t Map --- HashMap");
		Map<String, Integer> miMap = new HashMap<String, Integer>();
		miMap.put("Valor 1", 45);
		miMap.put("Valor 1", 80);
		miMap.put("Valor 2", 60);
		miMap.put("Valor 3", 97);
		miMap.put("Valor 4", 21);
		
		System.out.println(miMap);
		System.out.println(miMap.values()); //todos los valoresw
		System.out.println(miMap.keySet()); //todas las llaves
		System.out.println(miMap.get("Valor 1"));
		
		for(String llave : miMap.keySet()) {
			System.out.println(llave + " : " + miMap.get(llave));
		}
	
	}
	
	public static void imprimir (Collection coleccion) {
		for(Object elemento : coleccion) {
			System.out.println("Elemento = " + elemento);
		}
	}

}
