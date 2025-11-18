import java.util.List;

public class Universidad {
    private String nombre;
    private String direccion;
    private List <Estudiante> estudiantes;
    private List <MiembroUniversidad> miembros;


    public String toString(){
        return "Universidad: " + nombre + ", Direccion: " + direccion + ", Numero de Estudiantes: " + estudiantes.size();
    }

    public void agregarMiembro(MiembroUniversidad miembro){
        this.miembros.add(miembro);
    }
    
}
