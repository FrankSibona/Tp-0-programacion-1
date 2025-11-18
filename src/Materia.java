
public class Materia {
    private String nombre;
    private int codigo;
    private int creditos;
    private float calificacion;
    private Profesor profesor;
    
    
    public Materia(){

    }

    public Materia(String nombre, int codigo, int creditos, float calificacion, Profesor profesor){
        this.nombre=nombre;
        this.codigo=codigo;
        this.creditos=creditos;
        this.calificacion=calificacion;
        this.profesor=profesor;
    }


    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
         this.nombre=nombre;
    }

    public int getCodigo(){
        return this.codigo;
    }

    public void setCodigo(int codigo){
        this.codigo=codigo;
    }

    public int getCreditos(){
        return this.creditos;
    }

    public void setCreditos(int creditos){
        this.creditos=creditos;
    } 

    public float getCalificacion(){
        return this.calificacion;
    }

    public void setCalificacion(float calificacion){
        this.calificacion=calificacion;
    }
    public Profesor getProfesor(){
        return profesor;
    }
    public void setProfesor (Profesor profesor){
        this.profesor=profesor;
    }

    public String toString(){
        return "Materia: " +nombre + ", Codigo: " + codigo + ", Creditos: " + creditos + ", Calificacion: " + calificacion + ", Profesor: " + profesor.getNombre() + " " + profesor.getApellido();  
    }
    
    
    
}
