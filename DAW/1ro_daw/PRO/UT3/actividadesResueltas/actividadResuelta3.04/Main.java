package codigo;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int etiquetaArbolMasAlto, 
              alturaArbolMasAlto; 

      int etiqueta = 0; 
      int altura; 

      System.out.print("Altura del árbol (" + etiqueta + "): ");
      altura = sc.nextInt();
      alturaArbolMasAlto = altura; 
      etiquetaArbolMasAlto = 0; 
      while (altura != -1) {
         if (altura > alturaArbolMasAlto) { 
            alturaArbolMasAlto = altura;
            etiquetaArbolMasAlto = etiqueta;
         }
         etiqueta++; 
         System.out.print("Altura del árbol (" + etiqueta + "): ");
         altura = sc.nextInt();
      }

      if (alturaArbolMasAlto == -1) {
         System.out.println("No hay ningún árbol");
      } else {
         System.out.println("El árbol más alto mide: " + alturaArbolMasAlto);
         System.out.println("Corresponde al árbol con etiqueta:" + etiquetaArbolMasAlto);
      }
   }
}
