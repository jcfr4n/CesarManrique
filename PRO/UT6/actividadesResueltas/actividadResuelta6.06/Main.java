import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String nombre, sinVocales = "";
      char c;
      System.out.print("Escriba su nombre completo: ");
      nombre = sc.nextLine();
      for (int i = 0; i < nombre.length(); i++) {
         c = nombre.charAt(i);
         if (!esVocal(c)) {
            sinVocales = sinVocales + c;
         }
      }
      System.out.println(sinVocales);
   }

   static boolean esVocal(char c) {
      boolean result; 
      String vocales = "aeiouáéíóúü"; 
      c = Character.toLowerCase(c); 
      if (vocales.indexOf(c) == -1) { 
         result = false; 
      } else {
         result = true; 
      }
      return result;
   }
}
