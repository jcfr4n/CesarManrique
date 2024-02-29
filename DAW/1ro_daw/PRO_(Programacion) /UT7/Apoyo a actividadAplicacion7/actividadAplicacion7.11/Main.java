
public class Main {

   public static void main(String[] args) {
      Marcapagina marca;
      marca = new Marcapagina();
      marca.siguientePag();
      marca.siguientePag();
      marca.siguientePag();
      System.out.println("Última página: " + marca.ultimaPaginaLeida());
      marca.comenzar();
      System.out.println("Última página: " + marca.ultimaPaginaLeida());
   }
}
