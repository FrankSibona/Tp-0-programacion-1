import java.util.Scanner;

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



        listaEstudiantes = new Estudiante[6];
        listaEstudiantes[0] = estudianteUno;
        listaEstudiantes[1] = estudianteDos;
        listaEstudiantes[2] = estudianteTres;
        listaEstudiantes[3] = estudianteCuatro;
        listaEstudiantes[4] = estudianteCinco;
        listaEstudiantes[5] = estudianteSeis;

        Materia materiaUno;
        Materia materiaDos;
        Materia materiaTres;

        materiaUno = new Materia();
        materiaDos = new Materia();
        materiaTres = new Materia();

        Materia[] listaMaterias = new Materia[3];
        listaMaterias[0] = materiaUno;
        listaMaterias[1] = materiaDos;
        listaMaterias[2] = materiaTres;

        materiaUno.setNombre("Algebra");
        materiaUno.setCodigo(100);
        materiaUno.setCreditos(50);
        materiaUno.setCalificacion(8.5F);

        materiaDos.setNombre("Programacion");
        materiaDos.setCodigo(101);
        materiaDos.setCreditos(50);
        materiaDos.setCalificacion(9.5f);

        materiaTres.setNombre("Base de datos");
        materiaTres.setCodigo(102);
        materiaTres.setCreditos(50);
        materiaTres.setCalificacion(7.5f);

        estudianteCuatro.agregarMateria(materiaUno);
        estudianteCinco.agregarMateria(materiaDos);
        estudianteSeis.agregarMateria(materiaTres);
        estudianteUno.agregarMateria(materiaUno);
        estudianteDos.agregarMateria(materiaDos);
        estudianteTres.agregarMateria(materiaTres);

        Carrera carreraUno;
        Carrera carreraDos;
        Carrera carreraTres;

        carreraUno = new Carrera();
        carreraDos = new Carrera();
        carreraTres = new Carrera();

        Carrera[] listaCarrera = new Carrera[3];
        listaCarrera[0] = carreraUno;
        listaCarrera[1] = carreraDos;
        listaCarrera[2] = carreraTres;

        carreraUno.setNombre("Programador Universitario");
        carreraUno.setCodigoCarrera(69);

        carreraDos.setNombre("Ingenieria en Sistemas");
        carreraDos.setCodigoCarrera(65);

        carreraTres.setNombre("Diseño y comunicacion");
        carreraTres.setCodigoCarrera(4);

        for (int i = 0; i < 6; i++) {
            System.out.println(
                    "Nombre:" + listaEstudiantes[i].getNombre() + " Promedio: " + listaEstudiantes[i].getPromedio());
            System.out.println("Materias: ");
            for (Materia materia : listaEstudiantes[i].getMaterias()) {
                System.out.println(" -" + materia.getNombre());
            }
        }
        for (int i = 0; i < 6; i++) {
            if (listaEstudiantes[i].getCarrera().equals("Ing Sistemas")) {
                System.out.println("Ingenieria en Sistemas: " + listaEstudiantes[i].getNombre());
            } else if (listaEstudiantes[i].getCarrera().equals("Programacion")) {
                System.out.println("Programador Universitario: " + listaEstudiantes[i].getNombre());
            } else if (listaEstudiantes[i].getCarrera().equals("Diseño y Comunicacion")) {
                System.out.println("Diseño y Comunicación: " + listaEstudiantes[i].getNombre());
            } else
                System.out.println("No inscripto en ninguna carrera.");
        }
        System.out.println("Ingrese el nombre del alumno que desea encontrar: ");
        Scanner entrada = new Scanner(System.in);
        String userInput = entrada.nextLine();

        Estudiante encontrado = null;
        for (int i = 0; i < listaEstudiantes.length; i++) {
            if (listaEstudiantes[i].getNombre().compareToIgnoreCase(userInput) == 0) {
                encontrado = listaEstudiantes[i];
            }
        }
        if (encontrado != null) {
            System.out
                    .println("Los datos del estudiante son:" + encontrado.getNombre() + " " + encontrado.getApellido());
            System.out.println("Carrera: " + encontrado.getCarrera());
            System.out.println("Edad: " + encontrado.getEdad());
            System.out.println("Promedio: " + encontrado.getPromedio());
            // lo encontré y lo muestro
            for (int i = 0; i < encontrado.getMaterias().size(); i++) {
                Materia eMateria = encontrado.getMaterias().get(i);
                System.out.println(eMateria.getNombre());
            }
        } else {
            System.out.println("El estudiante no fue encontrado.");
            // no lo encontré y le cuento al usuario
        }
    }

}
