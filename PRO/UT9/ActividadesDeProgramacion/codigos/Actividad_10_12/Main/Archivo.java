package Main;

import java.io.*;

/**
 *
 * @author juancfm
 */
class Archivo {

    static void escribirDatos(String pathname, String nombre, int edad) {

        File archivo = new File(pathname);
        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(new FileWriter(archivo, true));

            bw.write(nombre + ", " + edad + ".");
            bw.newLine();

            System.out.println("Los datos se han guardado correctamente.");

        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al guardar los datos. "
                    + e.getMessage());
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    System.err.println("No se ha podido cerrar la conexión: "
                            + e.getMessage());
                }
            }
        }
    }
}
