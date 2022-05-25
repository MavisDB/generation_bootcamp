package testGradle;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
@DisplayName("Tests de la clase Calculadora")
public class CalculadoraTest {
	
		@Test
		@DisplayName("Método para comprobar suma")
		public void sumaTest() {
			Calculadora sumaCal = new Calculadora();
			assertEquals(2,sumaCal.suma(1, 1), "El resultado deberia de ser 2");
		}
		
		@Test
		@DisplayName("Método para comprobar assertions")
		public void assertionTest() {
//			boolean valorBoolean = true;
//			assertTrue(valorBoolean);
			assertAll(
					"Encabezado",
					() -> assertEquals(2, 1+1, "Deberia ser 2"),
					() -> assertTrue(true, "Deberia ser true")
					);
		}
}
