package Main;

/**
 *
 * @author juancfm
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * 8.12. Las empresas de transporte, para evitar daños en los paquetes, 
         * embalan todas sus mercancías en cajas con el tamaño adecuado.
         * Una caja se crea expresamente con un ancho, un alto y un fondo y, 
         * una vez creada, se mantiene inmutable. Cada caja lleva pegada una 
         * etiqueta, de un máximo de 30 caracteres, con información útil como 
         * el nombre del destinatario, dirección, etc. Implementa la clase Caja 
         * con los siguientes métodos: 
         * Caja (int ancho, int alto, int fondo, Unidad unidad): que construye 
         * una caja con las dimensiones especificadas, que pueden encontrarse 
         * en «cm  (centímetros) o «m» (metros). 
         * double getVolumen (): que devuelve el volumen de la caja en metros 
         * cúbicos. 
         * void setEtiqueta (String etiqueta): que modifica el valor de la 
         * etiqueta de la caja. 
         * String toString (): que devuelve una cadena con la representación 
         * de la caja.
         */

		Unidad Unidades = Unidad.M;
             Caja cajaGrande = new Caja(1,2,3,Unidades);
             
             Unidades = Unidad.CM;
             Caja cajaPequeña = new Caja(3,3,5,Unidades);
             
             System.out.println((double)cajaGrande.getVolumen());  
             
             System.out.println((double)cajaPequeña.getVolumen());  
             
             // Consultar si se desea definir etiqueta como privada o no
             cajaGrande.setEtiqueta("Monitor");
             cajaPequeña.etiqueta = "Raton";
             
             System.out.println(cajaGrande.etiqueta); 
             System.out.println(cajaPequeña.etiqueta); 
             
             System.out.println(cajaGrande); 
             System.out.println(cajaPequeña); 
    }
    
}
