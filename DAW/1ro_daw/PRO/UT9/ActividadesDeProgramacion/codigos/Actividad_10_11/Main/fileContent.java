package Main;

import java.io.*;

/**
 *
 * @author juancfm
 */
public class fileContent {

    String result = "";
    BufferedReader bR = null;

    public String fileContent(String texto) {

        texto = texto.trim();
        if (texto.isEmpty()) {
            texto = "prueba.txt";
        }

        try {
            bR = new BufferedReader(new FileReader(texto));
            String line;

            while ((line = bR.readLine()) != null) {
                result = result + line + "\n";
            }
        } catch (IOException e) {
            System.err.println("Error al leer el fichero: " + e.getMessage());
        } finally {
            if (bR != null) {
                try {
                    bR.close();
                } catch (Exception e) {
                    System.err.println("Segunda Exception: " + e);
                }
            }
        }

        return result;
    }

}
