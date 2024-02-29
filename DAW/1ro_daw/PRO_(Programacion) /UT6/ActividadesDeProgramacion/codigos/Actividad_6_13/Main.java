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
     *
     * 6.13. El preprocesador del lenguaje C elimina los comentarios /*... *\/ )
     * del código fuente antes de compilar. Diseña un programa que lea por
     * teclado una sentencia en C, y elimine los comentarios.
     *
     */
    public static void main(String[] args) {
        /*
         * La cadena example contiene el ejemplo del ejercicio, basta copiar el
         * texto entre comillas dobles y pegarla en donde nos pide introducir la
         * sentencia
         */
        String example = "if(a == 3) /*igual a tres*/ a++;/*incrementamos a */";

        String sentencia = "";
        Scanner sc = new Scanner(System.in);

        sentencia = capturarDatos(sc, sentencia);
        sentencia = quitarComentarios(sentencia);
        presentarValor(sentencia);

        // Cerramos el Scanner y paramos la ejecución del programa
        sc.close();
        System.exit(0);

    }

    /**
     *
     * Captura la sentencia que será depurada de los comentarios
     *
     * @param sc
     * @param sentencia
     * @return
     */
    private static String capturarDatos(Scanner sc, String sentencia) {

        System.out.print("Introduzca la sentencia a depurar: ");
        sentencia = sc.nextLine();

        return sentencia;

    }

    /**
     *
     * Elimina los comentarios haciendo uso del método replaceAll() reemplaza el
     * patrón identificado con la expresión regular por una cadena vacía
     *
     * @param sentencia
     * @return
     */
    private static String quitarComentarios(String sentencia) {

        sentencia = sentencia.replaceAll("/\\*(?:.*?)\\*/", "");

        return sentencia;
    }

    /**
     * Imprime el resultado del proceso de depuración de comentarios por
     * pantalla entre dos líneas hechas con el caracter "_" para que se
     * visualice mejor
     *
     * @param sentencia
     */
    private static void presentarValor(String sentencia) {

        System.out.print("\n");
        for (int i = 0; i < 40; i++) {
            System.out.print("_ ");
        }
        System.out.println("\n\nEl resultado es:\t" + sentencia);
        for (int i = 0; i < 40; i++) {
            System.out.print("_ ");
        }
        System.out.print("\n");
        System.out.println("\n\n\n");
    }
}

