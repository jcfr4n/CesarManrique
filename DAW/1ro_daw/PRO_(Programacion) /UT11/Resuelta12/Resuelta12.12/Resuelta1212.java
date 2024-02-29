package resuelta12.pkg12;

import java.util.*;

public class Resuelta1212 {

    public static void main(String[] args) {
        Set<Integer> c1 = new HashSet<>();
        c1.add(1);
        c1.add(2);
        c1.add(3);
        c1.add(4);
        c1.add(5);
        System.out.println("c1: " + c1);

        Set<Integer> c2 = new HashSet<>();
        c2.add(4);
        c2.add(5);
        c2.add(6);
        c2.add(7);
        c2.add(8);
        System.out.println("c2: " + c2);

        Set<Integer> union = union(c1, c2);
        System.out.println(union);

        Set<Integer> interseccion = interseccion(c1, c2);
        System.out.println(interseccion);

    }

    static <E> Set<E> union(Set<E> conj1, Set<E> conj2) {
        Set<E> resultado = new HashSet<>(conj1);
        resultado.addAll(conj2);
        return resultado;
    }

    static <E> Set<E> interseccion(Set<E> conj1, Set<E> conj2) {
        Set<E> interseccion = new HashSet<>(conj1);
        interseccion.retainAll(conj2);
        return interseccion;
    }
}
