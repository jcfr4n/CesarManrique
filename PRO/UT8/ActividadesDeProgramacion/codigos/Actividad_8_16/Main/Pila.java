package Main;

public class Pila extends Lista {

   void apilar(Integer elemento) {
      this.insertarFinal(elemento);
   }

   Integer desapilar() {
      return this.eliminar(this.tabla.length - 1);
   }

   @Override
   public void mostrar() {
      this.mostrar();
   }
}
