package Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/**
 *
 * @author juancfm
 */
public class Club {

    public List<Socio> socios;

    public Club() {
        this.socios = new ArrayList<>();
    }

    public void altaSocio(Socio socio) {
        socios.add(socio);
    }

    public void bajaSocio(Socio socio) {
        socios.remove(socio);
    }

    public void modificarSocio(Socio socio) {
        int index = socios.indexOf(socio);
        if (index >= 0) {
            socios.set(index, socio);
        }
    }

    public void listarSociosPorNombre() {
        Collections.sort(socios, new Comparator<Socio>() {
            @Override
            public int compare(Socio o1, Socio o2) {
                return o1.nombre.compareTo(o2.nombre);
            }
        });

        for (Socio socio : socios) {
            System.out.println(socio);
        }
    }

    public void listarSociosPorAntiguedad() {
        Collections.sort(socios, new Comparator<Socio>() {
            @Override
            public int compare(Socio o1, Socio o2) {
                return o1.antiguedad() - o2.antiguedad();
            }
        });

        for (Socio socio : socios) {
            System.out.println(socio);
        }
    }
}
