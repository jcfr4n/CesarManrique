package codigo;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Longitud de la combinación secreta: ");
      int longitud = sc.nextInt();
      int combSecreta[] = new int[longitud]; 
      int combJugador[] = new int [longitud]; 
      
      generaCombinacion(combSecreta); 
      System.out.println(Arrays.toString(combSecreta));  
      System.out.println("Escriba una combinación");
      leeTabla(combJugador);
      
      while (!Arrays.equals(combSecreta, combJugador)) { 
         muestraPistas(combSecreta, combJugador); 
         System.out.println("Escriba una combinación: ");
         leeTabla(combJugador); 
      }
      System.out.println("¡La cámara está abierta!");      
   }
   
   static void generaCombinacion(int t[]) {
      final int MAX = 5; //rango 1..MAX
      for (int i = 0; i < t.length; i++) {
         t[i] = (int) (Math.random()*MAX+1); 
      }
   }
   
   static void leeTabla(int t[]) {
      Scanner sc = new Scanner(System.in);
      for (int i = 0; i < t.length; i++) { 
         t[i] = sc.nextInt();
      }
   }
   
   static void muestraPistas(int secret[], int jug[]) {
      System.out.println("Pistas:");
      for (int i = 0; i < jug.length; i++) { 
         System.out.print(jug[i]); 
         if (secret[i] > jug[i]) { 
            System.out.println(" mayor");
         } else if (secret[i] < jug[i]) {
            System.out.println(" menor");
         } else {
            System.out.println(" igual");
         } 
      }
   }
}