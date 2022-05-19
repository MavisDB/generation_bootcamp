package com.generation.test;

import com.generation.model.Perro;

public class Prueba_perro {
    public static void main(String[] args) {

        Perro pelusa = new Perro(
                "Pelusa",
                "French",
                "Chico",
                "Blanco",
                4
        );
        Perro solovino = new Perro(
        		"Solovino",
        		"Mestizo",
        		"Mediano",
        		"Cafe",
        		6
        );
        
        pelusa.setHumano("Daniela");
        solovino.setHumano("Bruno");
        		

        System.out.println(pelusa.toString());
        pelusa.comer();
        pelusa.dormir();
        pelusa.sentar();
        pelusa.correr();
        System.out.println(solovino.toString());
        
        System.out.println(Perro.buscarHumano(1));
        System.out.println(Perro.buscarHumano(2));
    }

}
