package codigo;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a, b, resultado;

      System.out.print("Introduzca primer número: ");
      a = sc.nextInt();
      System.out.print("Introduzca segundo número: ");
      b = sc.nextInt();

      resultado = mcd(a, b);
      System.out.println("El mcd es " + resultado);
   }

   static int mcd(int a, int b) {
      int resultado;

      if (a == 0) { 
         resultado = b;
      } else if (b == 0) {
         resultado = a; 
      } else {
         int min = a <= b ? a: b;
         int max = a <= b ? b: a;
         
         resultado = mcd(min, max-min); 
      }
      return (resultado);
   }
}