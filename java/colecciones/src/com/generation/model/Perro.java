package com.generation.model;

import java.util.HashMap;
import java.util.Map;

public class Perro {
    // Atributos
    private String name;
    private String raza;
    private String size;
    private String color;
    private int years;
    
    private int id;
    //Tiene que ser estatico
    private static int contador = 0;
    
    private static Map<Integer, String> humano = new HashMap <Integer, String>();
    

    // Constructor

    public Perro(String name, String raza, String size, String color, int years) {
        this.name = name;
        this.raza = raza;
        this.size = size;
        this.color = color;
        this.years = years;
        this.id = ++Perro.contador;
    }

    // Método toString
    @Override
   	public String toString() {
   		return "Perro [name=" + name + ", raza=" + raza + ", size=" + size + ", color=" + color + ", years=" + years
   				+ ", id=" + id + "]";
   	}

   
   
    // Getters Setters

    public String getName() {
        return name;
    }

   

	public void setName(String name) {
        this.name = name;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }
    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	


	public void setHumano(String value) {
		Perro.humano.put(this.id, value);
	}

	// Métodos
	public static String buscarHumano(Integer key) {
		return "El nombre de este humano es: " + humano.get(key);
	}

    public void comer(){
        System.out.println(this.name + " está comiendo");
    }
    public void dormir(){
        System.out.println(this.name + " está durmiendo");
    }
    public void sentar(){
        System.out.println(this.name + " se sentó");
    }
    public void correr(){
        System.out.println(this.name + " está corriendo");
    }

}