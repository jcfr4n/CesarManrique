/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Actividad_4_15;

import java.util.Scanner;

/**
 *
 * @author juancfm
 */
public class Main {

    /**
     * 4.15. Diseña una función a la que se le pasan las horas y minutos de dos
     * instantes de tiempo. La función devolverá la cantidad de minutos que
     * existen de diferencia entre los dos instantes utilizados.
     *
     */
    public static void main(String[] args) {
        int h0, h1, m0, m1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos a calcular la cantidad de minutos que existen "
                + "de diferencia entre dos instantes utilizados.\n");
        System.out.print("Hora(s) del primer instante: ");
        h0 = sc.nextInt();
        System.out.print("\nMinuto(s) del primer instante: ");
        m0 = sc.nextInt();
        System.out.print("\nHora(s) del segundo instante: ");
        h1 = sc.nextInt();
        System.out.print("\nMinuto(s) del segundo instante: ");
        m1 = sc.nextInt();

        calcularMinutos(h0, m0, h1, m1);
    }

    /**
     * Calcula los minutos de diferencia entre dos instantes dados
     *
     * @param h0 Hora del primer instante
     * @param m0 Minuto del primer instante
     * @param h1 Hora del segundo instante
     * @param m1 Minuto del segundo instante
     */
    private static void calcularMinutos(int h0, int m0, int h1, int m1) {
        int result = Math.abs((h0 * 60 + m0) - (h1 * 60 + m1));

        System.out.println("\nEntre los dos instantes hay " + result
                + " minutos de diferencia.");
    }

}
