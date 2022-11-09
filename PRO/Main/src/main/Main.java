/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;
import java.util.*;

/**
 *
 * @author juancfm
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      sc.useLocale(Locale.US);

      System.out.print("Introduzca base (real): ");
      double base = sc.nextDouble();
      System.out.print("Introduzca el exponente: ");
      int exp = sc.nextInt();

      System.out.println("El resultado es: " + aElevadoN(base, exp));
   }

   static double aElevadoN(double a, int n) {
      double res;

      if (n == 0) { 
         res = 1; 
      } else {
         res = a * aElevadoN(a, n - 1); 
      }

      return (res);
   }
    
}
