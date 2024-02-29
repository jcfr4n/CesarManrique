package Main;

import java.io.*;

/**
 *
 * @author juancfm
 */
public class Main {

    public static void main(String[] args) {
        /**
         * 10.14. Escribe un programa que lea un fichero de texto llamado
         * carta.txt. Tenemos que contar los caracteres, las líneas y las
         * palabras. Para simplificar supondremos que cada palabra está separada
         * de otra por un único espacio en blanco o por un cambio de línea.
         */
        String filename = "carta.txt";
        int numCaracteres = 0;
        int numLineas = 0;
        int numPalabras = 0;

        try (BufferedReader br = 
                new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                numLineas++;
                if (!line.trim().isEmpty()) {
                    String[] palabras = line.trim().split("\\s+");
                    numPalabras += palabras.length;
                    for (String palabra : palabras) {
                        numCaracteres += palabra.length();
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }

        System.out.println("Número de caracteres (sin espacios en blanco: " 
                + numCaracteres);
        System.out.println("Número de líneas: " + numLineas);
        System.out.println("Número de palabras: " + numPalabras);
    }

}
