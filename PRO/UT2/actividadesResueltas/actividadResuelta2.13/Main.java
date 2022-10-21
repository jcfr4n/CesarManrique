package codigo;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int h, m, s;

      System.out.print("Introduzca hora: ");
      h = sc.nextInt();
      System.out.print("Introduzca minutos: ");
      m = sc.nextInt();
      System.out.print("Introduzca segundos: ");
      s = sc.nextInt();

      s++; 

      if (s > 59) { 
         s = 0;        
         m++; 

         if (m > 59) {  
            m = 0; 
            h++; 

            if (h > 23) { 
               h = 0; 
            }
         }
      }
      System.out.println("Hora + 1 segundo: " + h + ":" + m + ":" + s);
   }
}