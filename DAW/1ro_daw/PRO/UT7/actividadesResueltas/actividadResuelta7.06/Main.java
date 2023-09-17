import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      Hora h = new Hora(); 

      System.out.println("Hora: ");
      int valor = sc.nextInt(); 
      h.setHora(valor); 

      System.out.println("Minuto: ");
      valor = sc.nextInt(); 
      h.setMinuto(valor); 

      System.out.println("Segundo: ");
      valor = sc.nextInt(); 
      h.setSegundo(valor); 

      System.out.println("Cuántos segundos quiere mostrar: ");
      int numSegundos = sc.nextInt();

      for (int i = 0; i <= numSegundos; i++) {
         //mostramos la hora
         System.out.println(h.getHora() + ":" + h.getMinuto() + ":" + h.getSegundo());
         h.incrementaSegundo(); 
      }
   }
}
