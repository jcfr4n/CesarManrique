package resuelta11.pkg09;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

class Registro implements Serializable {

    double temperatura;
    LocalDateTime fechaYHora;

    Registro(double temperatura) {
        this.temperatura = temperatura;
        fechaYHora = LocalDateTime.now();
    }

    @Override
    public String toString() {
        DateTimeFormatter f = DateTimeFormatter
                .ofLocalizedDateTime(FormatStyle.SHORT)
                .withLocale(Locale.getDefault());
        return "Registro{" + "temperatura=" + temperatura
                + ", fechaYHora=" + f.format(fechaYHora) + "}\n";
    }
}
