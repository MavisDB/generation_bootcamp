package ciclos;

import java.util.Scanner;

public class Adivina_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int numeroBase = 0;
        int numeroAleatorio = (int) (Math.random() * 100);

        System.out.println("Introduce un n�mero entero entre 0 y 100");
        numeroBase = sc.nextInt();

        while (numeroBase != numeroAleatorio) {
            if (numeroBase > numeroAleatorio) {
                System.out.println("El n�mero es m�s peque�o, prueba otra vez");
                numeroBase = sc.nextInt();
            } else if (numeroBase < numeroAleatorio){
                System.out.println("El n�mero es m�s grande, prueba otra vez");
                numeroBase = sc.nextInt();
            }
        }
        System.out.println("Felicidades, adivinaste el n�mero");


	}

}
