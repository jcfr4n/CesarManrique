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
        int num, numAciertos;
        int[] alea, result;

        alea = new int[20];
        result = new int[0];

        System.out.print("Introduzca un número de 1 a 20 para ver cuantas "
                + "\nveces aparece en nuestro array aleatorio de 20 números: ");
        num = sc.nextInt();
        poblarArray(alea); //Poblamos el array con 20 númerol aleatorios
        // comprobamos cuantas coincidencias hay
        numAciertos = comprobarArray(alea, num);

        if (numAciertos > 0) {
            result = arrayResult(alea, num, numAciertos, result);
            System.out.println("\nHay " + numAciertos + " coincidencias y se "
                    + "\nencuentran en los índices: \n"
                    + Arrays.toString(result) + "\ndel array");
        } else {
            System.out.println("No hay coincidencias para este "
                    + "número en el array " + Arrays.toString(result));
        }

        System.out.println(Arrays.toString(alea));
    }

    private static void poblarArray(int[] alea) {
        for (int i = 0; i <= alea.length - 1; i++) {
            alea[i] = (int) (Math.random() * 20) + 1;
        }

    }

    private static int comprobarArray(int[] alea, int num) {
        int cont = 0;
        for (int element : alea) {
            if (element == num) {
                cont++;
            }
        }
        return cont;
    }

    private static int[]
            arrayResult(int[] alea, int num, int numAciertos, int[] result) {
        result = new int[numAciertos];
        for (int i = 0, j = 0; i < alea.length; i++) {
            if (alea[i] == num) {
                result[j] = i;
                j++;
            }
        }
        return result;
    }

}
