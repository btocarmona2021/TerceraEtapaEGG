//Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
//alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
//con sus 3 notas.
package Entidades;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;

public class Alumno {
    
    private String nombreAlumno;
    private ArrayList<Integer> notas = new ArrayList();

    public Alumno() {
    }

    public Alumno(String nombreAlumno,ArrayList<Integer> notas) {
        this.nombreAlumno = nombreAlumno;
        this.notas=notas;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre del Alumno= ").append(nombreAlumno);
        sb.append("Notas= ").append(notas);
        return sb.toString();
    }
    
    public static ArrayList<String> convertiraArray (HashSet<String> pinto){
        ArrayList<String> chiquito = new ArrayList(pinto);
        return chiquito;
    }
    

}
