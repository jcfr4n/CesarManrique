package codigo;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Cuántos números desea introducir: ");
      int cuantosNumeros = sc.nextInt();

      int t[] = new int[cuantosNumeros]; 

      for (int i = 0; i < t.length; i++) { 
         System.out.print("Introduzca un número: ");
         t[i] = sc.nextInt();
      }

      System.out.println("Los números en orden inverso son: ");
      for (int i = t.length - 1; i >= 0; i--) { 
         System.out.println(t[i]);
      }
   }
}
