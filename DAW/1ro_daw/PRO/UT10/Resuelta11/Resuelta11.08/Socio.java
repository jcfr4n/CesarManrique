

package resuelta11.pkg08;

import java.io.Serializable;

 class Socio implements Serializable {

            String dni;
            String nombre;

            public Socio(String dni, String nombre) {
                this.dni = dni;
                this.nombre = nombre;
            }

            @Override
            public String toString() {
                return "Socio{" + "dni=" + dni + ", nombre=" + nombre + '}';
            }
        }