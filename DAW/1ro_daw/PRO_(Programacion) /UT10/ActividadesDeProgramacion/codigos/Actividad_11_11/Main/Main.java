package Main;

import java.io.*;
import java.util.*;

/**
 * @author juancfm
 */
public class Main {
    
    final static String FILENAME = "valor.dat";

    public static void main(String[] args) {
        /**
         * Pide un valor double por consola y guardalo en un archivo binario.
         *
         */

        Scanner sc = new Scanner(System.in);
        double valor;

        System.out.println("Ingrese un valor double: ");
        try {
            valor = sc.nextDouble();
            escribir(valor);
        } catch (InputMismatchException e) {
            System.out.println("Necesitamos un número. ");
        }
    }

    /**
     * escribe el fichero
     * @param valor El valor que se va a escribir
     */
    public static void escribir (double valor){

        try (ObjectOutputStream myFile
                = new ObjectOutputStream(new FileOutputStream(FILENAME))) {

            myFile.writeDouble(valor);
                    
            System.out.println("El valor se ha guardado correctamente en "
                    + "el archivo binario.");

        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al guardar el valor "
                    + "en el archivo: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }
    }
}