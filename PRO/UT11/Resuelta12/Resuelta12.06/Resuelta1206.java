package resuelta12.pkg06;

import java.util.ArrayList;
import java.util.Collection;

public class Resuelta1206 {

    public static void main(String[] args) {
        Collection<Integer> lista = new ArrayList<>();//admite repetidos
        for (int i = 0; i < 100; i++) {
            lista.add((int) (Math.random() * 10 + 1));
        }
        System.out.println(lista);
        boolean eliminado = lista.remove(5);
        while (eliminado) {
            eliminado = lista.remove(5);
        }
        System.out.println(lista);
    }

}
