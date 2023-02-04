package resuelta08.pkg05;

import java.util.Arrays;

public abstract class Instrumento {

    protected Nota[] melodia; 

    public Instrumento() {
        melodia = new Nota[0]; 
    }

    void add(Nota n) {
        melodia = Arrays.copyOf(melodia, melodia.length + 1); 
        melodia[melodia.length - 1] = n; 
    }

    abstract void interpretar(); 
}
