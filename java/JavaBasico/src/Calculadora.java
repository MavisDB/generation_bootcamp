import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
	System.out.println("Introduce el numero de la operacion a realizar");
	System.out.println("1) Suma   2) Resta   3) Multiplicacion   4) Division");
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Escribe el numero de la operacion a realizar");
	int op = sc.nextInt();
	System.out.println("Introduce tu primer digito: ");
	int num1 = sc.nextInt();
	System.out.println("Introduce tu segundo digito:");
	int num2 = sc.nextInt();
	int r = 0;
	
	switch (op) {
	case 1:
		System.out.println("*****SUMA*****");
		r=num1+num2;
		System.out.println("El resultado es: " + r);
		break;
	case 2:
		System.out.println("*****RESTA*****");
		r=num1-num2;
		System.out.println("El resultado es: " + r);
		break;
	case 3:
		System.out.println("*****MULTIPLICACION*****");
		r=num1*num2;
		System.out.println("El resultado es: " + r);
		break;	
	case 4:
		System.out.println("*****DIVISION*****");
		r=num1/num2;
		System.out.println("El resultado es: " + r);
		break;
		
		}
		sc.close();
	}
}

	

