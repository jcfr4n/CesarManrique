/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author juancfm
 */

/**
 * Realiza la función: int[ ] buscarTodos (int t[ ], int clave), que crea y
 * devuelve una tabla con todos los índices de los elementos donde se
 * encuentra la clave de búsqueda. En el caso de que clave no se encuentre
 * en la tabla t, la función devolverá una tabla vacía.
 */

/***
 * Aprovechando la aritmética de caracteres mostraremos todos los símbolos
 * disponibles en la codificación Unicode, comprendidos entre \u0000 y \uFFFF.
 */
public class Main {
    public static void main(String[] args) {
        // usamos números en base hexadecimal, lo que se indica anteponiendo 0x
        // internamente la variable codePoint contiene valores decimales
        for (int codePoint = 0x0000; codePoint <= 0xFFFF; codePoint++) {
            String xxxx = Integer.toHexString(codePoint); // convierte un número en su
            // representación hexadecimal
            System.out.println("\\u" + xxxx + ": " + (char) codePoint);
        }
    }
}
