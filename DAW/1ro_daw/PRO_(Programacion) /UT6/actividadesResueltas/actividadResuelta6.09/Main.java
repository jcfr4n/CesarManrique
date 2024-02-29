import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String frase = "", palabra; 
      System.out.print("Escriba una palabra: ");
      palabra = sc.next(); 
      while (!palabra.toLowerCase().equals("fin")) {
         frase = frase + " " + palabra; 
         System.out.print("Escriba una palabra: ");
         palabra = sc.next();
      }
      System.out.println(frase); 
   }
}
