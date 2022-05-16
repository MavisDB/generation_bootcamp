package ciclos;

import java.util.Scanner;

public class Adivina_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int numeroBase = 0;
        int numeroAleatorio = (int) (Math.random() * 100);

        System.out.println("Introduce un número entero entre 0 y 100");
        numeroBase = sc.nextInt();

        while (numeroBase != numeroAleatorio) {
            if (numeroBase > numeroAleatorio) {
                System.out.println("El número es más pequeño, prueba otra vez");
                numeroBase = sc.nextInt();
            } else if (numeroBase < numeroAleatorio){
                System.out.println("El número es más grande, prueba otra vez");
                numeroBase = sc.nextInt();
            }
        }
        System.out.println("Felicidades, adivinaste el número");


	}

}
