import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String antes, despues;
      System.out.print("Escriba una cadena: ");
      antes = sc.nextLine();
      despues = alReves(antes); 
      System.out.println(despues);
   }

   static String alReves(String original) {
      String nueva = "";
      for (int i = 0; i < original.length(); i++) {
         nueva = original.charAt(i) + nueva; 
      }
      return nueva;
   }
}
