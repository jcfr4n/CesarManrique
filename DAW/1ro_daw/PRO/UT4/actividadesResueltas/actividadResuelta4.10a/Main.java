package codigo;

import java.util.*;

public class Main {

   static double aElevadoN(double a, int n) {
      double res = 1; 

      for (int i = 1; i <= n; i++) {
         res = res * a; 
      }

      return (res);
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      sc.useLocale(Locale.US); 
      
      System.out.print("Introduzca base (real): ");
      double base = sc.nextDouble();
      System.out.print("Introduzca exponente (entero no negativo): ");
      int exp = sc.nextInt();

      double res = aElevadoN(base, exp);
      System.out.println(base + " elevado a " + exp + " = " + res);
   }
}
