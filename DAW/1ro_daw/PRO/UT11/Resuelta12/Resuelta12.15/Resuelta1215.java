package resuelta12.pkg15;

import java.io.*;
import java.util.*;

public class Resuelta1215 {

    public static void main(String[] args) {
        Map<String, Integer> existencias = new TreeMap<>();
        try ( ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("existencias.dat"))) {
            existencias = (TreeMap<String, Integer>) in.readObject();
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
        int opcion;
        do {
            System.out.println("1.Alta producto");
            System.out.println("2.Baja producto");
            System.out.println("3.Cambio stock de producto");
            System.out.println("4.Listar existencias");
            System.out.println("5.Salir");
            System.out.print("\nIntroducir opción: ");
            opcion = new Scanner(System.in).nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.print("Código producto: ");
                    String codigo = new Scanner(System.in).next();
                    if (!existencias.containsKey(codigo)) {
                        existencias.put(codigo, 0);
                    } else {
                        System.out.println("El producto ya existe");
                    }
                }
                case 2 -> {
                    System.out.print("Código producto: ");
                    String codigo = new Scanner(System.in).next();
                    existencias.remove(codigo);
                }
                case 3 -> {
                    System.out.print("Código producto: ");
                    String codigo = new Scanner(System.in).next();
                    System.out.print("Nuevo stock: ");
                    int stock = new Scanner(System.in).nextInt();
                    existencias.put(codigo, stock);
                }
                case 4 -> {
                    System.out.println(existencias);
                }
            }
        } while (opcion != 5);
        try ( ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("existencias.dat"))) {
            out.writeObject(existencias);
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
