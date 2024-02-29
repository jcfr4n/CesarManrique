package resuelta08.pkg02;

public class HoraExacta extends Hora { 
    protected int segundos; 

    public HoraExacta(int hora, int minutos, int segundos) {
        super(hora, minutos); 
        if (!setSegundos(segundos)) { 
            System.out.println("Segundos incorrectos ");
        }
    }

    public boolean setSegundos(int segundos) {
        boolean correcto = false;
        if (0 <= segundos && segundos < 60) { 
            this.segundos = segundos; 
            correcto = true;
        }
        return correcto;
    }

    @Override 
    public void inc() {
        segundos++;
        if (segundos > 59) { 
            segundos = 0; 
            super.inc(); 
        }
    }

    @Override 
    public String toString() {
        String result = super.toString(); 
        result += ":" + segundos; 
        return result;
    }
}
