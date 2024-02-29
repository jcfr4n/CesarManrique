package codigo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String original; 
        String intento; 

        do {
            System.out.print("Jugador 1. Introduzca una palabra: ");
            original = new Scanner(System.in).next();
        } while (original.isEmpty());

        String anagrama = creaAnagrama(original);
        System.out.println("A qué palabra correspondo el anagrama: " + anagrama);
        do {
            System.out.println("Jugador 2. ¿Cuál es el original? ");
            intento = new Scanner(System.in).next();
        } while (!original.equals(intento)); 
        System.out.println("Muy bien..."); 
    }

    static String creaAnagrama(String original) {
        char anagrama[] = original.toCharArray(); 

        for (int numCambios = 0; numCambios < anagrama.length; numCambios++) {
            int i = (int) (Math.random() * anagrama.length); 
            int j = (int) (Math.random() * anagrama.length); 
            char aux = anagrama[i]; 
            anagrama[i] = anagrama[j];
            anagrama[j] = aux;
        }
        return String.valueOf(anagrama);  
    }
}
