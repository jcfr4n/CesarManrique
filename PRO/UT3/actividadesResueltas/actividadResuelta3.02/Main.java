package codigo;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int sumaEdades = 0; 
      int contadorAlumnos = 0, 
              contadorMayorEdad = 0; 
      double media; 

      System.out.print("Introduzca edad: ");
      int edad = sc.nextInt();

      while (edad >= 0) { 
         sumaEdades += edad; 
         contadorAlumnos++; 
         if (edad >= 18) { 
            contadorMayorEdad++; 
         }
         System.out.print("Introduzca edad: ");
         edad = sc.nextInt(); 
      }
      media = (double) sumaEdades / contadorAlumnos; 

      System.out.println("Suma de todas las edades: " + sumaEdades);
      System.out.println("Media: " + media);
      System.out.println("Número total de alumnos: " + contadorAlumnos);
      System.out.println("Mayores de edad: " + contadorMayorEdad);
   }
}
