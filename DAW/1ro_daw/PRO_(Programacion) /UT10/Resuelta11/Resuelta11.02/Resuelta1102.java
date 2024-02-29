package resuelta11.pkg02;

import java.io.*;

public class Resuelta1102 {

    public static void main(String[] args) {
        String estrofa = "Con diez cañones por banda, \n"
                + "viento en popa a toda vela, \n"
                + "no corta el mar, sino vuela \n"
                + "un velero bergantín.";
        try ( ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("cancionPirata.dat"))) {
            out.writeObject(estrofa);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

}
