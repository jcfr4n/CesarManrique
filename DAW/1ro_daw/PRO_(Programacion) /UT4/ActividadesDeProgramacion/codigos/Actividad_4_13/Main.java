/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Actividad_4_13;

import java.util.Scanner;

/**
 *
 * @author juancfm
 */
public class Main {

    /**
     * 4.13. Crea la función muestraPares(int n) que muestre por consola los
     * primeros n números pares.
     *
     */
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos a calcular los primeros n números pares"
                + " a partir de 0.");

        System.out.print("\n¿Cuántos números desea conocer: ");
        n = sc.nextInt();

        muestraPares(n);
    }

    /**
     * Muestra los primeros n números pares.
     *
     * @param n Cantidad de números pares a mostrar.
     */
    private static void muestraPares(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i + ".-\t" + i * 2);
        }
    }

}
