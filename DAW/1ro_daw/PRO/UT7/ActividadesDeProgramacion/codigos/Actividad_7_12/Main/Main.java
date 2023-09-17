/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit
 * this template
 */
package Main;

/**
 * @author juancfm
 */

public class Main {

    /**
     *
     * 7.12. Implementa una clase que permita resolver ecuaciones de segundo 
     * grado. Los coeficientes pueden indicarse en el constructor y modificarse 
     * a posteriori. Es fundamental que la clase disponga de un método que 
     * devuelva las distintas soluciones y de un método que nos informe si el 
     * discriminante es positivo.
     *
     */
    public static void main(String[] args) {
        
      Ecuacion2Grado ec = new Ecuacion2Grado(1, -3, 2);
      System.out.println(ec.esPositivoDiscriminante());
      double soluciones[] = ec.solucion();
      System.out.println("x1: " + soluciones[0]);
      System.out.println("x2: " + soluciones[1]);
      
      ec.setB(1);
      System.out.println("x1: " + ec.solucion()[0]);
        
    }

}
