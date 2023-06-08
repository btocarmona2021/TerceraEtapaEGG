package Entidades;

import java.util.Arrays;



public class Curso {

    private String nombreCurso;
    private int cantidadHorasPorDia;
    private int cantidadDiasPorSemana;
    private char turno;
    private double precioPorHora;
    private String[] alumnos = new String[5];

    public Curso(String nombreCurso, int cantidadHorasPorDia, int cantidadDiasPorSemana, char turno, double precioPorHora,String[]alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
        this.alumnos=alumnos;
    }

    public Curso() {
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public char getTurno() {
        return turno;
    }

    public void setTurno(char turno) {
        this.turno = turno;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "Nombre del Curso= " + nombreCurso +"\n"+"Cantidad Horas Por Dia= " + cantidadHorasPorDia +"\n"+"Cantidad Dias Por Semana= " + cantidadDiasPorSemana +"\n"+"Turno= " + turno +"\n"+"Precio Por Hora= " + precioPorHora +"\n"+"Alumnos en el aula =" + Arrays.toString(alumnos);
    }
    
    

}
