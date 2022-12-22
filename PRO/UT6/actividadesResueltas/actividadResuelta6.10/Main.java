import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String frase, sinEspacios, invertida;
      System.out.print("Introduzca una frase: ");
      frase = sc.nextLine();
      frase = frase.toLowerCase(); 
      sinEspacios = eliminaEspacios(frase);
      invertida = alReves(sinEspacios); 
      if (sinEspacios.equals(invertida)) {
         System.out.println("La frase es palíndroma");
      } else {
         System.out.println("La frase no es palíndroma");
      }
   }

   static String eliminaEspacios(String cadena) {
      String sin = "";
      for (int i = 0; i < cadena.length(); i++) { 
         char c = cadena.charAt(i); 
         if (!Character.isWhitespace(c)) { //si no es un carácter blanco
            sin = sin + c; 
         }
      }
      return sin;
   }

   static String alReves(String original) {
      String nueva = "";
      for (int i = 0; i < original.length(); i++) {
         nueva = original.charAt(i) + nueva; 
      }
      return nueva;
   }
}
