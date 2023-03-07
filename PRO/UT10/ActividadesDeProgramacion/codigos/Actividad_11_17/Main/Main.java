package Main;

import java.io.*;
import java.util.Scanner;

/**
 * @author juancfm
 */
public class Main {
    /**
     * 11.17. Escribe un texto, línea a línea, de forma que, cada vez que se
     * pulse Intro, se guarde la línea en un archivo binario. El proceso se
     * termina cuando introduzcamos una línea va cía. Después el programa lee el
     * texto completo del archivo y lo muestra por pantalla .
     */
    final static String FILENAME = "texto.dat";

    public static void main(String[] args) {
        guardarTexto();
        leerTexto();
    }

    public static void guardarTexto() {
        try (ObjectOutputStream outputFile = new ObjectOutputStream(
                new FileOutputStream(FILENAME));
             Scanner scanner = new Scanner(System.in)) {
            String line;
            do {
                System.out.print("Introduce una línea: ");
                line = scanner.nextLine();
                outputFile.writeObject(line);
            } while (!line.isEmpty());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void leerTexto() {
        try (ObjectInputStream inputFile = new ObjectInputStream(
                new FileInputStream(FILENAME))) {
            Object obj;
            while ((obj = inputFile.readObject()) != null) {
                String line = (String) obj;
                System.out.println(line);
            }
        } catch (EOFException e) {
            System.out.println("Fin del archivo.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
