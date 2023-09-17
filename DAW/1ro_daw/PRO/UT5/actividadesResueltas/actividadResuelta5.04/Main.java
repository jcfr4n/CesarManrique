package codigo;


public class Main {

   static int maximo(int t[]) {
      int max = t[0]; 

      for (int e : t) { 
         if (e > max) { 
            max = e;
         }
      }
      return (max);
   }

   public static void main(String[] args) {
      int numeros[] = {4, -6, 8, 9, 0, 3};
      System.out.println("\nEl número mayor es: " + maximo(numeros));
   }
}
