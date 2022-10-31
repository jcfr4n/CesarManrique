package codigo;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      boolean esPar, esPositivo; 
      System.out.print("Introduzca número: ");
      int num = sc.nextInt(); 

      while (num != 0) { 
         esPar = num % 2 == 0 ? true : false; 
         esPositivo = num >= 0 ? true : false; 
         System.out.println("Es par?: " + esPar + "\nEs positivo?: " + esPositivo);
         System.out.println("Cuadrado: " + num * num);
         System.out.print("Introduzca otro número: ");
         num = sc.nextInt(); // volvemos a leer num
      }
   }
}
