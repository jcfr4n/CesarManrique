/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Actividad_4_14;

import java.util.Scanner;

/**
 *
 * @author juancfm
 */
public class Main {

    /**
     * 4.14. Escribe una función a la que se pase como parámetros de entrada una
     * cantidad de días, horas y minutos. La función calculará y devolverá el
     * número de segundos que existen en los datos de entrada.
     *
     */
    public static void main(String[] args) {
        int d, h, m;
        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos a calcular los segundos que hay en los datos "
                + "proporcionados por el usuario.");

        System.out.print("\nDías: ");
        d = sc.nextInt();
        System.out.print("\nHoras: ");
        h = sc.nextInt();
        System.out.print("\nMinutos: ");
        m = sc.nextInt();

        calcularSegundos(d, h, m);
    }

    /**
     * Calcula los segundos que hay en los parámetros introducidos
     *
     * @param d Cantidad de días
     * @param h Cantidad de horas
     * @param m Cantidad de segundos
     */
    private static void calcularSegundos(int d, int h, int m) {
        int result = (((d * 24 + h) * 60 + m) * 60);
        System.out.println("\nHay " + result + " segundos.");
    }

}
