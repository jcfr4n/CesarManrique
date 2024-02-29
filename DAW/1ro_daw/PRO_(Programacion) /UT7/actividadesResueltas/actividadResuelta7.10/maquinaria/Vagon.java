package maquinaria;

class Vagon { 
   int numIdentificativo;
   int cargaMax;
   int cargaActual;
   String mercancia;

   public Vagon(int numIdentificativo, int cargaMax, int cargaActual, String mercancia) {
      this.numIdentificativo = numIdentificativo;
      this.cargaMax = cargaMax;
      this.cargaActual = cargaActual;
      this.mercancia = mercancia;
   }
}
