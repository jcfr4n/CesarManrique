package resuelta08.pkg05;

public class Resuelta0805 {

    public static void main(String[] args) {
        Nota cancion[] = {Nota.DO, Nota.SI, Nota.SOL, Nota.RE, Nota.FA};
        Piano p = new Piano();
        for (Nota nota : cancion) {
            p.add(nota);
        }
        p.interpretar();
    }

}
