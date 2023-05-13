package aplicacion12.pkg17;

public class Aplicacion1217 {

    public static void main(String[] args) {
        Cola<Integer> c = new Cola<>();
        for (int i = 0; i < 10; i++) {
            c.encolar(i);
        }

        Integer num = c.desencolar();
        while (num != null) {
            System.out.println(num);
            num = c.desencolar();
        }
    }

}
