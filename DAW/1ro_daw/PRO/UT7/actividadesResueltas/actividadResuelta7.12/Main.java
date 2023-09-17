package codigo;

public class Main {

   public static void main(String[] args) {
      Lista l1 = new Lista();
      Lista l2 = new Lista();

      l1.insertarFinal(1); l1.insertarFinal(1); l1.insertarFinal(2); l1.insertarFinal(3);
      l2.insertarFinal(10); l2.insertarFinal(20); l2.insertarFinal(30);
      
      Lista concatenacion = Lista.concatena(l1, l2);
      
      concatenacion.mostrar();
   }
}
