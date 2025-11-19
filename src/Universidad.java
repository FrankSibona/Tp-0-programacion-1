import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private String nombre;
    private String direccion;
    private List <MiembroUniversidad> miembros;

    public Universidad(String nombre, String direccion){
        this.nombre=nombre;
        this.direccion=direccion;
        this.miembros = new ArrayList<>();
    }


    public void agregarMiembro(MiembroUniversidad miembro){
        this.miembros.add(miembro);
        if (miembro instanceof Persona) {
        Persona p = (Persona) miembro; 
        System.out.println(miembro.obtenerRol() + " " + p.getNombre() + " " + p.getApellido() + " agregado/a a la universidad.");
    } 
    }

    public void listarTodosLosMiembros() {
        System.out.println("\n--- LISTA DE TODOS LOS MIEMBROS DE LA UNIVERSIDAD (" + miembros.size() + ") ---");
        if (miembros.isEmpty()) {
            System.out.println("No hay miembros registrados.");
            return;
        }
        for (MiembroUniversidad miembro : miembros) {
            
            System.out.println(miembro.obtenerInformacionCompleta());
        }
        System.out.println("------------------------------------------------------------------");
    }

    public List<MiembroUniversidad> buscarPorRol(String rolBuscado) {
        List<MiembroUniversidad> miembrosEncontrados = new ArrayList<>();
        
        for (MiembroUniversidad miembro : miembros) {
        
            if (miembro.obtenerRol().compareToIgnoreCase(rolBuscado) == 0) {
                miembrosEncontrados.add(miembro);
            }
        }
        return miembrosEncontrados;
    }

    @Override
    public String toString(){
        
        return "Universidad: " + nombre + ", Direccion: " + direccion + ", Numero total de Miembros: " + miembros.size();
    }

    public static int contarEstudiantesRecursivo(Estudiante[] estudiantes, String carrera, int indice){
        if(indice < 0){
            return 0;
        }
        int contador = estudiantes[indice].getCarrera().equalsIgnoreCase(carrera) ? 1 : 0;
        return contador + contarEstudiantesRecursivo(estudiantes, carrera, indice - 1);
    }
    public static int contadorEstudiantesIterativo(Estudiante[] estudiantes, String carrera){
        int contador = 0;
        for(int i=0; i<estudiantes.length; i++){
            if(estudiantes[i].getCarrera().equalsIgnoreCase(carrera)){
                contador++;
            }
        }
        return contador;
    }
    public static Estudiante buscarEstudianteRecursivo(Estudiante[] estudiantes, String documento, int indice){
        if(indice < 0){
            return null;
        }
        if(estudiantes[indice].getDocumento().equalsIgnoreCase(documento)){
            return estudiantes[indice];
        }
        return buscarEstudianteRecursivo(estudiantes, documento, indice - 1);
    }
    public static Estudiante buscarEstudianteIterativo(Estudiante[] estudiantes, String documento){
        for(int i=0; i<estudiantes.length; i++){
            if(estudiantes[i].getDocumento().equalsIgnoreCase(documento)){
                return estudiantes[i];
            }
        }
        return null;
    }
    public static int busquedaBinariaEstudiantes(Estudiante[] estudiantes, String apellido){
        int izquierda = 0;
        int derecha = estudiantes.length - 1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;
            int comparacion = estudiantes[medio].getApellido().compareToIgnoreCase(apellido);

            if (comparacion == 0) {
                return medio; 
            }
            if (comparacion < 0) {
                izquierda = medio + 1; 
            } else {
                derecha = medio - 1; 
            }
        }
        return -1; 
    }
}
