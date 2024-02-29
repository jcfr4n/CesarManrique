/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit
 * this template
 */
package Main;

/**
 * @author juancfm
 */
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    /**
     *
     * 6.20. Implementa un programa que lea una frase y muestre todas sus
     * palabras ordenadas de forma alfabética. Suponemos que cada palabra de la
     * frase se separa de otra por un único espacio.
     *
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Se llaman a los distintos métodos usados 
        presentarValor(
                ordenarDatos(
                        capturarDatos(sc)
                )
        );
        /**
         * Cierra el Scanner y sale del programa con status 0 de ejecución
         * correcta
         */
        sc.close();
        System.exit(0);

    }

    /**
     *
     * Captura la frase que se usará para ordenar alfabéticamente sus palabras
     *
     * @param sc Scanner usado para la captura de datos
     * @return frase Retorna un String con la frase
     */
    private static String capturarDatos(Scanner sc) {

        String frase;

        System.out.print("Introduzca la frase a utilizar: ");
        frase = sc.nextLine();

        return frase;

    }

    /**
     *
     * Primero
     *
     * @param frase String con la frase a tratar
     * @return frase.strip() frase con palabras ordenadas alfabéticamente
     * eliminando cualquier carácter blanco al inicio o al final de la frase
     *
     */
    private static String ordenarDatos(String frase) {
        
        frase = frase.toLowerCase();
        String[] words = frase.split("\\s+");
        Arrays.sort(words);
        frase = "";

        for (String word : words) {
            frase += word + " ";

        }

        return frase.strip();

    }

    /**
     * Imprime el resultado de la ordenación de las palabras de la frase
     *
     * @param frase frase ordenada
     */
    private static void presentarValor(String frase) {

        System.out.print("\n");
        for (int i = 0; i < 40; i++) {
            System.out.print("_ ");
        }

        System.out.println("\n\nEl resultado es: \n\n" + frase);

        for (int i = 0; i < 40; i++) {
            System.out.print("_ ");
        }
        System.out.print("\n");
        System.out.println("\n\n\n");
    }

}

