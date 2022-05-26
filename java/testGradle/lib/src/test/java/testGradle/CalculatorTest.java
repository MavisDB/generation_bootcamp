package testGradle;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Tests de la clase CalculatorTDD")
public class CalculatorTest {
	CalculatorTDD calculator = new CalculatorTDD();

    @Test
    @DisplayName("M�todo para comprobar suma")
    public void addTest(){
    	CalculatorTDD calSuma = new CalculatorTDD();
        assertEquals(8,calSuma.addNumbers(6,2), "El resultado debe ser 8");
    }


    @Test
    @DisplayName("M�todo para comprobar resta")
    public void subtractTest(){
    	CalculatorTDD calResta = new CalculatorTDD();
        assertEquals(7, calResta.subtractNumbers(26,19), "El resultado debe ser 7");
    }


    @Test
    @DisplayName("M�todo para comprobar multiplicaci�n")
    public void multiplyTest(){
    	CalculatorTDD calMult = new CalculatorTDD();
        assertEquals(81,calMult.multiplyNumbers(9,9), "El resultado debe ser 81");
    }


    @Test
    @DisplayName("M�todo para comprobar divisi�n")
    public void divideTest(){
    	CalculatorTDD calDiv = new CalculatorTDD ();
        assertEquals(12,calDiv.divideNumbers(25, 2), "El resultado debe ser 12");
    }
}