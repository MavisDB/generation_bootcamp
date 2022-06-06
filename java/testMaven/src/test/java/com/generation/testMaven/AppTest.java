package com.generation.testMaven;
import org.junit.Test;
import org.junit.jupiter.api.*;

public class AppTest 
{
	@Test
	public void saludoTest() {
		App saludo = new App();
		Assertions.assertEquals("Hola Mundo!", saludo.saludo());
	}
	
	@Test
	public void saludoStatic() {
		App saludo = new App();
		Assertions.assertEquals("Hola Mundo!", saludo.saludo());
	}

}
