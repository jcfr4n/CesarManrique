package resuelta10.pkg02;

import java.io.FileReader;
import java.io.IOException;

public class Resuelta1002 {

    public static void main(String[] args) {
        String texto = "";
        FileReader in = null;

        try {
            //Main.java debe estar en la carpeta del proyecto:
            in = new FileReader("Main.java");
            int c = in.read();
            while (c != -1) { 
                texto = texto + (char) c; 
                c = in.read();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally { 
            if (in != null) { 
                try {
                    in.close(); 
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }
        System.out.println(texto);
    }
}
