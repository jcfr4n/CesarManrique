package main;

import java.util.Scanner;

/**
 * @author juancfm
 */
public class Main {

    /**
     * De forma similar a la Actividad de aplicación 3.17, implementa un 
     * algoritmo que calcule el mínimo común múltiplo de dos números dados.
     * 
     * Se reutilizó el código de la Actividad_3_17 y se le agregaron unas líneas 
     * para calcular y presentar el mínimo común múltiplo.  Se procedió a 
     * controlar el ingreso de errores por parte del usuario.
     */
    public static void main(String[] args) {

        int a, b, divisor;
        a = b = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos a buscar el máximo común "
                + "divisor y el mínimo común múltiplo de dos números dados.");
        System.out.print("Introduzca el número A: ");
        try {
            a = sc.nextInt();
        } catch (Exception ex) {
            System.out.println("Lo siento no ha introducido un número válido.");
            sc.close();
            System.exit(0);
        }
        System.out.print("Introduzca el número B: ");
        try {
            b = sc.nextInt();
        } catch (Exception ex) {
            System.out.println("Lo siento no ha introducido un número válido.");
            sc.close();
            System.exit(0);
        }
        if (a > b) {
            /* Cambio de una variable por otra sin auxiliar*/
            a += b;
            b = a - b;
            a -= b;
        }

        divisor = a;

        while (a % divisor != 0 || b % divisor != 0) {
            divisor--;
        }

        System.out.println("\nEl máximo común divisor de " + a
                + " y " + b + " es: " + divisor);

        System.out.println("y el mínimo común múltiplo es: " + (a / divisor) * b);

        sc.close();
        System.out.println("Fin.");
    }

}
