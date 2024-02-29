package resuelta11.pkg06;

import java.io.*;

public class Resuelta1106 {

    public static void main(String[] args) {
        try ( ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("cancionPirata.dat"))) {
            String cancion = (String) in.readObject();
            System.out.println(cancion);
        } catch (IOException ex) {
            System.out.println(ex);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }

}
