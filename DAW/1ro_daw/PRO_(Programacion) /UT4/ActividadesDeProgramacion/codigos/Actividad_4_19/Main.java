/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Actividad_4_19;

import java.util.Scanner;

/**
 *
 * @author juancfm
 */
public class Main {

    /**
     * 4.19. Sobrecarga la función realizada en la Actividad de aplicación 4.18
     * para que el único parámetro sea la cantidad de números aleatorios que se
     * muestra por consola. Los números aleatorios serán reales y estarán
     * comprendidos entre 0 y 1.
     *
     */
    public static void main(String[] args) {
        int n, min;
        int max = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos a mostrar n números aleatorios.");
        System.out.print("\nIndique la cantidad de números que desea ver: ");
        n = sc.nextInt();
        System.out.print("\nIndique el mínimo de los valores que desea "
                + "(pulse 0 si no desea fijar topes): ");
        min = sc.nextInt();

        if (min != 0) {

            System.out.print("\nIndique el máximo de los valores que desea: ");
            max = sc.nextInt();

        }

        System.out.println("\nLos valores obtenidos son: ");

        if (min == 0) {

            valoresAleatorios(n);

        } else {

            valoresAleatorios(n, min, max);

        }
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

    /**
     * Sobrecarga de la función valoresAleatorios(n, min, max)
     *
     * @param n Cantidad de números a mostrar
     * @see valoresAleatorios(n, min, max)
     */
    private static void valoresAleatorios(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("\n" + i + ".-\t" + Math.random());
        }
    }

}
