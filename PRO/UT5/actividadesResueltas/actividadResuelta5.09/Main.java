package codigo;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int puntos[] = new int[5]; 

      for (int i = 0; i < 5; i++) {
         System.out.print("Puntos programador (" + (i + 1) + "): ");
         puntos[i] = sc.nextInt(); 
      }

      Arrays.sort(puntos); 
      System.out.println("Puntuación: " + Arrays.toString(puntos));

      System.out.print("Puntos del programador de exhibición: ");
      int puntosProgExh = sc.nextInt(); 
      while (puntosProgExh != -1) {
         int pos = Arrays.binarySearch(puntos, puntosProgExh); 
         int indiceInsercion; 
         if (pos < 0) {
            indiceInsercion = -pos - 1; 
         } else {
            indiceInsercion = pos; 
         }

         int copia[] = new int[puntos.length + 1]; 
         System.arraycopy(puntos, 0, copia, 0, indiceInsercion);
         System.arraycopy(puntos, indiceInsercion,
                 copia, indiceInsercion + 1, puntos.length - indiceInsercion);

         copia[indiceInsercion] = puntosProgExh; 
         puntos = copia; 

         System.out.print("Puntos del programador de exhibición: ");
         puntosProgExh = sc.nextInt(); 
      }

      System.out.println("Puntuación final: " + Arrays.toString(puntos));
   }
}
