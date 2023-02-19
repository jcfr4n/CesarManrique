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
         * 10.16. Un libro de firmas es útil para recoger los nombres de todas
         * las personas que han pasado por un determinado lugar. Crea una
         * aplicación que permita mostrar el libro de firmas e insertar un nuevo
         * nombre (comprobando que no se encuentre repetido). Llamaremos al
         * fichero firmas.txt .
         */
        
        // Comprobamos si el archivo existe
        File archivo = new File("firmas.txt");
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
                System.out.println("El archivo firmas.txt ha sido creado.\n");
            } catch (IOException e) {
                System.out.println("No se pudo crear el archivo firmas.txt.");
                return;
            }
        }

        LibroFirmas libro = new LibroFirmas();

        try (Scanner scanner = new Scanner(System.in)) {
            OUTER:
            while (true) {
                System.out.println("¿Qué quieres hacer?");
                System.out.println("1. Mostrar firmas");
                System.out.println("2. Agregar firma");
                System.out.println("3. Salir");
                String opcion = scanner.nextLine();
                switch (opcion) {
                    case "1" -> {
                        System.out.println("Firmas en el libro:");
                        libro.mostrarFirmas();
                    }
                    case "2" -> {
                        System.out.println("Ingresa el nombre:");
                        String nombre = scanner.nextLine();
                        libro.agregarFirma(nombre);
                    }
                    case "3" -> {
                        break OUTER;
                    }
                    default -> System.out.println("Opción inválida.");
                }
            }
            System.out.println("###########################################");
            System.out.println("\tGracias por usar este programa.");
            System.out.println("###########################################");
        }
    }
}
