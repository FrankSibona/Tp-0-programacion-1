import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Carrera { 
    private String nombre;
    private int codigoCarrera;
    private List<Estudiante> estudiantes;

    //Contructor vacio
public Carrera (){ 
    this.estudiantes = new ArrayList<>();
}

    //Constructor 
public Carrera (String nombre, int codigoCarrera){
    this.nombre = nombre;
    this.codigoCarrera = codigoCarrera;
    this.estudiantes = new ArrayList<>();
    
}
  
    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public int getCodigoCarrera(){
        return this.codigoCarrera;
    }

    public void setCodigoCarrera(int codigoCarrera){
        this.codigoCarrera=codigoCarrera;
    }

    public List<Estudiante> getEstudiantes(){
            return this.estudiantes;
    }

    public void agregarEstudiante(Estudiante estudiantes){
        this.estudiantes.add(estudiantes);

    } 
    public void mostrarEstudianteList(){
        System.out.println("Estudiante inscriptos en la carrera: " + this.getNombre() + ".");
        for(int i=0; i < this.estudiantes.size(); i++){
             Estudiante e = this.estudiantes.get(i);
            System.out.println("- " + e.getNombre() + " " + e.getApellido());
        }
    }
    

    public Estudiante buscarEstudiante(String nombre){
        for(int i = 0 ; i < this.estudiantes.size(); i++ ){
            if(estudiantes.get(i).getNombre().compareToIgnoreCase(nombre) == 0) {
                return estudiantes.get(i);
            }
        }
        return null;
        
    }
    public String toString(){
        return "Carrera: " + nombre + ", Codigo de Carrera: " + codigoCarrera + ", Numero de Estudiantes: " + estudiantes.size();
    }

}
