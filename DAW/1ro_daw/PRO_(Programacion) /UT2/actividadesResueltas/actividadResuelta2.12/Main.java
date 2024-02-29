package codigo;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int dia, mes, año;
      boolean fechaCorrecta; 
      System.out.print("Introduzca día: ");
      dia = sc.nextInt();
      System.out.print("Introduzca mes: ");
      mes = sc.nextInt();
      System.out.print("Introduzca año: ");
      año = sc.nextInt();

      if (año == 0) { 
         fechaCorrecta = false;
      } else {
         if (mes == 2 && (1 <= dia && dia <= 28)) {
            fechaCorrecta = true;
         } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11)
                 && (1 <= dia && dia <= 30)) {
            fechaCorrecta = true;
         } else if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8
                 || mes == 10 || mes == 12)
                 && (1 <= dia && dia <= 31)) {
            fechaCorrecta = true;
         } else { 
            fechaCorrecta = false;
         }
      }
      if (fechaCorrecta) {
         System.out.println("Fecha correcta: " + dia + "/" + mes + "/" + año);
      } else {
         System.out.println("Fecha incorrecta");
      }
   }
}