package resuelta10.pkg07;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Resuelta1007 {

    public static void main(String[] args) {
        BufferedWriter out = null;
        try {
            out = new BufferedWriter(new FileWriter("quijote.txt"));
            String cad = "En un lugar de la mancha,";
            for (int i = 0; i < cad.length(); i++) {
                out.write(cad.charAt(i));
            }
            cad = "de cuyo nombre no quiero acordarme.";
            out.newLine();
            out.write(cad);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }
    }

}
