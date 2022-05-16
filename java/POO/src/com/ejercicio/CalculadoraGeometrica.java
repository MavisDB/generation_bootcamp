package com.ejercicio;

import java.util.Scanner;

public class CalculadoraGeometrica {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Areas areas = new Areas();
        Perimetro perimetros = new Perimetro();

        System.out.println("Que quieres calcular?\n");
        System.out.println("1. Area\n");
        System.out.println("2. Per�metro\n");
        int opcion = sc.nextInt();
        do {
            switch (opcion) {
                case 1:
                    System.out.println("De qu� figura estamos hablando?\n");
                    System.out.println("1. Tri�ngulo\n");
                    System.out.println("2. Cuadrado\n");
                    System.out.println("3. Circulo\n");
                    switch (sc.nextInt()) {
                        case 1:
                            System.out.println("Introduce el valor de la base: ");
                            float b = sc.nextFloat();
                            System.out.println("Introduce el valor de la altura: ");
                            float a = sc.nextFloat();
                            System.out.println("El �rea del tri�ngulo es: " + areas.areaTriangulo(b, a));
                            break;
                        case 2:
                            System.out.println("Introduce el valor del lado: ");
                            float lado = sc.nextFloat();
                            System.out.println("El �rea del cuadrado es: " + areas.areaCuadrado(lado));
                            break;
                        case 3:
                            System.out.println("Introduce el valor del radio: ");
                            float radio = sc.nextFloat();
                            System.out.println("El �rea del circulo es: " + areas.areaCirculo(radio));
                            break;
                    }
                    break;
                case 2:
                    System.out.println("De qu� figura estamos hablando?\n");
                    System.out.println("1. Tri�ngulo\n");
                    System.out.println("2. Cuadrado\n");
                    System.out.println("3. Circulo\n");
                    switch (opcion) {
                        case 1:
                            System.out.println("Introduce el valor del lado a: ");
                            float a = sc.nextFloat();
                            System.out.println("Introduce el valor del lado b: ");
                            float b = sc.nextFloat();
                            System.out.println("Introduce el valor del lado c: ");
                            float c = sc.nextFloat();
                            System.out.println("El per�metro del tri�ngulo es: " + perimetros.perimetroTriangulo(a, b, c));
                            break;
                        case 2:
                            System.out.println("Introduce el valor del lado: ");
                            float lado = sc.nextFloat();
                            System.out.println("El per�metro del cuadrado es: " + perimetros.perimetroCuadrado(lado));
                            break;
                        case 3:
                            System.out.println("Introduce el valor del radio: ");
                            float radio = sc.nextFloat();
                            System.out.println("El per�metro del circulo es: " + perimetros.perimetroCirculo(radio));
                            break;
                    }
                    break;
                default:
                    System.out.println("No has elegido ninguna opci�n v�lida");
            }
        } while (opcion < 3 && opcion > 0);

    }


	}
