package codigo;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

   public static void main(String[] args) {

      int aux[] = new int[10];
      for(int i=0; i < aux.length; i++) {
         aux[i] = (int)(Math.random()*1000+1); 
      }

      System.out.println("Datos: " + Arrays.toString(aux));
      System.out.println("Eliminar los mayores que: ");
      int valor = new Scanner(System.in).nextInt();
      int eliminados[] = sinMayores(aux, valor);
      
      System.out.println(Arrays.toString(aux));
      System.out.println(Arrays.toString(eliminados));
   }
   
 
   static int[] sinMayores(int t[], int valor) {
      int copia[] = Arrays.copyOf(t, t.length); 
      int i=0;
      
      while (i<copia.length) { 
         if (copia[i] > valor) { 
            copia[i] = copia[copia.length-1]; 
            copia = Arrays.copyOf(copia, copia.length-1); 
         } else {
            i++; 
         }
      }
     
      return copia;
   }
}