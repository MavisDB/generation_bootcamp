package ciclos;

import javax.swing.JOptionPane;

public class Ciclo_dowhile {

	public static void main(String[] args) {
		String clave = "Daniela";
		
		String comparacion = "";
		
		do {
			comparacion = JOptionPane.showInputDialog("Introduce la contrase�a, por favor");
			
			if (clave.equals(comparacion) == false) {
				System.out.println("La contrase�a es incorrecta");
			}
		
		}while(clave.equals(comparacion) == false);
		System.out.println("La contrase�a es correcta");

	}

}
