package resuelta11.pkg09;

import java.io.*;
import java.util.*;

public class Resuelta1109 {

    public static void main(String[] args) {
        Registro[] reg = new Registro[0];
        try ( ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("temperaturas.dat"))) {
            reg = (Registro[]) in.readObject();
        } catch (FileNotFoundException ex) {
            System.out.println("Registro vacío");
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
        int opcion;
        do {
            System.out.println("1.Nuevo registro");
            System.out.println("2.Mostrar historial de registros");
            System.out.println("3.Salir");
            System.out.print("\nIntroducir opción: ");
            opcion = new Scanner(System.in).nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.print("Introducir temperatura: ");
                    double temperatura = new Scanner(System.in)
                            .useLocale(Locale.US).nextDouble();
                    Registro nuevo = new Registro(temperatura);
                    reg = Arrays.copyOf(reg, reg.length + 1);
                    reg[reg.length - 1] = nuevo;
                }
                case 2 ->
                    System.out.println(Arrays.deepToString(reg));
            }
        } while (opcion != 3);
        try ( ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("temperaturas.dat"))) {
            out.writeObject(reg);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

}
