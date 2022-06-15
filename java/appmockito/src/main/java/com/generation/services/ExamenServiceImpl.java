package com.generation.services;

import java.util.List;
import java.util.Optional;

import com.generation.model.Examen;
import com.generation.repositories.ExamenRepository;
import com.generation.repositories.PreguntasRepository;

public class ExamenServiceImpl implements ExamenService {
	private ExamenRepository examenRepository;
	private PreguntasRepository preguntasRepository;
	
	public ExamenServiceImpl() {
		super();
	}




	public ExamenServiceImpl(ExamenRepository examenRepository, PreguntasRepository preguntasRepository) {
		super();
		this.examenRepository = examenRepository;
		this.preguntasRepository = preguntasRepository;
	}




	@Override
	public Optional<Examen> findExamenPorNombre (String nom){
		 	Optional<Examen> examenOptional;
		 	examenOptional = examenRepository.findAll()
				.stream()
				.filter(e -> e.getNom().contains(nom))
				.findFirst();
		return examenOptional;
		
	}
	
	@Override
	public Examen findExamenPorNombrePreguntas(String nom) {
		Optional<Examen> examenOptional = findExamenPorNombre(nom);
		Examen examen = null;
		if (examenOptional.isPresent()) {
			examen = examenOptional.orElseThrow();
			List<String> preguntas = preguntasRepository.findPreguntasPorExamenId(examen.getId());
			examen.setPreguntas(preguntas);
		}
		return examen;
	}

}
