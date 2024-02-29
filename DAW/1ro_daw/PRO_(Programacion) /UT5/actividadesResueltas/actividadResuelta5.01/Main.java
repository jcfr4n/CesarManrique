package codigo;

public class Main {
    
    public static void main(String[] args) {
        int valores[];
        valores = new int[10];
        
        for (int i = 0; i < valores.length; i++) {
            valores[i] = (int)(Math.random()*100 + 1);
        }
        
        int suma = 0;
        for(int valor: valores) {
            suma += valor;
        }
        
        System.out.println("La suma de los valores aleatorios es " + suma);
    }    
}
