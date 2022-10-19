import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numero, complemento;
        Scanner sc = new Scanner(System.in);
        System.out.print("Indique un número entero: ");
        numero = sc.nextInt();

        complemento = 7 - (numero % 7);

        sc.close();

        System.out.println("A " + numero + " hay que sumarle "
                + complemento + " para que el resultado ("
                + (numero + complemento) + ") sea múltiplo de 7");
    }
}