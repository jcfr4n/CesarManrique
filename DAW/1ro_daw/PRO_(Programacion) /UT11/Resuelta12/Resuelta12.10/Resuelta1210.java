package resuelta12.pkg10;

import java.util.*;

public class Resuelta1210 {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            lista.add((int) (Math.random() * 10) + 1);
        }

        Comparator<Integer> c = Comparator.naturalOrder();
        lista.sort(c);
        
        System.out.println("Lista original: " + lista);
        Set<Integer> sinRepeticiones = new TreeSet<>();
        sinRepeticiones.addAll(lista);
        System.out.println("Sin repeticiones: " + sinRepeticiones);
        
        Set<Integer> repetidos = new TreeSet<>();
        for (Integer e : sinRepeticiones) {
            lista.remove(e);         }

        repetidos.addAll(lista);
        System.out.println("Repetidos: " + repetidos);
        Set<Integer> unicos = new TreeSet<>();
        unicos.addAll(sinRepeticiones);
        unicos.removeAll(repetidos);
        System.out.println("Elementos no repetidos: " + unicos);
    }

}
