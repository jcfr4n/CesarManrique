package codigo;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Introduzca un número de 1 a 7: ");
      int dia = sc.nextInt();
      switch (dia) {
         case 1 -> System.out.println("lunes");
         case 2 -> System.out.println("martes");
         case 3 -> System.out.println("miércoles");
         case 4 -> System.out.println("jueves");
         case 5 -> System.out.println("viernes");
         case 6 -> System.out.println("sábado");
         case 7 -> System.out.println("domingo");
      }
   }
}