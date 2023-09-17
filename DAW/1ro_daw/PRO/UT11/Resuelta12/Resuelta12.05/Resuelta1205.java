package resuelta12.pkg05;

import java.util.ArrayList;
import java.util.Collection;

public class Resuelta1205 {

    public static void main(String[] args) {
        Collection<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            lista.add((int) (Math.random() * 10 + 1));
        }
        System.out.println(lista);
        Collection<Integer> listaSinRepetidos = new ArrayList<>();
        for (Integer e : lista) {
            if (!listaSinRepetidos.contains(e)) {
                listaSinRepetidos.add(e);
            }
        }
    }

}
