import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String passwd, palabra;
      System.out.print("Jugador 1. Introduzca la contraseña: ");
      passwd = sc.nextLine(); 
      do {
         System.out.print("Jugador 2. Palabra: ");
         palabra = sc.nextLine();
         int comparacion = passwd.compareTo(palabra); 
         if (comparacion == 0) {
            System.out.println("¡Acertaste!"); 
         } else if (comparacion < 0) {
            System.out.println("La contraseña es menor que: " + palabra);
         } else {
            System.out.println("La contraseña en mayor que: " + palabra);
         }
      } while (!passwd.equals(palabra));
   }
}
