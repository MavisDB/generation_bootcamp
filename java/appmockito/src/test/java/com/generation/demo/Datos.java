package com.generation.demo;

import java.util.Arrays;
import java.util.List;

import com.generation.model.Examen;

public class Datos {
	public final static List<Examen> EXAMENES = Arrays.asList(new Examen(1L, "Historia"),
			new Examen(2L,"Matematicas"),
			new Examen(3L,"IA"),
			new Examen(4L, "Programacion"));
	
	public final static List<String> 
		PREGUNTAS = Arrays.asList("P1.Historia", "P2.Matematicas", "P3.IA", "P4.Programacion");
			
	
}
