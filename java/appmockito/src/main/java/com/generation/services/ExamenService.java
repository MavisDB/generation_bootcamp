package com.generation.services;

import java.util.Optional;

import com.generation.model.Examen;

public interface ExamenService {
	Optional<Examen> findExamenPorNombre(String nom);

	Examen findExamenPorNombrePreguntas(String nom);
	
}
