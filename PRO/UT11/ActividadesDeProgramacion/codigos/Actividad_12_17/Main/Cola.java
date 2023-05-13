package Main;

import java.util.ArrayList;

/**
 *
 * @author juancfm
 */
public class Cola {
    private ArrayList<Integer> elementos;

    public Cola() {
        elementos = new ArrayList<>();
    }

    public void encolar(int elemento) {
        elementos.add(elemento);
    }

    public void desencolar() {
        if (elementos.isEmpty()) {
            System.out.println("Cola Vacía");
        }
        System.out.println("Elemento desencolado: " + elementos.remove(0));
    }

    public void consultarPrimero() {
        if (elementos.isEmpty()) {
            System.out.println("Cola Vacía");
        }
        System.out.println("El primer elemento es: " + elementos.get(0));
    }

    public int tamano() {
        return elementos.size();
    }

    public boolean estaVacia() {
        return elementos.isEmpty();
    }
}
