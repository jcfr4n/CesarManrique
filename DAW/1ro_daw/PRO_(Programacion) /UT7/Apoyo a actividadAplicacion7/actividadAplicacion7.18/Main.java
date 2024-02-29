public class Main {

   public static void main(String[] args) {
      Cola c = new Cola();
      for (int i = 1; i <= 10; i++) {
         c.encola(i);
      }
      
      System.out.println("Primero: " + c.primero());
      System.out.println("Vacía: " + c.vacia());
      while(!c.vacia()) {
         System.out.println(c.desencola());
      }
   }
}
