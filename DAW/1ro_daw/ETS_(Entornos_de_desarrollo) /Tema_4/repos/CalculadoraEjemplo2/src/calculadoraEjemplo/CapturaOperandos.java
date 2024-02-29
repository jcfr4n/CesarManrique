/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadoraEjemplo;

/**
 *
 * @author juancfm
 */

import java.util.Scanner;

/**
 * Clase para capturar los operandos introducidos por el usuario.
 */
public class CapturaOperandos {
    
    static Scanner scanner = new Scanner(System.in);

  /**
   * Método que pide al usuario que introduzca un número decimal.
   * 
   * @return el número decimal introducido por el usuario
   */
  public static double pedirNumeroDecimal() {
      
    return scanner.nextDouble();
  }

}
