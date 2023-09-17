public class Hora {
   private byte hora; 
   private byte minuto; 
   private byte segundo;

   public int getHora() {
      return hora; 
   }

   public void setHora(int hora) {
      if (0 <= hora && hora <= 23) {
         this.hora = (byte) hora;
      } else {
         this.hora = 0; 
      }
   }

   public int getMinuto() {
      return minuto; 
   }

   public void setMinuto(int minuto) { 
      if (0 <= minuto && minuto <= 59) {
         this.minuto = (byte) minuto;
      } else {
         this.minuto = 0; 
      }
   }

   public byte getSegundo() {
      return segundo; 
   }

   public void setSegundo(int segundo) { 
      if (0 <= segundo && segundo <= 59) {
         this.segundo = (byte) segundo;
      } else {
         this.segundo = 0; 
      }
   }

   public void incrementaSegundo() {
      segundo++;
      if (segundo == 60) { 
         segundo = 0; 
         minuto++; 
         if (minuto == 60) { 
            minuto = 0; 
            hora++; 
            if (hora == 24) {
               hora = 0; 
            }
         }
      }
   }
}
