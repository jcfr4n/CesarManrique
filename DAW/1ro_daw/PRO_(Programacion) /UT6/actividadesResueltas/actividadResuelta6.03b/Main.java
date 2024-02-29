import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String passwd, palabra;
      System.out.print("Jugador 1. Introduzca la contraseña: ");
      passwd = sc.nextLine(); 
      System.out.println("La contraseña tiene " + passwd.length() + " caracteres");
      System.out.print("Jugador 2. Palabra: ");
      palabra = sc.nextLine(); 
      while (!palabra.equals(passwd)) {
         String pista = "";
         for (int i = 0; i < passwd.length(); i++) {
            if (passwd.charAt(i) == palabra.charAt(i)) { 
               pista += passwd.charAt(i); 
            } else {
               pista += '*'; 
            }
         }
         System.out.println(pista); 
         System.out.print("Jugador 2. Introduzca palabra de nuevo: ");
         palabra = new Scanner(System.in).next(); 
      }
      System.out.println("¡Acertaste!"); 
   }
}
