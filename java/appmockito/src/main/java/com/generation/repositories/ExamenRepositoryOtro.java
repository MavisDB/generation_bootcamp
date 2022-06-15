package com.generation.repositories;

import java.util.List;

import com.generation.model.Examen;

public class ExamenRepositoryOtro implements ExamenRepository{

	@Override
	public List<Examen> findAll() {
		System.out.println("Esto es una Prueba Mock");
		return null;
	}
	
	

}
