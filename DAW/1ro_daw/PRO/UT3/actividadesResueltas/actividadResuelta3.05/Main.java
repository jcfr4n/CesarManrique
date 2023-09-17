package codigo;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      int resultado, operando1, operando2; 
      int numOperaciones = 0;
      do {
          operando1 = (int)(Math.random()*100+1);
          operando2 = (int)(Math.random()*100+1);
          
          System.out.print(operando1 +" + " + operando2 + " = ");
          resultado = new Scanner(System.in).nextInt();
          numOperaciones++;
      } while (resultado == operando1 + operando2);
      
      System.out.println("A conseguido realizar: " + (numOperaciones-1) + 
              " sumas consecutivas");
   }
}
