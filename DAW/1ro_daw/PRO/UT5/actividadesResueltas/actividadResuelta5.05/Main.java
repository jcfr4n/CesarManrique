package codigo;

import java.util.Arrays;

public class Main {

   public static void main(String[] args) {
      int t[] = rellenaPares(10, 100); 
      
      System.out.println(Arrays.toString(t)); 
   }

   
   static int[] rellenaPares(int tam, int fin) {
      int pares[] = new int[tam];

      int i = 0; 
      
      while (i < pares.length) {
         int num = (int)(Math.random()*fin + 1);
         if (num % 2 == 0) { 
            pares[i] = num;  
            i++; 
         } 
      }

      Arrays.sort(pares);
      return (pares);
   }
}
