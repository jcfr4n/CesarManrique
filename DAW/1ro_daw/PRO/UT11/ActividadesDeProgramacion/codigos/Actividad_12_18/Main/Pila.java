package Main;

import java.util.ArrayList;

/**
 *
 * @author juancfm
 */
public class Pila {
    private ArrayList<Integer> elementos;

    public Pila() {
        elementos = new ArrayList<>();
    }

    public void apilar(int elemento) {
        elementos.add(elemento);
    }

    public void desapilar() {
        if (elementos.isEmpty()) {
            System.out.println("Pila Vacía");
        }
        System.out.println(elementos.remove(elementos.size() - 1));
    }

    public void consultarTope() {
        if (elementos.isEmpty()) {
            System.out.println("Pila Vacía");
        }
        System.out.println(elementos.get(elementos.size() - 1));
    }

    public int tamano() {
        return elementos.size();
    }

    public boolean estaVacia() {
        return elementos.isEmpty();
    }
}
