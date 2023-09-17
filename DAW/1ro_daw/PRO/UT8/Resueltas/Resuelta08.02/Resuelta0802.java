package resuelta08.pkg02;

import java.util.Scanner;

public class Resuelta0802 {

    public static void main(String[] args) {
        HoraExacta r = new HoraExacta(11, 15, 23); 
        System.out.println(r);
        for (int i = 1; i <= 61; i++) {
            r.inc();
        }
        System.out.println(r);
        System.out.println("Escriba los segundos: ");
        int segundos = new Scanner(System.in).nextInt();
        if (r.setSegundos(segundos)) {
            System.out.println(r);
        } else {
            System.out.println("No es posible cambiar los segundos");
        }
    }

}
