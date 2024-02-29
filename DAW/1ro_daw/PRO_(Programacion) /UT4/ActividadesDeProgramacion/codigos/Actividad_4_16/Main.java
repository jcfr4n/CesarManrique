/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Actividad_4_16;

import java.util.Scanner;

/**
 *
 * @author juancfm
 */
public class Main {

    /**
     * 4.16. Implementa la función divisoresPrimos( ) que muestra, por consola,
     * todos los divisores primos del número que se le pasa como parámetro.
     *
     */
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos a mostrar todos los números primos que "
                + "dividen a un número dado");
        System.out.print("\nIndique el número a analizar: ");
        n = sc.nextInt();

        divisoresPrimos(n);
    }

    /**
     * Presenta por consola los números primos divisores de un número
     *
     * @param n Número a analizar
     */
    private static void divisoresPrimos(int n) {
        if (esPrimo(n)) {
            System.out.println(n + " es un número primo");
        } else {
            System.out.println("Los divisores primos de " + n + " son:");
            for (int i = 2, aux = n; aux >= 2; aux--) {
                if (esPrimo(aux) && n % aux == 0) {
                    System.out.println(aux);
                }
            }

        }
    }

    /**
     * Identifica cuando un número es primo
     *
     * @param n número sujeto a análisis
     * @return Boolean true si es primo
     */
    private static boolean esPrimo(int n) {
        boolean flag = true;
        int i = 2;
        while (i <= (int) Math.sqrt(n) && flag == true) {
            if (n % i == 0) {
                flag = false;
            }
            i++;
        }
        return flag;
    }

}
