public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String documento; 

    public Persona(){}

    public Persona(String nombre , String apellido, int edad, String documento) {
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String   getApellido (){
        return apellido;
    
    }
    public void setApellido (String apellido){
        this.apellido = apellido;
    }

    public int getEdad(){
        return edad;
    }
    public void setEdad (int edad){
        this.edad = edad;
    }

    public String getDocumento(){
        return documento;
    }
    public void setDocumento(String documento){
        this.documento = documento;
    }
    public String toString(){
        return "Persona: " + nombre + " " + apellido + ", Edad: " + edad + ", Documento: " + documento;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Persona persona = (Persona) obj;
        return getDocumento().equals(persona.getDocumento());
    }

    @Override
    public int hashCode() {
        return getDocumento().hashCode();
    }
}
    
