package Main;

import java.io.*;

/**
 * @author juancfm
 */
public class Main {
    
    final static String FILENAME = "valor.dat";

    public static void main(String[] args) {
        /**
         * Abre el fichero de la Actividad de aplicación 11.11, lee el valor
         * double contenido en él y muéstralo por pantalla.
         *
         */

        try (ObjectInputStream myFile
                = new ObjectInputStream(new FileInputStream(FILENAME))) {

            double valor = myFile.readDouble();
            System.out.println("El valor leído desde el archivo es: " + valor);

        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al leer el archivo: " 
                    + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }
    }
}