package resuelta12.pkg11;

import java.io.*;
import java.util.*;

public class Resuelta1211 {

    public static void main(String[] args) {
 
        Set<Socio> socios = new TreeSet<>();
        
        try ( ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("socios.dat"))) {
            socios = (TreeSet<Socio>) in.readObject();
        } catch (IOException ex) {
            System.out.println("Lista de socios vacía");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
        int opcion;
        do {
            System.out.println("1.Alta");
            System.out.println("2.Baja");
            System.out.println("3.Modificación");
            System.out.println("4.Listado por dni");
            System.out.println("5.Listado por antigüedad");
            System.out.println("6.Salir");
            System.out.print("\nIntroducir opción: ");
            opcion = new Scanner(System.in).nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.print("dni: ");
                    String dni = new Scanner(System.in).next();
                    alta(socios, dni);
                }
                case 2 -> {
                    System.out.print("dni socio: ");
                    String dni = new Scanner(System.in).next();
                    socios.remove(new Socio(dni));
                }
                case 3 -> {
                    System.out.print("dni: ");
                    String dni = new Scanner(System.in).next();
                    socios.remove(new Socio(dni));
                    alta(socios, dni);
                }
                case 4 -> {
                    System.out.println(socios);
                }
                case 5 -> {
                    Comparator<Socio> c = new Comparator<>() {
                        @Override
                        public int compare(Socio o1, Socio o2) {
                            return o2.antiguedad() - o1.antiguedad();
                        }
                    };
                    Set<Socio> s = new TreeSet<>(c);
                    s.addAll(socios);
                    System.out.println(s);
                }
            }
        } while (opcion != 6);
        try ( ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("socios.dat"))) {
            out.writeObject(socios);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    static boolean alta(Set<Socio> socios, String dni) {
        System.out.print("nombre: ");
        String nombre = new Scanner(System.in).next();
        System.out.print("fecha de alta (dd/MM/yyyy): ");
        String fechaAlta = new Scanner(System.in).next();
        Socio nuevo = new Socio(dni, nombre, fechaAlta);
        return socios.add(nuevo);
    }

}
