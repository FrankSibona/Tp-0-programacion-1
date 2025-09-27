
public class Materia {
    private String nombre;
    private int codigo;
    private int creditos;
    private float calificacion;
    
    
    public Materia(){

    }

    public Materia(String nombre, int codigo, int creditos, float calificacion){
        this.nombre=nombre;
        this.codigo=codigo;
        this.creditos=creditos;
        this.calificacion=calificacion;
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

    
}
