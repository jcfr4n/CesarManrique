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
         * 10.17. En Linux disponemos del comando more, al que se le pasa un
         * fichero y lo muestra poco a poco: cada 24 líneas. Implementa un
         * programa que funcione de forma similar.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor ingresa el nombre del archivo: ");
        String nombreArchivo = scanner.nextLine();

        File archivo = new File(nombreArchivo);
        try {
            try (Scanner lectorArchivo = new Scanner(archivo)) {
                int contadorLineas = 0;
                while (lectorArchivo.hasNextLine()) {
                    String linea = lectorArchivo.nextLine();
                    System.out.println(linea);
                    contadorLineas++;
                    if (contadorLineas % 24 == 0) {
                        System.out.println(
                                "\n--- Presiona Enter para continuar ---");
                        scanner.nextLine();
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe.");
        }
        
        System.out.println("###########################################");
        System.out.println("\tGracias por usar este programa.");
        System.out.println("###########################################");

    }
}
