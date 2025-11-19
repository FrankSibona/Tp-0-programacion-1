public class OrdenadorEstudiantes {

    public static Estudiante[] ordenarEstudiantesPorApellido(Estudiante[] estudiantes) {
        
        int n = estudiantes.length;

        for (int i = 0; i < n - 1; i++) {
            int indiceMinimo = i;

            
            for (int j = i + 1; j < n; j++) {
                
                
                if (estudiantes[j].getApellido().compareToIgnoreCase(estudiantes[indiceMinimo].getApellido()) < 0) {
                    
                    indiceMinimo = j;
                }
              
            }
            
            if (indiceMinimo != i) {
                Estudiante temp = estudiantes[i];
                estudiantes[i] = estudiantes[indiceMinimo];
                estudiantes[indiceMinimo] = temp;
            }
        }
        return estudiantes;
    }
}

