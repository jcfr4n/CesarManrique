import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        int hormigas, aranias, cochinillas, patas; 
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el número de individuos capturados");
        
        System.out.print("Hormigas: \t");
        hormigas = sc.nextInt();
        
        System.out.print("Arañas: \t");
        aranias = sc.nextInt();
        
        System.out.print("Cochinillas \t");
        cochinillas = sc.nextInt();
        
        patas = (hormigas * 6) + (aranias * 8) + (cochinillas * 14);
        
        sc.close();
        
        System.out.println("El número total de patas es: " + patas);
                
    }
}
