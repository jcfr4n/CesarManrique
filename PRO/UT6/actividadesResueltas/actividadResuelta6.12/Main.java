import java.util.*;
public class Main {
   public static void main(String[] args) {
      String palabra1, palabra2;
      System.out.println("Escriba una palabra: ");
      palabra1 = new Scanner(System.in).next(); 
      palabra1 = palabra1.toLowerCase(); 
      System.out.println("Escriba otra: ");
      palabra2 = new Scanner(System.in).nextLine();
      palabra2 = palabra2.toLowerCase(); 
      if (palabra1.length() != palabra2.length()) {
         System.out.println("No son anagramas"); 
      } else {
         char p1[] = palabra1.toCharArray(); 
         char p2[] = palabra2.toCharArray(); 
         Arrays.sort(p1); 
         Arrays.sort(p2);
         if (Arrays.equals(p1,p2)) {
            System.out.println("Son anagramas"); 
         } else {
            System.out.println("No son anagramas");
         }
      }
   }
}
