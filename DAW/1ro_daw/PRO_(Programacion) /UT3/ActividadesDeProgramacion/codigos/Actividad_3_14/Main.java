package Actividad_3_14;
import java.util.Scanner;

/**
 * @author juancfm
 */
public class Main {

    /* 
    * Realiza un programa que nos pida un número n, y nos diga cuántos 
    * números hay entre 1 y n que sean primos.
     */

    public static void main(String[] args) {
        int i, j, n, contador = 0;
        boolean primo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número y le diré cuántos");
        System.out.print("números primos hay entre ese número y el 1: ");
        n = sc.nextInt();
        System.out.println("\n");

        for (i = 2; i <= n; i++) {
            primo = true;
            for (j = i - 1; j > 1; j--) {
                if (i % j == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                System.out.println(i + " es primo");
                contador++;
            }
        }

        System.out.println("\nSe contabilizaron: " + contador
                + " números primos.");

        System.out.println("fin");

    }

}