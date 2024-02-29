public class Main {

   public static void main(String[] args) {
      Punto p1 = new Punto(1, 4);
      p1.desplazaX(1);
      p1.desplazaY(-2);
      p1.muestra();
      Punto p2 = new Punto(3, 3);
      
      System.out.println("Distancia: " + p1.distanciaEuclidea(p2));
   }
}
