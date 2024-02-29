package Main;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author juancfm
 */
public class Main {

    public static void main(String[] args) {
        /**
         * 10.18. Escribe la función Integer[ ] leerEnteros(String texto ), al
         * que se le pasa una cadena y devuelve una tabla con todos los enteros
         * que aparecen en ella.
         */
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una cadena: ");
        String cadena = scanner.nextLine();
        Integer[] enteros = leerEnteros(cadena);
        int i = 0;
        for (int entero : enteros) {
            i++;
            System.out.println("Entero " + i + ": " + entero);
        }        
        
        System.out.println("###########################################");
        System.out.println("\tGracias por usar este programa.");
        System.out.println("###########################################");
    }

    public static Integer[] leerEnteros(String texto) {
        String[] palabras = texto.split("\\s+");
        Integer[] enteros = new Integer[palabras.length];
        int j = 0;
        for (String palabra : palabras) {
            try {
                enteros[j] = Integer.valueOf(palabra);
                j++;
            } catch (NumberFormatException e) {
                // Ignorar palabras que no son enteros
            }
        }
        return java.util.Arrays.copyOf(enteros, j);
    }

}
