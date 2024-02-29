package Main;

import java.io.*;
import java.util.*;

/**
 *
 * @author juancfm
 */
public class Main {

    public static void main(String[] args) {
        /**
         * 10.13. Implementa un programa que lea dos listas de números enteros
         * no ordenados desde dos archivos con un número por línea, los reúna en
         * una lista única y los guarde en orden creciente en un tercer archivo,
         * de nuevo uno por línea.
         */

        String fichero1 = "file1.txt";
        String fichero2 = "file2.txt";
        String ficheroSalida = "output.txt";

        // Leer números de los archivos
        List<Integer> numbers1 = leerNumeros(fichero1);
        List<Integer> numbers2 = leerNumeros(fichero2);

        // Unir las listas de números
        List<Integer> numerosAgrupados = new ArrayList<>(numbers1);
        numerosAgrupados.addAll(numbers2);

        // Ordenar la lista de números
        Collections.sort(numerosAgrupados);

        // Guardar la lista ordenada en un archivo
        guardarNumeros(ficheroSalida, numerosAgrupados);
    }

    public static List<Integer> leerNumeros(String nombreArchivo) {
        List<Integer> numeros = new ArrayList<>();
        try (BufferedReader bR
                = new BufferedReader(new FileReader(nombreArchivo))) {
            String line;
            while ((line = bR.readLine()) != null) {
                try {
                    int numero = Integer.parseInt(line.trim());
                    numeros.add(numero);
                } catch (NumberFormatException e) {
                    System.err.println("Error al parsear número en archivo "
                            + nombreArchivo + ": " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer archivo " + nombreArchivo + ": " 
            + e.getMessage());
        }
        return numeros;
    }

    public static void guardarNumeros(String nombreArchivo, 
            List<Integer> numeros) {
        try (BufferedWriter bW
                = new BufferedWriter(new FileWriter(nombreArchivo))) {
            for (int numero : numeros) {
                bW.write(Integer.toString(numero));
                bW.newLine();
            }
            System.out.println("Archivo " + nombreArchivo
                    + " guardado correctamente.");
        } catch (IOException e) {
            System.err.println("Error al guardar archivo " + nombreArchivo + 
                    ": " + e.getMessage());
        }
    }
}
