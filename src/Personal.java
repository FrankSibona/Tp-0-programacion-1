public class Personal extends Persona implements MiembroUniversidad {
    String departamento;
    String puesto;
    String fechaIngreso;

    public Personal (String nombre, String apellido, int edad, String documento, String departamento, String puesto, String fechaIngreso){
        super(nombre, apellido, edad, documento );
        this.departamento=departamento;
        this.puesto=puesto;
        this.fechaIngreso=fechaIngreso; 
    }
    public String getDepartamento(){
        return departamento;
    }
    public void setDepartamento(String departamento){
        this.departamento=departamento;
    }

    public String getPuesto (){
        return puesto;
    }
    public void setPuesto(String puesto){
        this.puesto=puesto;
    }
    public String getFechaIngreso(){
        return fechaIngreso;
    }
    public void setFechaIngreso (String fechaIngreso){
        this.fechaIngreso=fechaIngreso;
    }

    public String toString(){
        return "Personal: " + getNombre() + " " + getApellido() + ", Edad: " + getEdad() + ", Documento: " + getDocumento() + ", Departamento: " + departamento + ", Puesto: " + puesto + ", Fecha de Ingreso: " + fechaIngreso;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Personal personal = (Personal) obj;
        return getDocumento().equals(personal.getDocumento());
    }

    @Override
    public int hashCode() {
        return getDocumento().hashCode();
    }
    @Override
    public String obtenerRol() {
        return "Personal";
    }

    @Override
    public String obtenerInformacionCompleta() {
        return "Rol: " + obtenerRol() + ", Nombre: " + getNombre() + " " + getApellido() + ", Edad: " + getEdad() + ", Documento: " + getDocumento() + ", Departamento: " + getDepartamento() + ", Puesto: " + getPuesto() + ", Fecha de Ingreso: " + getFechaIngreso();
    }

}

