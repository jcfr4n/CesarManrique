package codigo;

import java.util.Arrays;

public class Main {
   int[] tablaEnteros = new int[0]; 

   public static void main(String[] args) {
      Main m = new Main();   
      for (int i = 0; i < 10; i++) {
         m.insertarFinal(i + 1);
      }
      System.out.println("tabla: " + Arrays.toString(m.tablaEnteros));
   }

   void insertarFinal(int nuevo) {
      tablaEnteros = Arrays.copyOf(tablaEnteros, tablaEnteros.length + 1);
      tablaEnteros[tablaEnteros.length - 1] = nuevo;
   }
}
