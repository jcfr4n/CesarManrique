package codigo;

import java.util.Arrays;

public class Main {

   public static void main(String[] args) {
      int sin[], con[] = {1, 7, 2, 3, 2, 7, 0, 7, 1, 3, 4, 2, 3, 5};
      sin = sinRepetidos(con);
      System.out.println("Con:" + Arrays.toString(con));
      System.out.println("Sin:" + Arrays.toString(sin));
   }

   static int[] sinRepetidos(int[] t) {
      int temporal[] = new int[0]; 

      for (int elemento : t) {
         if (buscar(temporal, elemento) == -1) { 
            temporal = Arrays.copyOf(temporal, temporal.length + 1);
            temporal[temporal.length - 1] = elemento; 
         }
      }
      return temporal;
   }

   static int buscar(int[] t, int clave) {
      int posicion = -1;
      int i=0;
      while (i < t.length && t[i] != clave) {
         i++;
      }
      
      if (i < t.length) {
            posicion = i;
         }

      return posicion;
   }
}
