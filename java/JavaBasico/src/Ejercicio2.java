import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		System.out.println("Introduce tu estatura en cm");
		int e = escaner.nextInt();
		System.out.println("Introduce tu peso");
		float p = escaner.nextFloat();
		float em = e/100f;
		float imc = p/em;
		
	}

}
