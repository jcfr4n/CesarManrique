package resuelta12.pkg14;

import java.io.Serializable;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Registro implements Serializable {

    LocalTime hora;
    double temperatura;

    public Registro(double temperatura) {
        this.temperatura = temperatura;
        this.hora = LocalTime.now();
    }

    public boolean equals(Object o) {
        return hora.equals(((Registro) o).hora);
    }

    @Override
    public String toString() {
        DateTimeFormatter f = DateTimeFormatter.
                ofLocalizedTime(FormatStyle.MEDIUM).
                withLocale(Locale.getDefault());
        return "Registro{" + "hora=" + hora.format(f)
                + ", temperatura=" + temperatura + "°C}\n";
    }
}
