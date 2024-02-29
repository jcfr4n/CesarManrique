/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion8.pkg11;

/**
 *
 * @author Ana
 */
public class Aplicacion811 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

	Nota cancion[] = {Nota.DO, Nota.SI, Nota.SOL, Nota.RE, Nota.FA};
        Campana p = new Campana();
        for (Nota nota : cancion) {
            p.add(nota);
        }
        p.interpretar();
    }
    }
    
}
