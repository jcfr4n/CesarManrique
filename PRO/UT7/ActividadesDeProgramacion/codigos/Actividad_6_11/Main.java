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

public class Main {

    /**
     * Escribe un programa descodificador que muestre un texto codificado con el
     * programa realizado en la Actividad resuelta 6.11.
     *
     * A efectos prácticos se modificó el programa de la actividad resuelta 6.11
     * de manera que este programa pudiera codificar y/o decodificar un texto
     * introducido por el usuario, haciendo uso de una misma función, según la
     * opción seleccionada por dicho usuario.
     *
     */
    public static void main(String[] args) {
        String option = "1";
        Scanner sc = new Scanner(System.in);
        System.out.println("\tHola.");

        // Mientras las opciones sean 1 o 2 el programa se seguirá ejecutando,
        // en caso contrario se detiene su ejecución.
        while (option.equals("1") || option.equals("2")) {
            System.out.println("\n\tIndique la opción deseada: ");
            System.out.println("\n\t1\tCodificar un texto.");
            System.out.println("\t2\tDecodificar un texto.");
            System.out.print("\n\t\tIndique cualquier otra tecla para "
                    + "salir: ");
            option = sc.nextLine();
            if (option.equals("1") || option.equals("2")) {

                // Si la opción es 1 o 2 se llama a la función codifica
                codifica(sc, option);
            }
        };

        // Cerramos el Scanner y paramos la ejecución del programa
        sc.close();
        System.exit(0);

    }

    /**
     * Codifica o Decodifica el texto introducido por el usuario
     *
     * @param sc
     * @param option
     */
    static void codifica(Scanner sc, String option) {
        /*
         * Definimos dos conjuntos de caracteres que serán los que
         * intercambiarán letras con el fin de lograr la codificación. Este tipo
         * de cifrado se conoce como cifrado por sustitución. Más info:
         * https://es.wikipedia.org/wiki/Cifrado_por_sustituci%C3%B3n
         */
        final char conjunto1[] = {'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't',
            'u', 'v'};
        final char conjunto2[] = {'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k',
            'q', 's'};

        String texto;
        System.out.print("\n\tIntroduzca un texto a codificar: ");
        texto = sc.nextLine();
        texto = texto.toLowerCase();

        char[] arrayTexto = texto.toCharArray();
        int pos;

        // Guardamos el conjunto correspondiente a la opción del usuario en una
        // cadena, este conjunto es el que se va a comparar con el texto del 
        // usuario        
        String origen = String.valueOf(
                option.equals("1")
                ? conjunto1
                : conjunto2
        );

        // Seleccionamos cual va a ser el conjunto de reemplazo, este conjunto
        // reemplazará a los que se encuentren en el texto del usuario que 
        // coincidan con los que están en la cadena origen
        char[] destino = (option.equals("1")
                ? conjunto2
                : conjunto1);
        // Procedemos a hacer la sustitución
        for (int i = 0; i < arrayTexto.length; i++) {
            pos = origen.indexOf(arrayTexto[i]);
            if (pos != -1) {
                arrayTexto[i] = destino[pos];
            }
        }
        // Usamos la función presentarValor para imprimir el resultado
        presentarValor(arrayTexto, sc);
    }

    /**
     * Imprime el resultado del proceso de codificación/decodificación por
     * pantalla entre dos líneas hechas con el caracter "_" para que se
     * visualice mejor, además introduce una pausa antes de continuar con la
     * ejecución
     *
     * @param arrayTexto
     * @param sc
     */
    private static void presentarValor(char[] arrayTexto, Scanner sc) {

        String wait;

        System.out.print("\n");
        for (int i = 0; i < 40; i++) {
            System.out.print("_ ");
        }
        System.out.println("\n\nEl resultado es:\t" + String.valueOf(
                arrayTexto));
        for (int i = 0; i < 40; i++) {
            System.out.print("_ ");
        }
        System.out.print("\n");
        System.out.println("\nPresione <<Enter>> para continuar...");
        wait = sc.nextLine();
        System.out.println("\n\n\n");
    }
}

