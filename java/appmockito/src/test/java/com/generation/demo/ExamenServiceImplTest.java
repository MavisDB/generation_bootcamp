package com.generation.demo;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.generation.model.Examen;
import com.generation.repositories.ExamenRepository;
import com.generation.repositories.PreguntasRepository;
import com.generation.services.ExamenService;
import com.generation.services.ExamenServiceImpl;

public class ExamenServiceImplTest {
	
	

	ExamenRepository repository;
	ExamenService service;
	PreguntasRepository preguntasRepository;
	@BeforeEach
	void setUpo() {
		repository = mock(ExamenRepository.class);
		preguntasRepository = mock(PreguntasRepository.class);
		service = new ExamenServiceImpl(repository,preguntasRepository);
	}
	
	
	@Test
	void findExamenPorNombre() {
		
		when(repository.findAll()).thenReturn(Datos.EXAMENES);
		when(preguntasRepository.findPreguntasPorExamenId(1L)).thenReturn(Datos.PREGUNTAS);
		
		Optional<Examen> examen = service.findExamenPorNombre("IA");
		
		assertNotNull(examen);
		/**assertEquals(3L, examen.getId());
		assertEquals("IA", examen.getNom());**/
	}
	
	
	
	@Test
	void findExamenPorNombreListaVacia() {
	
		List<Examen> datos = Collections.emptyList();
		when(repository.findAll()).thenReturn(datos);
		
		Optional<Examen> examen = service.findExamenPorNombre("IA");
		
		assertFalse(examen.isPresent());
		/**assertEquals(3L, examen.orElseThrow().getId());
		assertEquals("IA", examen.get().getNom());**/
	}
	
}
