/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Actividad_4_12;

import java.util.Scanner;

/**
 *
 * @author juancfm
 */
public class Main {

    /**
     * 4.12. Implementa la función que calcula y devuelve la distancia euclídea
     * que separa los puntos ( x1 , y1 ) y ( x2 , y2 ).
     *
     */

    public static void main(String[] args) {
        int x1, x2, y1, y2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Para calcular la distancia euclídea entre dos"
                + " puntos, vamos a ingresar sus coordenadas: ");
        System.out.print("\nCoordenada x del punto 1: ");
        x1 = sc.nextInt();
        System.out.print("\nCoordenada y del punto 1: ");
        y1 = sc.nextInt();
        System.out.print("\nCoordenada x del punto 2: ");
        x2 = sc.nextInt();
        System.out.print("\nCoordenada y del punto 1: ");
        y2 = sc.nextInt();

        System.out.println("\nLa distancia euclídea entre ("
                + x1 + "," + y1 + ") y (" + x2 + "," + y2 + ") es: "
                + distancia(x1, y1, x2, y2));
    }

    /**
     * Función que calcula la diatancia euclídea entre dos puntos dados
     *
     * @param x1 absisa punto 1
     * @param y1 ordenada punto 1
     * @param x2 absisa punto 2
     * @param y2 ordenada punto 2
     * @return result Devuelve la distancia euclídea entre los dos puntos
     */
    public static double distancia(int x1, int y1, int x2, int y2) {
        double result;

        result = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));

        return result;
    }

}
