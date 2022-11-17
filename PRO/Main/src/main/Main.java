/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.Scanner;

/**
 *
 * @author juancfm
 */
public class Main {

    public static void main(String[] args) {
        double radio;
        String option = "";
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor indique el radio de la figura a evaluar: ");
        radio = sc.nextDouble();
        System.out.println("Ahora seleccione una opcion para: ");
        System.out.println("1  Calcular la superficie o área.");
        System.out.println("2  Calcular el volumen de la esfera.");
        System.out.println("3  Calcular ambos.\n");
        System.out.print("Opción: ");
        option = sc.next("[123]");
        System.out.println("\n");
        switch (option) {
            case "1" ->
                superficie(radio);
            case "2" ->
                volumen(radio);
            case "3" -> {
                superficie(radio);
                volumen(radio);
            }

        }

    }

    /**
     * Calcula la superficie de la circunferencia a partir de su radio
     *
     * @param radio radio de la circunferencia
     */
    static void superficie(double radio) {
        System.out.println("El área de la circunferencia es: "
                + (4 * Math.PI * Math.pow(radio, 2)));
    }

    /**
     * Calcula el volumen de una esfera a partir de su radio
     *
     * @param radio radio de la esfera
     */
    static void volumen(double radio) {
        System.out.println("El volumen de la esfera es: "
                + ((4 * Math.PI) / 3 * Math.pow(radio, 3)));
    }

}
