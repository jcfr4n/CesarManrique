package resuelta12.pkg01;

import java.util.Arrays;

public class Resuelta1201 {

    public static void main(String[] args) {
        String cadenas[] = {};//o bien new String[0]
        System.out.println(Arrays.toString(cadenas));
        cadenas = guardar("coche", cadenas);
        cadenas = guardar("avión", cadenas);
        System.out.println(Arrays.toString(cadenas));
    }

    static <E> E[] guardar(E elem, E[] tabla) {
        E[] nuevaTabla = Arrays.copyOf(tabla, tabla.length + 1);
        nuevaTabla[nuevaTabla.length - 1] = elem;
        return nuevaTabla;
    }
}
