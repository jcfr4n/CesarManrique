/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Actividad_4_18;

import java.util.Scanner;

/**
 *
 * @author juancfm
 */
public class Main {

    /**
     * 4.18. Crea una función que muestre por consola una serie de números
     * aleatorios enteros. Los parámetros de la función serán: la cantidad de
     * números aleatorios que se mostrarán y los valores mínimos y máximos que
     * estos pueden tomar.
     *
     */
    public static void main(String[] args) {
        int n, min, max;
        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos a mostrar n números aleatorios.");
        System.out.print("\nIndique la cantidad de números que desea ver: ");
        n = sc.nextInt();
        System.out.print("\nIndique el mínimo de los valores que desea: ");
        min = sc.nextInt();
        System.out.print("\nIndique el máximo de los valores que desea: ");
        max = sc.nextInt();

        System.out.println("\nLos valores obtenidos son: ");

        valoresAleatorios(n, min, max);
    }

    /**
     * Obtiene una serie de valores aleatorios comprendidos entre dos números
     *
     * @param n número de elementos a mostrar
     * @param min valor mínimo de la serie
     * @param max valor máximo de la serie
     */
    private static void valoresAleatorios(int n, int min, int max) {
        for (int i = 1; i <= n; i++) {
            System.out.println("\n" + i + ".-\t"
                    + Math.round(Math.random() * (max - min) + min));
        }
    }

}
