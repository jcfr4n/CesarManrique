package aplicacion8.pkg17;

public class Aplicacion817 {

    public static void main(String[] args) {
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
