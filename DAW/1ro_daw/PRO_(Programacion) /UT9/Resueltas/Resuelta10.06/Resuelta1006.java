package resuelta10.pkg06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Resuelta1006 {

    public static void main(String[] args) {
        FileInputStream flujo = null;
        try {
            flujo = new FileInputStream("Enteros.txt");
        } catch (FileNotFoundException ex) { 
            System.out.println(ex.getMessage());
        }
        Scanner s = new Scanner(flujo);
        int contador = 0;
        int suma = 0;
        while (s.hasNext()) {
            int n = s.nextInt();
            System.out.print(n + " ");
            suma += n;
            contador++;
        }
        double media = (double) suma / contador; //la media es un número real
        System.out.println("\nsuma: " + suma + " media: " + media);
    }

}
