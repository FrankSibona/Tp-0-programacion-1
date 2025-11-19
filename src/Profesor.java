import java.util.ArrayList;
import java.util.List;


public class Profesor extends Persona implements MiembroUniversidad {
    private String especialidad;
    private int añosExperiencia;
    private List <String> materiasAsignadas;

    public Profesor(){
        this.materiasAsignadas= new ArrayList<>();
    }
    public Profesor(String nombre, String apellido, int edad, String documento, String especialidad, int añosExperiencia ){
        super(nombre, apellido, edad, documento);
        this.especialidad=especialidad;
        this.añosExperiencia=añosExperiencia;
        this.materiasAsignadas= new ArrayList<>();
    }

    public String getEspecialidad(){
        return especialidad;
    }
    public void setEspecialidad(String especialidad){
        this.especialidad = especialidad;
    }
    public int getAñosExperiencia (){
        return añosExperiencia;
    }
    public void setAñosExperiencia (int añosExperiencia){
        this.añosExperiencia = añosExperiencia;
    }

    public void asignarMateria(String materia){
        this.materiasAsignadas.add(materia);
    }
    public String toString(){
        return "Profesor: " + getNombre() + " " + getApellido() + ", Edad: " + getEdad() + ", Documento: " + getDocumento() + ", Especialidad: " + especialidad + ", Años de Experiencia: " + añosExperiencia + ", Materias Asignadas: " + materiasAsignadas;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Profesor profesor = (Profesor) obj;
        return getDocumento().equals(profesor.getDocumento());
    }

    @Override
    public int hashCode() {
        return getDocumento().hashCode();
    }

    @Override
    public String obtenerRol() {
        return "Profesor";
    }

    @Override 
    public String obtenerInformacionCompleta() {

        String materiasAsignadas = String.join(", ", this.materiasAsignadas);
        
        return "Rol: " + obtenerRol() + ", Nombre: " + getNombre() + " " + getApellido() + ", Edad: " + getEdad() + ", Documento: " + getDocumento() + ", Especialidad: " + getEspecialidad() + ", Años de Experiencia: " + getAñosExperiencia() + ", Materias Asignadas: " + materiasAsignadas;
    }
}
