package codigo;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      sc.useLocale(Locale.US); 
      double t[] = new double[5]; 

      for (int i = 0; i < 5; i++) { 
         System.out.print("Introduzca un número: ");
         t[i] = sc.nextDouble();
      }

      System.out.println(Arrays.toString(t)); 
   }
}
