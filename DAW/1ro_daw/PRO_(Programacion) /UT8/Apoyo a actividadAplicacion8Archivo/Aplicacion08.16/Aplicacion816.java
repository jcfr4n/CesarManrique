package aplicacion8.pkg16;

public class Aplicacion816 {

    public static void main(String[] args) {
        
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
