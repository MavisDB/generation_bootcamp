package ciclos;

import javax.swing.JOptionPane;

public class Ciclo_dowhile {

	public static void main(String[] args) {
		String clave = "Daniela";
		
		String comparacion = "";
		
		do {
			comparacion = JOptionPane.showInputDialog("Introduce la contraseña, por favor");
			
			if (clave.equals(comparacion) == false) {
				System.out.println("La contraseña es incorrecta");
			}
		
		}while(clave.equals(comparacion) == false);
		System.out.println("La contraseña es correcta");

	}

}
