import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Persona implements MiembroUniversidad {
    
    private String carrera;
    private float promedio;
    private List <Materia> materias;
    
    public Estudiante() {
        this.materias = new ArrayList<>();

    }
    public Estudiante (String nombre, String apellido, int edad,String documento, String carrera, float promedio, List<Materia> materias) {
        super(nombre, apellido,edad,documento);
        this.carrera=carrera;
        this.promedio=promedio;
        this.materias=materias; 
        
    }

    


    public String getCarrera(){
        return this.carrera;
    }
    public void setCarrera(String carrera){
        this.carrera=carrera;
    }

    public float getPromedio(){
        return this.promedio;
    }
    public void setPromedio(float promedio){
        this.promedio=promedio;
    }

    public List<Materia> getMaterias (){
        return this.materias;
    }

    public void calcularPromedio(){
        float notas=0;
        for(int i=0; i<materias.size(); i++){
            
            notas += materias.get(i).getCalificacion();
            
        }
        this.promedio = notas / materias.size();
    }

    public void agregarMateria (Materia materias){
        this.materias.add(materias);
    }


    public String toString(){
        return "Estudiante: " + getNombre() + " " + getApellido() + ", Edad: " + getEdad() + ", Documento: " + getDocumento() + ", Carrera: " + carrera + ", Promedio: " + promedio;
    }

   @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Estudiante estudiante = (Estudiante) obj;
        return getDocumento().equals(estudiante.getDocumento());
    }

    @Override
    public int hashCode() {
        return getDocumento().hashCode();
    }
    @Override
    public String obtenerRol() {
        return "Estudiante";
    }
    @Override
    public String obtenerInformacionCompleta() {
        return "Rol:" + obtenerRol() + ", Nombre: " + getNombre() + " " + getApellido() + ", Edad: " + getEdad() + ", Documento: " + getDocumento() + ", Carrera: " + getCarrera()+ ", Promedio: " + getPromedio();
    }

    
}


