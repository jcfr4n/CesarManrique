package resuelta10.pkg01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Resuelta1001 {

    public static void main(String[] args) {
        Integer n = leerEntero();
        System.out.println(n);
    }

    static Integer leerEntero() {
        Integer resultado;
        while (true) {
            try {
                System.out.print("Introducir entero: ");
                resultado = new Scanner(System.in).nextInt();
                break;
            } catch (InputMismatchException ex) {
                System.out.println("Tipo erróneo");
            }
        }
        return resultado;
    }
    /*Solución recursiva para evitar el uso de break:
    static Integer leerEntero() {
        Integer resultado;
        try {
            System.out.print("Introducir entero: ");
            resultado = new Scanner(System.in).nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Tipo erróneo");
            resultado = leerEntero();
        }
        return resultado;
    }*/

}
