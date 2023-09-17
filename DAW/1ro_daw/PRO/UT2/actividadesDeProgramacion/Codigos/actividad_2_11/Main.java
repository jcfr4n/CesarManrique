import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numeroSolicitado, division, resto, inverso;
        numeroSolicitado = division = resto = inverso = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Indique un número para revisar si es capicúa: ");
        numeroSolicitado = sc.nextInt();
        division = numeroSolicitado;
        if(numeroSolicitado < 0 || numeroSolicitado > 9999){
            System.out.println("Lo siento, el número introducido es: " 
            + numeroSolicitado + " y no se encuentra entre 0 y 9999");
        }else{
            if(division > 999){
                resto = division % 10;
                division = division / 10; // division /= 10;
                inverso = resto;
            }
            if(division > 99){
                resto = division % 10;
                division /= 10; // division /= 10;
                inverso = inverso * 10 + resto;
            }
            if(division > 9){
                resto = division % 10;
                division = division / 10; // division /= 10;
                inverso = inverso * 10 + resto;                
            }
            if(division > 0){
                resto = division % 10;
                division = division / 10; // division /= 10;
                inverso = inverso * 10 + resto;                
            }
            System.out.println(
                (numeroSolicitado == inverso) ? "Es capicúa" : "No es capicúa"
            );
        }
        System.out.println("Gracias por usar esta aplicación");
    }
}