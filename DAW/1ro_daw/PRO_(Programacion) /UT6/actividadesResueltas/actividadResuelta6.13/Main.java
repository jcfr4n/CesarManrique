import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String frase;
      int[] numVeces; 
      System.out.print("Introduzca una frase: ");
      frase = sc.nextLine();
      frase = frase.toLowerCase();
      numVeces = new int['z' - 'a' + 1];
      for (int i = 0; i < frase.length(); i++) { 
         if (Character.isLetter(frase.charAt(i))) { 
            numVeces[frase.charAt(i) - 'a']++; 
         }
      }
      for (int i = 0; i < 'z' - 'a' + 1; i++) { 
         if (numVeces[i] != 0) { 
            System.out.println("La letra " + (char) (i + 'a') +
                               " se repite " + numVeces[i] + " veces");
         }
      }
   }
}
