package resuelta12.pkg16;

import java.util.*;

public class Resuelta1216 {

    public static void main(String[] args) {
        Map<Character, Academico> academia = new TreeMap<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Letra: ");
            Character letra = new Scanner(System.in).next().charAt(0);
            System.out.print("Nombre: ");
            String nombre = new Scanner(System.in).next();
            System.out.print("Año de ingreso: ");
            int ingreso = new Scanner(System.in).nextInt();
            nuevoAcademico(academia, new Academico(nombre, ingreso), letra);
        }
        System.out.println("Orden por letra: " + academia);
        
        Collection<Academico> sinLetra = academia.values();
        List<Academico> listaSinLetra = new ArrayList<>(sinLetra);
        Collections.sort(listaSinLetra);
        System.out.println("Por nombre sin letra: " + listaSinLetra);
        Comparator<Academico> comparaIngresos = new Comparator<>() {
            @Override
            public int compare(Academico o1, Academico o2) {
                return o1.aIngreso - o2.aIngreso;
            }
        };
        Collections.sort(listaSinLetra, comparaIngresos);
        System.out.println("Por año sin letra: " + listaSinLetra);

        Set<Map.Entry<Character, Academico>> conLetra = academia.entrySet();
        List<Map.Entry<Character, Academico>> listaConLetra
                = new ArrayList<>(conLetra);
        Collections.sort(listaConLetra,
                new Comparator<>() {
            @Override
            public int compare(Map.Entry<Character, Academico> o1,
                    Map.Entry<Character, Academico> o2) {
                return o1.getValue().aIngreso - o2.getValue().aIngreso;
            }
        });
        System.out.println("Orden por año de ingreso: " + listaConLetra);

        Collections.sort(listaConLetra,
                new Comparator<>() {
            @Override
            public int compare(Map.Entry<Character, Academico> o1,
                    Map.Entry<Character, Academico> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        System.out.println("Orden por nombre: " + listaConLetra);
    }

    static boolean nuevoAcademico(Map<Character, Academico> academia,
            Academico nuevo, Character letra) {
        boolean insertado = false;
        if ((letra >= 'A' && letra <= 'Z')
                || (letra >= 'a' && letra <= 'z')
                || letra == 'ñ' || letra == 'Ñ') {
            academia.put(letra, nuevo);
            insertado = true;
        } else {
            System.out.println("Letra no válida");
        }
        return insertado;
    }
}
