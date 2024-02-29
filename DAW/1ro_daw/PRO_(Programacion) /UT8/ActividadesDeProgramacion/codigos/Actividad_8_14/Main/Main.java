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
         * 8.14. Reimplementa la clase Lista de la Actividad resuelta 7.11, 
         * sustituyendo el método mostrar () por el método toString ().
         */

     Lista l1 = new Lista();
        for (int i = 0; i < 3; i++) {
            l1.insertarFinal(i);
        }
         System.out.println("l1: "+l1);
        Lista l2 = new Lista();
        for (int i = 0; i < 3; i++) {
            l2.insertarFinal(i);
        }
        System.out.println("l2: "+l2);
    }
    
}
