public class App {
    public static void main(String[] args) {
        
        Estudiante estudianteUno;
        Estudiante estudianteDos;
        Estudiante estudianteTres;
        Estudiante estudianteCuatro;
        Estudiante estudianteCinco;
        Estudiante estudianteSeis;
        Estudiante[] listaEstudiantes = new Estudiante[6];

        estudianteUno = new Estudiante();
        estudianteDos = new Estudiante();
        estudianteTres = new Estudiante();
        estudianteCuatro = new Estudiante();
        estudianteCinco = new Estudiante();
        estudianteSeis = new Estudiante();



        estudianteCuatro.setNombre("Tomas"); 
        estudianteCuatro.setApellido("Baigorria");
        estudianteCuatro.setEdad(24);
        estudianteCuatro.setCarrera("Programacion");
        estudianteCuatro.setPromedio(8.5F);

        estudianteCinco.setNombre("Bruno"); 
        estudianteCinco.setApellido("Alba");
        estudianteCinco.setEdad(20);
        estudianteCinco.setCarrera("Programacion");
        estudianteCinco.setPromedio(8.5F);

        estudianteSeis.setNombre("Lauti"); 
        estudianteSeis.setApellido("Kesler");
        estudianteSeis.setEdad(22);
        estudianteSeis.setCarrera("Programacion");
        estudianteSeis.setPromedio(8.5F);

        
        estudianteUno = new Estudiante("Franco", "Sibona", 24, "Programacion", 9.98F);
        estudianteDos = new Estudiante("Emilio", "Carballo", 24, "Programacion", 10);
        estudianteTres = new Estudiante("Pablin", "Sanabria", 30, "Ing Sistemas", 8.60F);

        listaEstudiantes = new Estudiante[6];
        listaEstudiantes [0] = estudianteUno; 
        listaEstudiantes [1] = estudianteDos;
        listaEstudiantes [2] = estudianteTres;
        listaEstudiantes [3] = estudianteCuatro;
        listaEstudiantes [4] = estudianteCinco;
        listaEstudiantes [5] = estudianteSeis;

        for(int i=0; i<6 ; i++){
            System.out.println("Nombre:" + listaEstudiantes[i].getNombre() + " Promedio: " + listaEstudiantes[i].getPromedio());
        }
      

    }
}
