package Main;

/**
 *
 * @author juancfm
 */
public class Main {

    public static void main(String[] args) {
        
        /**
         * 8.17. Escribe la clase Cola heredando de Lista (ver Actividad final
         * 7.18).
         */
        
        Cola c = new Cola();
        for (int i = 0; i < 10; i++) {
            c.encolar(i);
        }

        System.out.println(c);

        Integer n = c.desencolar();

        while (n != null) {
            System.out.println(n);
            n = c.desencolar();
        }
    }

}

