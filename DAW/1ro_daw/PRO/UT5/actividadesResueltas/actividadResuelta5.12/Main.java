package codigo;

import java.util.Arrays;

public class Main {

   public static void main(String[] args) {
      int t[][]; 
      t = new int[5][5]; 

      for (int i = 0; i < 5; i++) { 
         for (int j = 0; j < 5; j++) { 
            t[i][j] = 10*i + j;
         }
      }

      System.out.println(Arrays.deepToString(t));
      for (int fila[] : t) { 
         for (int columna: fila) {
            System.out.print(columna + " ");
         }
         System.out.println();
      }
   }
}
