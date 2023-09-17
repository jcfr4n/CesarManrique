package Main;

/**
 *
 * @author juancfm
 */
public class Main {

    public static void main(String[] args) {
        
        /**
         * 8.16. Diseña la clase Pila heredando de Lista (ver Actividad 
         * resuelta 7.13).
         */
        
        Pila p = new Pila();
        for (int i = 0; i < 10; i++) {
            p.apilar(i);
        }
        
        System.out.println(p);

        Integer n = p.desapilar();
        while (n != null) {
            System.out.println(n);
            n = p.desapilar();
        }
    }

}
