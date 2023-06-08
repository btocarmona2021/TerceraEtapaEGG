//En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
//toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
//pregunta al usuario si quiere crear otro Alumno o no.
//Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
//Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
//final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
//del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
//promedio final, devuelto por el método y mostrado en el main.
package Servicios;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class AlumnosServicio {

    Scanner leer = new Scanner(System.in);

    public void CreaAlumno(ArrayList<Alumno> listAlumnos) {
        String respuesta = "";

        do {
            System.out.println("Ingrese nombre del alumno");
            String nombre = leer.next();
            ArrayList<Integer> notas = new ArrayList();
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese la nota " + (i + 1));
                notas.add(leer.nextInt());
            }
            listAlumnos.add(new Alumno(nombre, notas));
            System.out.println("Desea agregar otro alumno S/N");
            respuesta = leer.next();

        } while (respuesta.equalsIgnoreCase("S"));

    }
    /*
    Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
     */
    
    public double  notaFinal(String nombre,ArrayList<Alumno> listaAlumno){
        double promedio=0;
        for (Alumno alumno : listaAlumno) {
            if (alumno.getNombreAlumno().equalsIgnoreCase(nombre)) {
              promedio= (alumno.getNotas().get(0)+alumno.getNotas().get(1)+alumno.getNotas().get(2))/3;
            }else{
                System.out.println("El alumno no existe");
            }
            
        }
        return promedio;
        
    }

}
