/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadoraEjemplo;

/**
 *
 * @author juancfm
 *
 */
/**
 * Clase para realizar la operación de división.
 */
public class Division {

    /**
     * Método que divide dos números decimales.
     *
     * @param a el numerador
     * @param b el denominador
     * @return el cociente de los dos números decimales
     * @throws ArithmeticException si el denominador es cero
     */
    public static double calcular(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("\nNo se puede dividir entre cero.\n");
        }
        return a / b;
    }

}
