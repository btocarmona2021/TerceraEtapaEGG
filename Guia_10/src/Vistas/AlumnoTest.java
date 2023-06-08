
package Vistas;

import Entidades.Alumno;
import Servicios.AlumnosServicio;
import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //CREO UNA LISTA DE ALUMNOS
        ArrayList<Alumno> alumnos = new ArrayList();
        //CREO INSTANCIA DE LA CLASE SERVICIO DE ALUMNOS
        AlumnosServicio as= new AlumnosServicio();
        //LLAMO AL METODO CREAR ALUMNOS DESDE LA CLASE SERVICI0
        as.CreaAlumno(alumnos);
        //MUESTRO LOS ALUMNOS
        for (Alumno alumno : alumnos) {
            System.out.println(alumno.getNombreAlumno());
        }
        System.out.println("Ingrese el nombre del Alumno para mostrar su promedio");
        System.out.println(as.notaFinal(leer.nextLine(), alumnos));
        
    }
    

}
