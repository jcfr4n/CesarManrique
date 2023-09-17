package resuelta11.pkg07;

import java.io.*;
import java.util.Scanner;

public class Resuelta1107 {

    public static void main(String[] args) {
        try ( ObjectOutputStream salida = new ObjectOutputStream(
                new FileOutputStream("numeros.dat"))) {
            System.out.print("Introduce entero: ");
            Scanner s = new Scanner(System.in);
            int numero = s.nextInt();
            while (numero >= 0) {
                salida.writeInt(numero);
                System.out.print("Introduce entero: ");
                s = new Scanner(System.in);
                numero = s.nextInt();
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
        try ( ObjectInputStream entrada = new ObjectInputStream(
                new FileInputStream("numeros.dat"));  
                ObjectOutputStream salida = new ObjectOutputStream(
                        new FileOutputStream("numerosCopia.dat"))) {
            System.out.print("[");
            while (true) {
                int numero = entrada.readInt();
                System.out.print(numero + " ");
                salida.writeInt(numero);
            }
        } catch (EOFException ex) {
            System.out.println("]\nFin de fichero");
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

}
