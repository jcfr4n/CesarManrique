package resuelta10.pkg08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Resuelta1008 {

    public static void main(String[] args) {
        System.out.println("Nombre del fichero: ");
        String fichOriginal = new Scanner(System.in).nextLine();
        String fichCopia = "copia_de_" + fichOriginal;

        try ( BufferedReader in = new BufferedReader(
                new FileReader(fichOriginal));  
                BufferedWriter out = new BufferedWriter(
                        new FileWriter(fichCopia))) {
            int c = in.read(); 
            while (c != -1) { 
                out.write(c); 
                c = in.read(); 
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
