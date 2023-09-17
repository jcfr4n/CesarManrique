package codigo;

import java.util.*;

public class Main {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      sc.useLocale(Locale.US); 

      System.out.print("Introduzca un número real positivo o negativo: ");
      double num = sc.nextDouble();
      if (-1 < num && num < 1 && num != 0) {
         System.out.println("Es un número casi-cero");
      } else {
         System.out.println("No es un casi-cero");
      }
   }
}