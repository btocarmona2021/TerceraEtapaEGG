package Servicios;

import Entidades.Curso;
import Entidades.Utilidad;

public class CursoServicios {

    public String[] cargarAlumnos(int cantAlumnos) {
        String[] alumno = new String[cantAlumnos];
        for (int i = 0; i < alumno.length; i++) {
            System.out.println("ingres el nombre del alumno "+ (i+1));
            alumno[i] = Utilidad.leer().nextLine();
        }
        return alumno;
    }

    public Curso crearCurso(String nombreCurso, int cantidadHorasPorDia, int cantidadDiasPorSemana, char turno, double precioPorHora,int cantalumnos) {

        return new Curso(nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, turno, precioPorHora, cargarAlumnos(cantalumnos));
    }
    
    public double calcularGananciaSemanal(Curso curso){
        
       return curso.getCantidadHorasPorDia()*curso.getCantidadDiasPorSemana()*
                curso.getAlumnos().length*curso.getPrecioPorHora();  
       
    }

}
