public class Estudiante{
    private String nombre;
    private String apellido;
    private int edad;
    private String carrera;
    private float promedio;

    public Estudiante() {

    }
    public Estudiante (String nombre, String apellido, int edad, String carrera, float promedio) {
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.carrera=carrera;
        this.promedio=promedio;
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

}