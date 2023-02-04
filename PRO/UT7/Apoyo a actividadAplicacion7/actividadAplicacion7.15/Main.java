public class Main {

   public static void main(String[] args) {
      Calendario c = new Calendario(31, 12, 2021);
      c.mostrar();
      c.incrementarDia();
      c.mostrar();
      c.incrementaMes();
      c.mostrar();
      
      Calendario a = new Calendario(1, 2, 2022);
      System.out.println("Iguales: " + c.iguales(a));
   }
}
