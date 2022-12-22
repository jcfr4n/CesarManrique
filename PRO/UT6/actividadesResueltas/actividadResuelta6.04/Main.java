import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String frase;
      int numEspaciosBlanco = 0; 
      char c;
      System.out.print("Escriba una frase: ");
      frase = sc.nextLine();
      for (int i = 0; i < frase.length(); i++) {
         c = frase.charAt(i); 
         if (Character.isSpaceChar(c)) { 
            numEspaciosBlanco++; 
         }
      }
      System.out.println("Tiene: " + numEspaciosBlanco + " espacios en blanco");
   }
}
