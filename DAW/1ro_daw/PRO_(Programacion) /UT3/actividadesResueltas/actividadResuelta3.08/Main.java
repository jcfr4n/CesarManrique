package codigo;

import java.util.Scanner;
public class Main {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n; 
      int suma = 0; 
      double media; 

       for (int i = 1; i <= 10; i++) {
           System.out.println("Escriba un número: ");

           n = sc.nextInt();
           suma += n; 
       }
       media = suma / 10.0; 
      System.out.println("La media es: " + media); 
   }
}
