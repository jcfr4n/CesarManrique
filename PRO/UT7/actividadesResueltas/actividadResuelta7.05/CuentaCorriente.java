public class CuentaCorriente {
   ... 
   Gestor gestor; 

   CuentaCorriente(String dni, String nombre, Gestor gestor) {
      this(dni, nombre);
      this.gestor = gestor;
   }

   void setGestor(Gestor gestor) {
      this.gestor = gestor;
   }

   void mostrarInformacion() { 
      
      if (gestor == null) { 
         System.out.println("Cuenta sin gestor");
      } else {
         System.out.println("Información del gestor");
         gestor.mostrarInformacion(); 
      }

      System.out.println("Información de la cuenta");
      System.out.println("Nombre: " + nombre);
      System.out.println("Dni: " + dni);
      System.out.println("Saldo: " + saldo);
   }
}
