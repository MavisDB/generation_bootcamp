package com.generation.repositories;

import java.util.Collections;
import java.util.List;

import com.generation.model.Examen;

public class ExamenRepositoryImpl implements ExamenRepository {

	@Override
	public List<Examen> findAll() {
		return Collections.emptyList();
				/*Arrays.asList(new Examen(1L, "Historia"),
				new Examen(2L,"Matematicas"),
				new Examen(3L,"IA"),
				new Examen(4L, "Programacion")
				
				);*/
	}

}
