package codigo;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n1, n2; 
      int mayor, menor;

      System.out.print("Introduzca un número: ");
      n1 = sc.nextInt();
      System.out.print("Introduzca otro: ");
      n2 = sc.nextInt();

      mayor = n1 > n2 ? n1 : n2; //si n1 es mayor que n2, entonces mayor = n1, si no = n2
      menor = n1 < n2 ? n1 : n2; //si n1 em menor que n2, entonces menor = n1, si no = n1 
      System.out.println(mayor + ", " + menor);
   }
}
