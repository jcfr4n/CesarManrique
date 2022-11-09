package codigo;

import java.util.Scanner;

public class Main {

   static int maximo(int a, int b) {
      int max;

      if (a > b) { 
         max = a;
      } else { 
         max = b;
      }

      return (max); 
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Introduzca un número: ");
      int a = sc.nextInt();
      System.out.print("Introduzca otro número: ");
      int b = sc.nextInt();

      System.out.println("El número mayor es: " + maximo(a, b));
   }
}
