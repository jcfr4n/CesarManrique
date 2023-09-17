package Main;

import java.io.*;
import java.util.*;

/**
 * @author juancfm
 */
public class Main {
    
    final static String FILENAME = "frase.dat";

    public static void main(String[] args) {
        /**
         * Menú que permite generar una tabla de 10 números double aleatorios
         * y guardarla en un archivo binario, mostrar la tabla por consola
         * y salir del programa.
         *
         */

        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 3) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Generar archivo binario con tabla "
                    + "aleatoria");
            System.out.println("2. Mostrar tabla por consola");
            System.out.println("3. Salir");

            try {
                opcion = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Seleccione una opción válida.");
                sc.nextLine();
                continue;
            }

            switch (opcion) {
                
                case 1 -> generarTablaAleatoria();
                case 2 -> mostrarTablaPorConsola();
                case 3 -> System.out.println("\nHasta luego.");
                default-> System.out.println("\nSeleccione una opción "
                        + "válida.");
                    
            }
        }
    }

    /**
     * Genera una tabla de 10 números double aleatorios y la guarda en
     * un archivo binario FILENAME.
     */
    public static void generarTablaAleatoria() {
        try (ObjectOutputStream myFile
                = new ObjectOutputStream(new FileOutputStream(FILENAME))) {

            double[] tabla = new double[TABLA_SIZE];
            Random rand = new Random();

            for (int i = 0; i < TABLA_SIZE; i++) {
                tabla[i] = rand.nextDouble() * 100;
            }

            myFile.writeObject(tabla);
                    
            System.out.println("\nLa tabla aleatoria se ha guardado "
                    + "correctamente en el archivo binario.\n");

        } catch (IOException e) {
            System.out.println("\nHa ocurrido un error al guardar la tabla "
                    + "en el archivo: " + e.getMessage() + "\n");
        } catch (Exception e) {
            System.out.println("\nHa ocurrido un error: " 
                    + e.getMessage() + "\n");
        }
    }

    /**
     * Lee el archivo binario FILENAME, muestra la tabla por consola y
     * cierra el archivo.
     */
    public static void mostrarTablaPorConsola() {
        try (ObjectInputStream myFile
                = new ObjectInputStream(new FileInputStream(FILENAME))) {

            double[] tabla = (double[]) myFile.readObject();
            System.out.println("\nLa tabla es la siguiente: \n");

            for (double valor : tabla) {
                System.out.println(valor);
            }
            System.out.println("\n");

        } catch (FileNotFoundException e) {
            System.out.println("\nNo se ha encontrado el archivo: " 
                    + e.getMessage() + "\n");
        } catch (IOException e) {
            System.out.println("\nHa ocurrido un error al leer el archivo: " 
                    + e.getMessage() + "\n");
        } catch (ClassNotFoundException e) {
            System.out.println("\nNo se ha encontrado la clase necesaria "
                    + "para leer el archivo: " + e.getMessage() + "\n");
        } catch (Exception e) {
            System.out.println("\nHa ocurrido un error: " + e.getMessage() 
                    + "\n");
        }
    }
}