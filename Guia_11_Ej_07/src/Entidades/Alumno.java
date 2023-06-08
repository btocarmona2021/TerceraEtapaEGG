package Entidades;

import java.util.Comparator;

public class Alumno {

    private String nombreCompleto;

    private int dni;

    private int cantVotos;

    public Alumno() {
    }

    public Alumno(String nombreCompleto, int dni) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getCantVotos() {
        return cantVotos;
    }

    public void setCantVotos(int cantVotos) {
        this.cantVotos = cantVotos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre Completo= ").append(nombreCompleto).append("\n");
        sb.append("Dni= ").append(dni).append("\n");
        sb.append("Cantidad de Votos= ").append(cantVotos).append("\n");
        return sb.toString();
    }
     
    public String votado() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre Completo= ").append(nombreCompleto).append("\n");
        sb.append("Cantidad de Votos= ").append(cantVotos).append("\n");
        return sb.toString();
    }
    public static Comparator<Alumno> comparaVotos = new Comparator<Alumno>() {
        @Override
        public int compare(Alumno o1, Alumno o2) {
            return Integer.compare(o2.getCantVotos(), o1.getCantVotos());
        }
    };
     public static Comparator<Alumno> ordenaDNI = new Comparator<Alumno>() {
        @Override
        public int compare(Alumno o2, Alumno o1) {
            return Integer.compare(o2.getDni(), o1.getDni());
        }
    };
    
}
