import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sumaUsuario, numA, numB, operacion;
        String respuesta, signo;
        Scanner sc = new Scanner(System.in);
        numA = (int) (Math.random() * 99 + 1);
        numB = (int) (Math.random() * 99 + 1);
        operacion = (int) (Math.random() * 3 + 1);
        signo = switch (operacion){
            case 1 -> "+";
            case 2 -> "-";
            case 3 -> "*";
            default -> "";
        };
        switch (signo){
            case "+":
                operacion = numA + numB;
                break;
            case "-":
                operacion = numA - numB;
                break;
            case "*":
                operacion = numA * numB;
                break;
        };
        
        System.out.println("Cuanto es: " + numA + " " 
                + signo + " " + numB + ":");
        sumaUsuario = sc.nextInt();
        sc.close();
        respuesta = (operacion == sumaUsuario) ? "Correcto" : "Incorrecto";
        System.out.println("\n" + respuesta);
    }
}