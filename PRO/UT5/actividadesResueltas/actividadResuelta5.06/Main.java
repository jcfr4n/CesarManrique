package codigo;

import java.util.Arrays;
public class Main {

   public static void main(String[] args) {
      int combinacionGanadora[] = {3, 13, 25, 33, 41, 48}; 
      int apuesta[] = {3, 25, 41, 42, 45, 49};

      System.out.println("Aciertos: " + primitiva(combinacionGanadora, apuesta));
   }

   static int primitiva(int apuesta[], int[] combinacionGanadora) {
      int aciertos = 0;

      for (int a : apuesta) { 
         if (Arrays.binarySearch(combinacionGanadora, a) >= 0) { 
            aciertos++; 
         }
      }
      return (aciertos);
   }
}
