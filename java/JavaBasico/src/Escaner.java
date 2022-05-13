import java.util.Scanner;

public class Escaner {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		System.out.print("Escribe un numero: ");
		int num = escaner.nextInt();
		System.out.println(num);
		
		if(num < 10) {
			System.out.println("El numero es menor a 10");
		}
	}
}
