package aplicacion8.pkg11;

import java.util.Arrays;


/* La clase abstracta Instrumento , básicamente contiene una tabla con una serie
de notas. Cada clase que herede de Instrumento, tendrá que implementar el método
interpretar() donde deciden de qué forma suenan las notas. Distinguiremos un
timbre de otro, por la forma en que escribamos las notas, por ejemplo: do, Do,
Dolooon, dooooooooooo , etc. */
public abstract class Instrumento {

    protected Nota[] melodia; //tabla que almacena las notas a interpretar

    public Instrumento() {
        melodia = new Nota[0]; //creamos la tabla
    }
//Usa el algoritmo de inserción no ordenada

    void add(Nota n) {
        melodia = Arrays.copyOf(melodia, melodia.length + 1); //redimensionamos
        melodia[melodia.length - 1] = n; //insertamos el nuevo elemento al final
    }

    abstract void interpretar(); //a implementar en cada subclase
}
