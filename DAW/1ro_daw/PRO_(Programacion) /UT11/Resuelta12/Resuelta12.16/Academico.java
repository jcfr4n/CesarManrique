package resuelta12.pkg16;

public class Academico implements Comparable<Academico> {

    String nombre;
    int aIngreso;

    public Academico(String nombre, int aIngreso) {
        this.nombre = nombre;
        this.aIngreso = aIngreso;
    }

    @Override
    public int compareTo(Academico o) {
        return nombre.compareTo(o.nombre);
    }

    @Override
    public String toString() {
        return "Academico{" + "nombre=" + nombre
                + ", año de ingreso=" + aIngreso + "}\n";
    }
}
