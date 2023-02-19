package Main;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author juancfm
 */
class LibroFirmas {
    private final ArrayList<Firma> firmas;
    private static final String NOMBRE_ARCHIVO = "firmas.txt";

    public LibroFirmas() {
        this.firmas = new ArrayList<Firma>();
        leerFirmas();
    }

    public void mostrarFirmas() {
        for (Firma firma : firmas) {
            System.out.println(firma.getNombre());
        }
    }

    public boolean agregarFirma(String nombre) {
        boolean status = true;
        if (buscarFirma(nombre)) {
            System.out.println("El nombre ya se encuentra en el libro.");
            status = false;
        } else {
            Firma firma = new Firma(nombre);
            firmas.add(firma);
            escribirFirma(firma);
            System.out.println("Firma agregada al libro.");
        }
            return status;
    }

    private boolean buscarFirma(String nombre) {
        boolean status = false;
        for (Firma firma : firmas) {
            if (firma.getNombre().equalsIgnoreCase(nombre)) {
                status = true;
            }
        }
        return status;
    }

    private void leerFirmas() {
        try {
            try (BufferedReader bR = 
                new BufferedReader(new FileReader(NOMBRE_ARCHIVO))) {
                String linea = bR.readLine();
                while (linea != null) {
                    Firma firma = new Firma(linea);
                    firmas.add(firma);
                    linea = bR.readLine();
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo de firmas: " 
                    + e.getMessage());
        }
    }

    private void escribirFirma(Firma firma) {
        try {
            try (FileWriter fW = 
                    new FileWriter(NOMBRE_ARCHIVO, true)) {
                fW.write(firma.getNombre() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo de firmas: " 
                    + e.getMessage());
        }
    }
}
