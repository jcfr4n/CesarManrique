/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt 
 * to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit 
 * this template
 */
package Main;

/**
 *
 * @author juancfm
 */
public class Marcapagina {
    
    // Inicializamos a cero que es antes de leer la primera página
    int pagina = 0;
    
    void comenzar(){
        pagina = 0;
    }
    
    int siguientePag() {
        return pagina += 1;
    }
    
    int ultimaPaginaLeida(){
        return pagina;
    }
    
}
