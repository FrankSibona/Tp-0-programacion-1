import java.util.ArrayList;
import java.util.List;

public class Estudiante{
    private String nombre;
    private String apellido;
    private int edad;
    private String carrera;
    private float promedio;
    private List <Materia> materias;
    
    public Estudiante() {

    }
    public Estudiante (String nombre, String apellido, int edad, String carrera, float promedio, List<Materia> materias) {
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.carrera=carrera;
        this.promedio=promedio;
        this.materias=materias;

    }
    public Estudiante (String nombre, String apellido, int edad, String carrera, float promedio) {
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.carrera=carrera;
        this.promedio=promedio;
        this.materias= new ArrayList<Materia>();

    }
    
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
            this.nombre= nombre;
   
    }
    public String getApellido(){
        return this.apellido;
    }
    public void setApellido(String apellido){
        this.apellido= apellido;
    }

    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int edad){
        this.edad=edad;
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

    public void agregarMateria(Materia materia){
        this.materias.add(materia);
    }

    public void calcularPromedio(){
        float notas=0;
        for(int i=0; i<materias.size(); i++){
            
            notas += materias.get(i).getCalificacion();
            
        }
        this.promedio = notas / materias.size();
    }
}