import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String frase, palabra;
      int veces = 0, pos; 
      System.out.print("Introduzca una frase: ");
      frase = sc.nextLine();
      System.out.print("Introduzca una palabra: ");
      palabra = sc.next();
      pos = frase.indexOf(palabra); 
      while (pos != -1) { 
         veces++; 
         pos = frase.indexOf(palabra, pos + 1); 
      }
      
      if (veces == 0) { 
         System.out.println("\"" + palabra + "\" no se encuentra en la frase");
      } else {
         System.out.println("\"" + palabra + "\" está " + veces + " veces");
      }
   }
}
