package codigo;

import java.util.*;

public class Main {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      sc.useLocale(Locale.US);
      double a, b, c; 
      double x1, x2, d; 

      System.out.print("Introduzca primer coeficiente (a): ");
      a = sc.nextDouble();
      System.out.print("Introduzca segundo coeficiente: (b): ");
      b = sc.nextDouble();
      System.out.print("Introduzca tercer coeficiente: (c): ");
      c = sc.nextDouble();

      d = (b * b - 4 * a * c);
      if (d < 0) { 
         System.out.println("No existen soluciones reales");
      } else {
         if (a == 0) {//si a es igual a 0
            System.out.println("No es una ecuación de segundo grado");
         } else {
            x1 = (-b + Math.sqrt(d)) / (2 * a); 
            x2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.println("Solución 1: " + x1);
            System.out.println("Solución 2: " + x2);
         }
      }
   }
}
