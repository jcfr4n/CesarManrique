import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int segundosUsuario, horas, minutos, segundos;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese los segundos a transformar: ");
        segundosUsuario = sc.nextInt();

        horas = Math.abs(segundosUsuario / 3600);
        minutos = Math.abs((segundosUsuario % 3600) / 60);
        segundos = segundosUsuario - (horas * 3600) - (minutos * 60);

        sc.close();

        System.out.println(segundosUsuario + " segundos son:");
        System.out.println(horas + " horas,");
        System.out.println(minutos + " minutos y ");
        System.out.println(segundos + " segundos");

    }
}