package Entidades;

import java.util.ArrayList;

public class Voto {

    private Alumno alumno;

    private ArrayList<Alumno> votados;

    public Voto() {
    }

    public Voto(Alumno alumno, ArrayList<Alumno> votados) {
        this.alumno = alumno;
        this.votados = votados;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public ArrayList<Alumno> getVotados() {
        return votados;
    }

    public void setVotados(ArrayList<Alumno> votados) {
        this.votados = votados;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Alumno= ").append(alumno).append("\n");
        sb.append("Votados= ").append(votados).append("\n");
        return sb.toString();
    }
    
    
   
}
