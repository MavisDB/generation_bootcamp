
public class Ejercicio1 {

	public static void main(String[] args) {
		int n1 = -3;
		if (n1 <= 3) {
			System.out.println("Failed!");
		}if (n1 > 3 && n1 <= 5){
			System.out.println("Insufficient!");
		}if (n1 > 5 && n1<=9) {
			System.out.println("Good!");
		}if (n1==10){
			System.out.println("Excellent!");
		}if (n1>10){
			System.out.println("Grade outside range supported");
		}

	}

}
