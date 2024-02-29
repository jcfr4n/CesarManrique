package personal;

public class Mecanico {
   String nombre;
   String telefono;
   enum Especialidad {FRENOS, HIDRAULICA, ELECTRICIDAD, MOTOR}
   Especialidad especialidad;

   public Mecanico(String nombre, String telefono, String especialidad) {
      this.nombre = nombre;
      this.telefono = telefono;
      this.especialidad = Especialidad.valueOf(especialidad);
   }
}


