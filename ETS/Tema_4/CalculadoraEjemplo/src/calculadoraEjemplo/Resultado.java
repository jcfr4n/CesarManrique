/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadoraEjemplo;

/**
 * Clase para presentar los resultados de las operaciones realizadas
 * 
 * @author juancfm
 */
public class Resultado {

    public static void presentarResultado(String operacion, double numero) {
        System.out.println("\n\n########################################\n");
        System.out.print("El resultado de la " + operacion + " es: ");
        System.out.printf("%.2f", numero);
        System.out.println("");
        System.out.println("\n########################################\n\n");
    }
}
