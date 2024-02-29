package Main;

import java.io.*;

/**
 *
 * @author juancfm
 */
public class Main {

    public static void main(String[] args) {
        /**
         * 10.15. En el archivo numeros.txt disponemos de una serie de números
         * (uno por cada línea). Diseña un programa que procese el fichero y nos
         * muestre el menor y el mayor.
         */
        String archivo = "numeros.txt";
        int minimo = Integer.MAX_VALUE;
        int maximo = Integer.MIN_VALUE;
        try (BufferedReader br = 
                new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                int numero = Integer.parseInt(linea);
                if (numero < minimo) {
                    minimo = numero;
                }
                if (numero > maximo) {
                    maximo = numero;
                }
            }
            System.out.println("El mínimo es: " + minimo);
            System.out.println("El máximo es: " + maximo);
        } catch (IOException e) {
            System.err.println("Ha ocurrido un error: " + e.getMessage());
        }
    }
}
