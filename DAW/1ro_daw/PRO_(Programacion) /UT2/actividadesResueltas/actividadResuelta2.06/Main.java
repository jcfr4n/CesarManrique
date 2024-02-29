package codigo;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Introduzca un número: ");
      int n1 = sc.nextInt();
      System.out.print("Introduzca otro número: ");
      int n2 = sc.nextInt();

      if (n1 == n2) {
         System.out.println("Son iguales");
      } else {
         if (n1 > n2) {
            System.out.println(n1 + " es mayor que " + n2);
         } else {
            System.out.println(n2 + " es mayor que " + n1);
         }
      }
   }
}