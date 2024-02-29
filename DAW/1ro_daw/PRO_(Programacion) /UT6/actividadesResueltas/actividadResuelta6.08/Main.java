import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
      final String prefijo = "Javalín, javalón"; 
      final String sufijo = "javalén, len, len"; 
      Scanner sc = new Scanner(System.in);
      System.out.print("Escriba una frase: ");
      String entrada = sc.nextLine();
      boolean idiomaJavalandia = false; 

      if (entrada.startsWith(prefijo)) { 
         idiomaJavalandia = true; 
         entrada = entrada.substring(prefijo.length()); 
      } else if (entrada.endsWith(sufijo)) { 
         idiomaJavalandia = true; 
         entrada = entrada.substring(0, entrada.length() - sufijo.length()); 
      }
      if (idiomaJavalandia) {
         entrada = entrada.strip(); 
         System.out.println(entrada); 
      } else {
         System.out.println("No está escrito en el idioma de Javalandia");
      }
   }
}
