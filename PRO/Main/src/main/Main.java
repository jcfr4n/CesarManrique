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

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Vamos a calcular fibonacci(n)");
      System.out.print("Introduzca n (se recomienda n<40): ");
      int num = sc.nextInt();

      int resultado = fibo(num); 
      System.out.println("\nfibonacci(" + num + ") = " + resultado);
   }

   static int fibo(int num) {
      int res;

      if (num == 0 || num == 1) { 
         res = 1;
      } else {
         res = fibo(num - 1) + fibo(num - 2); 

      }

      return (res);
   }
}
