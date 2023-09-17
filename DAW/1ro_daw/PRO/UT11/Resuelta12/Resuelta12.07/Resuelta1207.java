package resuelta12.pkg07;

import java.util.ArrayList;
import java.util.Collection;

public class Resuelta1207 {

    public static void main(String[] args) {
        Collection<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            lista.add((int) (Math.random() * 10 + 1));
        }
        System.out.println(lista);
        Collection<Integer> c = new ArrayList<>();
        c.add(5); 
        lista.removeAll(c); 
        System.out.println(lista);
    }

}
