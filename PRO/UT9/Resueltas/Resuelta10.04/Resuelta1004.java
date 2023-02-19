package resuelta10.pkg04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Resuelta1004 {

    public static void main(String[] args) {
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader("NumerosReales.txt"));
            String texto = in.readLine();
            String[] subcadenas = texto.split(" ");
            double suma = 0;
            for (int i = 0; i < subcadenas.length; i++) {
                suma += Double.valueOf(subcadenas[i]);
            }
            System.out.println("suma: " + suma + "\tmedia: " 
                    + suma / subcadenas.length);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }
}
