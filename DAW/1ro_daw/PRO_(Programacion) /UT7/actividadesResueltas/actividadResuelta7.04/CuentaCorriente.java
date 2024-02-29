package codigo;

public class CuentaCorriente {
   ...
   static private String nombreBanco = "International Java Bank"; 

   static void setBanco(String nuevoNombre) {
      nombreBanco = nuevoNombre;
   }
   
   static String getBanco() {
      return nombreBanco;
   }
}
