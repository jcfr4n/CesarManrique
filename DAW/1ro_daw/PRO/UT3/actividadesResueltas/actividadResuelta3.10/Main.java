package codigo;

public class Main {

    public static void main(String[] args) {
        double suma = 0;  
        for (int i = 1; i <= 10; i++) {
            int impar = 2 * i - 1;
            suma += impar; 
        }
        System.out.println("La suma de los 10 primeros impares es: " + suma);
    }
}
