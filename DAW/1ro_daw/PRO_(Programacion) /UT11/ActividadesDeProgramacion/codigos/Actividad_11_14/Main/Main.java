package Main;

import java.io.*;
import java.util.Scanner;

/**
 * @author juancfm
 */
public class Main {
    
    /**
     * 11.14. Introduce por teclado una frase y guardala en un archivo binario.
     * A continuación, recuperala y muéstrala por pantalla.
     */

    final static String FILENAME = "frase.dat";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int option = 0;

        while (option != 3) {
            System.out.println("\n---- Menú ----");
            System.out.println("\nSeleccione una opción: ");
            System.out.println("1. Escribir y guardar frase en archivo");
            System.out.println("2. Leer frase y mostrar por pantalla");
            System.out.println("3. Salir");

            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Ingrese una frase:");
                    String frase = sc.nextLine();
                    escribirFraseEnArchivo(frase);
                    break;
                case 2:
                    String fraseRecuperada = leerFraseDeArchivo();
                    System.out.println("###################################"); 
                    System.out.println("La frase recuperada del archivo es: " 
                            + fraseRecuperada);
                    System.out.println("###################################"); 
                    break;
                case 3:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida, por favor "
                            + "seleccione una opción del menú.");
                    break;
            }
        }
    }

    /**
     * Escribe una frase en un archivo binario.
     *
     * @param frase La frase a escribir en el archivo.
     */
    public static void escribirFraseEnArchivo(String frase) {
        try (ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream(FILENAME))) {
            out.writeObject(frase);
            System.out.println("Frase guardada en el archivo correctamente.");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al guardar la frase en "
                    + "el archivo: " + e.getMessage());
        }
    }

    /**
     * Lee una frase de un archivo binario y la devuelve como una cadena.
     *
     * @return La frase leída del archivo.
     */
    public static String leerFraseDeArchivo() {
        String fraseRecuperada = null;
        try (ObjectInputStream in = new ObjectInputStream(
                new FileInputStream(FILENAME))) {
            fraseRecuperada = (String) in.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al leer el archivo: " 
                    + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("La clase requerida no se encuentra "
                    + "en el classpath: " + e.getMessage());
        }
        return fraseRecuperada;
    }
}