package codigo;

import java.util.Scanner;
public class Main {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      double factorial;
      int num;

      System.out.print("Introduzca un número: ");
      num = sc.nextInt();

      factorial = 1; 
      for (int i = num; i > 0; i--) {
         factorial = factorial * i;
      }
      System.out.println("El factorial de " + num + " es: " + factorial);
   }
}
