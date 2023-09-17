/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author juancfm
 */
public class Main {

    /**
     * Realiza la función: int[ ] buscarTodos (int t[ ], int clave), que crea y
     * devuelve una tabla con todos los índices de los elementos donde se
     * encuentra la clave de búsqueda. En el caso de que clave no se encuentre
     * en la tabla t, la función devolverá una tabla vacía.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int clave;
        int[] t, result;

        t = new int[20];
        poblarArray(t);

        result = new int[0];

        System.out.print("Introduzca un número de 1 a 20 para ver cuantas "
                + "\nveces aparece en nuestro array aleatorio de 20 números: ");
        clave = sc.nextInt();

        result = buscarTodos(t, clave);

        if (result.length == 1) {

            System.out.println("\nHay " + result.length + " coincidencia y se "
                    + "\nencuentra en el índice: \n"
                    + Arrays.toString(result) + "\ndel array");
            System.out.println("(Recordar que los índices empiezan en 0)");

        } else if (result.length > 1) {

            System.out.println("\nHay " + result.length + " coincidencias y se "
                    + "\nencuentran en los índices: \n"
                    + Arrays.toString(result) + "\ndel array");
        } else {
            System.out.println("\nNo hay coincidencias para este "
                    + "número en el array " + Arrays.toString(result));
        }

        System.out.println("\nArray aleatorio:");
        System.out.println(Arrays.toString(t));
    }

    private static int[] buscarTodos(int[] t, int clave) {
        int[] result = new int[0];
        for (int i = 0; i < t.length; i++) {
            if (t[i] == clave) {
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = i;
            }
        }
        return result;
    }

    private static void poblarArray(int[] t) {
        for (int i = 0; i < t.length; i++) {
            t[i] = (int) (Math.random() * 20) + 1;
        }
    }

}
