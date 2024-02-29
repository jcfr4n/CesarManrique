import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
                int numeroBase, numeroDivisor, complemento;
                Scanner sc = new Scanner(System.in);
                System.out.print("Indique un número entero al cual "
                                + "se le buscará el complemento: ");
                numeroBase = sc.nextInt();
                System.out.print("Indique un número entero "
                                + "para buscar su múltiplo: ");
                numeroDivisor = sc.nextInt();

                complemento = numeroDivisor - (numeroBase % numeroDivisor);

                sc.close();

                System.out.println("A " + numeroBase + " hay que sumarle "
                                + complemento + " para que el resultado ("
                                + (numeroBase + complemento) + ") sea múltiplo de "
                                + numeroDivisor);
        }
}