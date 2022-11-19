/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Actividad_4_17;

import java.util.Scanner;

/**
 *
 * @author juancfm
 */
public class Main {

    /**
     * 4.17. Escribe una función que decida si dos números enteros positivos son
     * amigos . Dos números a y b son amigos si la suma de los divisores propios
     * (distintos de él mismo) de a es igual a b . Y viceversa . Para probar se
     * pueden usar los números 220 y 284 , que son amigos.
     *
     */
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos a mostrar si dos números son amigos.");
        System.out.print("\nIndique el primer número a analizar: ");
        num1 = sc.nextInt();
        System.out.print("\nIndique el siguiente número: ");
        num2 = sc.nextInt();

        System.out.println(
                sonAmigos(num1, num2)
                ? "\nExcelente, Son amigos"
                : "\nLo siento, no son amigos");
    }

    /**
     * Compara dos números para ver si son amigos
     *
     * @param num1 primer número a comparar
     * @param num2 segundo número a comparar
     * @return boolean devuelve true si son amigos
     */
    private static boolean sonAmigos(int num1, int num2) {
        boolean flag = false;

        if ((sumaDivisores(num2) == num1)
                && (sumaDivisores(num1) == num2)) {
            flag = true;
        }

        return flag;
    }

    /**
     * Suma los divisores propios de un número aparte de si mismo
     *
     * @param num número bajo análisis
     * @return int devuelve la suma de los divisores propios de un número
     */
    private static int sumaDivisores(int num) {
        int suma = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                suma += i;
            }
        }

        return suma;
    }

}
