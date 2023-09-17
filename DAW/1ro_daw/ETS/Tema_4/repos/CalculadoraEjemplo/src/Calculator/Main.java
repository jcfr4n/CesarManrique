package Calculator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * to change this license Click
 * nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this
 * template
 */

/**
 *
 * @author juancfm
 */
public class Main {    

    public static void main(String[] args) {
        
        CalculadoraEjemplo ce = new CalculadoraEjemplo();
                
        mostrarSaludo();
        ce.seleccionar();
    }
    
    /**
     * Método que muestra el mensaje de bienvenida al usuario.
     *
     */
    public static void mostrarSaludo() {
        System.out.println("¡Bienvenido a la calculadora básica!");
        System.out.println("------------------------------------");
    }
}
