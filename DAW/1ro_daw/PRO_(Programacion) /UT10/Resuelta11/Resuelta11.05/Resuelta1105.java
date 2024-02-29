package resuelta11.pkg05;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class Resuelta1105 {

    public static void main(String[] args) {
        try ( ObjectInputStream flujoEntrada = new ObjectInputStream(
                new FileInputStream("datos.dat"))) {
            int[] tabla = (int[]) flujoEntrada.readObject();
            System.out.println(Arrays.toString(tabla));
        } catch (IOException e) {
            System.out.println("Error de entrada/salida");
        } catch (ClassNotFoundException e) {
            System.out.println("El fichero no almacena un objeto tabla");
        }
    }

}
