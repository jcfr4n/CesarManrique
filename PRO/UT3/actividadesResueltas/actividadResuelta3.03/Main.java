package codigo;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int numSecreto = (int) (Math.random() * 100 + 1); 

      System.out.print("Introduzca un número entre 1 y 100: ");
      int num = sc.nextInt();

      while (numSecreto != num && 
              num != -1) { 
         if (numSecreto < num) { 
            System.out.println("Menor");
         } else { 
            System.out.println("Mayor");
         }
         System.out.print("Introduzca otro número: ");
         num = sc.nextInt();
      }
      
      if (numSecreto == num) {
         System.out.println("Enhorabuena...");
      } else {
         System.out.println("Otra vez será...");
      }
   }
}
