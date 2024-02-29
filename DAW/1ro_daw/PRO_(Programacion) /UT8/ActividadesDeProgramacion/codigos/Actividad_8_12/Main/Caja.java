package Main;

/**
 * @author juancfm
 */
public class Caja {
    
    int ancho;
    int alto;
    int fondo;
    Unidad unidad;
    String etiqueta;
    
    public Caja(int ancho, int alto, int fondo, Unidad unidad){
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.unidad = unidad;
        etiqueta = "Etiqueta por defecto";
    }
            
    public double getVolumen(){
        double result = this.alto * this.ancho * this.fondo;

        if (this.unidad.toString().equals("CM")) {
            result /= 1000000; 
        }

        return result;
    }
    
    public void setEtiqueta(String etiqueta){
        
        this.etiqueta = etiqueta;
        
    }
    // Se sobreescribe el método toString() de la clase Object
    @Override
    public String toString(){
        String result;
        result = "\nCaja con etiqueta: " + this.etiqueta + 
                "\nDimensiones: " + 
                "\nalto: " + this.alto + " " + this.unidad +
                "\nancho: " + this.ancho + " " + this.unidad +
                "\nfondo: " + this.fondo + " " + this.unidad +
                "\nvolumen: " + this.getVolumen() + " M3";
        return result;
    }
            
}
