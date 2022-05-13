import java.util.Objects;

public class Operadores_logicos {

	public static void main(String[] args) {
		//una sola linea
		/* un comentario
		 * multilinea 
		 */
		
		int num = 12;
		num = 45;
		num = Integer.parseInt("4");
		
		//System.out.println(num);
		
		//Operadores de comparación
		int num1, num2;
		num1 = 10;
		num2 = 2;
		//System.out.println("num1: " +num1);
		//System.out.println("num1: " +num2);
		//== Operador de comparación
		//System.out.println(num1 == num2);
		
	//.equals()
		//System.out.println(Objects.equals(num1, num2));
		
		//operadores logicos
		//<,>, <=, >=
		int num3, num4;
		num3 = 25;
		num4 = 20;
		
//		System.out.println(num3 < num4);
//		System.out.println(num3 > num4);
//		System.out.println(num3 <= num4);
//		System.out.println(num3 >= num4);

		if (num3 < num4) {
			//código a ejecutar
			//System.out.println("Numero 3 es menor");
		}else {
			//System.out.println("Numero 3 es mayor");
		}
		
		// !=
		//System.out.println(num3 != num4);
		
		boolean comparacion = num3 != num4;
		//System.out.println(comparacion);
		
		//operadores logicos
		//and = && => ambos true
		//or || => con solo un true
		// not != negacion => devuelve lo contrario
		System.out.println(true && true);
		System.out.println(false || false);
		System.out.println(true && true);
		System.out.println(!(true && true));
	}
	
	
	
	

}
