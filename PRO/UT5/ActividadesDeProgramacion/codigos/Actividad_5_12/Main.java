import java.util.Scanner;
import java.util.Arrays;

public class Main {
    /**
     * Escribe la función void desordenar (int t[ ]), que cambia de forma
     * aleatoria los elementos contenidos en la tabla t.
     * Si la tabla estuviera ordenada, dejaría de estarlo.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] myArray;
        String option = "";

        while (!option.equals("a") && !option.equals("b")) {
            System.out.println("Indique si desea:");
            System.out.println("\ta\tIntroducir su propio array.");
            System.out.println("\tb\tGenerar un array aleatorio con números entre 1 y 50.");
            option = sc.next();
        }

        System.out.print("\nIndique ahora la longitud del array: ");
        int num = sc.nextInt();
        myArray = new int[num];

        /**
         * Se determina cual método se usa para poblar array
         */

        if (option.equals("a")) {
            poblarManual(myArray);
            System.out.println("\nArray generado por el usuario: ");
        } else {
            System.out.println("\nArray generado aleatoriamente: ");
            poblarArray(myArray);

        }

        // Se imprime el array resultante
        System.out.println(Arrays.toString(myArray));

        /**
         * Permite al usuario desordenar el array tantas veces como pulse la
         * tecla "d". "t" para parar la ejecución
         */
        while (!option.equals("t")) {
            System.out.print("Pulse (d)esordenar o (t)erminar: ");
            option = sc.next();
            if (option.equals("d")) {
                desordenar(myArray);
            }

        }

        sc.close();

        System.exit(0);
    }

    /**
     * Prepara el poblado manual del array por parte del usuario
     * 
     * @param myArray
     */
    private static void poblarManual(int[] myArray) {
        Scanner sc1 = new Scanner(System.in);
        for (int i = 0; i < myArray.length; i++) {
            System.out.print("\nIntroduzca un valor para el elemento con indice " + i + ": ");
            myArray[i] = sc1.nextInt();
        }
        // return myArray;
    }

    /**
     * Prepara el poblado aleatorio del array con números enteros entre 1 y 50
     * 
     * @param myArray
     */
    private static void poblarArray(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 50) + 1;
        }
    }

    /**
     * Desordena el array que se pasa como parámetro y lo muestra desordenado.
     * Para cada elemento i del array se generó un número aleatorio j, que está
     * dentro del rango de índices del array, procediendo luego a intercambiar
     * el elemento i por el elemento j, lo que produce una mezcla aleatoria de
     * los elementos
     * 
     * @param myArray
     */
    private static void desordenar(int[] myArray) {
        int j, comodin;
        for (int i = 0; i < myArray.length; i++) {
            j = (int) (Math.random() * myArray.length + 1) - 1;
            comodin = myArray[i];
            myArray[i] = myArray[j];
            myArray[j] = comodin;
        }

        System.out.println("\n" + Arrays.toString(myArray));
    }
}
