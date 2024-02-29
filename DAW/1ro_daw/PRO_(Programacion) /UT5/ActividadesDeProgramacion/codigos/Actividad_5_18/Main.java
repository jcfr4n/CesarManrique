/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /**
         * 5.18. Escribe un programa que solicite los elementos de una matriz
         * de tamaño 4 x 4. La aplicación debe decidir si la matriz introducida
         * corresponde a una matriz mágica, que es aquella donde la suma de los
         * elementos de cualquier fila o de cualquier columna valen lo mismo.
         */

        int[][] matriz = new int[4][4];
        Scanner sc = new Scanner(System.in);
        String option;
        boolean continuar = true;

        System.out.println(
                "\nVamos a solicitar 16 elementos para formar una \nmatriz 4x4 y vamos a comprobar si es una matriz mágica, es decir, que \nla suma de cualquiera de sus filas o de sus columnas es igual, una \nforma fácil de comprobarlo sería introduciendo los 16 números iguales.\nEmpecemos: ");

        // Creamos un bucle para que el usuario pueda probar variaz matrices
        while (continuar) {
            introducirNumeros(matriz, sc); // Método para introducir los datos
            comprobarMatriz(matriz); // Método que comprueba las matrices

            System.out.print("Desea comprobar otra matriz (s/n): ");
            option = sc.next();
            if (option.equals("s")) {
                System.out.println("\nDe acuerdo. Empecemos:");
            } else {
                continuar = false;
            }

        }

        sc.close();
        System.exit(0);

    }

    /**
     * Método para la introducción de los números que forman la matriz
     * 
     * @param matriz
     * @param sc
     */
    private static void introducirNumeros(int[][] matriz, Scanner sc) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("\n");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("\nVamos a introducir el valor para la fila " + i + ", columna " + j + ": ");
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nLa matriz introducida es :");
        mostrarMatriz(matriz);
    }

    /**
     * Muestra la matriz una vez introducidos los datos
     * 
     * @param matriz
     */
    private static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("\n");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("\t" + matriz[i][j]);
            }
        }

    }

    /**
     * Comprueba la matriz para ver si es una matriz mágica
     * 
     * @param matriz
     */
    private static void comprobarMatriz(int[][] matriz) {
        int[] columnas = new int[4];
        int[] filas = new int[4];
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("\n");
            for (int j = 0; j < matriz[i].length; j++) {
                filas[i] += matriz[i][j];
                columnas[j] += matriz[i][j];
            }
        }
        System.out.println(
                Arrays.equals(filas, columnas) ? "Excelente, esa es una tabla mágica" : "Lo siento, siga intentando.");

    }

}
