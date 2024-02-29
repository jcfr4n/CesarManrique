import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numUsuario, decenaNumero, unidadNumero;
        String decenas, unidades, respuesta;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un número entre 1 y 99: ");
        numUsuario = sc.nextInt();
        if(numUsuario <= 99 && numUsuario >=1 ){
            unidadNumero = numUsuario % 10;
            decenaNumero = numUsuario / 10;
            decenas = unidades = respuesta = "";
            if(decenaNumero > 0 && unidadNumero == 0){
                respuesta = switch (decenaNumero){
                    case 1 -> "Diez"; 
                    case 2 -> "Veinte"; 
                    case 3 -> "Treinta"; 
                    case 4 -> "Cuarenta"; 
                    case 5 -> "Cincuenta"; 
                    case 6 -> "Sesenta";
                    case 7 -> "Setenta";
                    case 8 -> "Ochenta";
                    case 9 -> "Noventa";
                    default -> "";
                    
                };
            }
            if(decenaNumero > 0 && unidadNumero != 0){
                decenas = switch (decenaNumero){
                    case 2 -> "Veinte y "; 
                    case 3 -> "Treinta y "; 
                    case 4 -> "Cuarenta y "; 
                    case 5 -> "Cincuenta y "; 
                    case 6 -> "Sesenta y ";
                    case 7 -> "Setenta y ";
                    case 8 -> "Ochenta y ";
                    case 9 -> "Noventa y ";
                    default -> "";
                    
                };
            }
            if(numUsuario > 10 && numUsuario < 20){
                respuesta = switch(numUsuario){
                    case 11 -> "Once"; 
                    case 12 -> "Doce"; 
                    case 13 -> "Trece"; 
                    case 14 -> "Catorce"; 
                    case 15 -> "Quince";
                    case 16 -> "Dieciseis"; 
                    case 17 -> "Diecisiete"; 
                    case 18 -> "Dieciocho"; 
                    case 19 -> "Diecinueve";
                    default -> "";
                };
                
            }
            if(respuesta == ""){
                unidades = switch (unidadNumero){
                    case 1 -> "uno"; 
                    case 2 -> "dos"; 
                    case 3 -> "tres"; 
                    case 4 -> "cuatro"; 
                    case 5 -> "cinco"; 
                    case 6 -> "seis"; 
                    case 7 -> "siete"; 
                    case 8 -> "ocho"; 
                    case 9 -> "nueve"; 
                    default -> "";
                };
                respuesta = decenas + unidades;
            }
                System.out.println("El número introducido es: " + respuesta);
        }else{
            System.out.println("Lo lamento, pero el número debe "
                    + "estar comprendido entre 1 y 99");
        }        
            System.out.println("Gracias por hacer uso de este programa.");
    }
}