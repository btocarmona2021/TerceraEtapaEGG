package Entidades;

import java.util.ArrayList;

public class Cine {

    private Pelicula peliculaReprod;

    private double precioEntrada;

    private ArrayList<Espectador> espectadores;

//<editor-fold desc="CONSTRUCTORES">

    public Cine() {
    }

    public Cine(Pelicula peliculaReprod, double precioEntrada, ArrayList<Espectador> espectadores) {
        this.peliculaReprod = peliculaReprod;
        this.precioEntrada = precioEntrada;
        this.espectadores = espectadores;
    }
    //</editor-fold>
//<editor-fold desc="GET Y SET">

    public Pelicula getPeliculaReprod() {
        return peliculaReprod;
    }

    public void setPeliculaReprod(Pelicula peliculaReprod) {
        this.peliculaReprod = peliculaReprod;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public ArrayList<Espectador> getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(ArrayList<Espectador> espectadores) {
        this.espectadores = espectadores;
    }
    //</editor-fold>
//<editor-fold desc="STRING">

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pelicula Actual= ").append(peliculaReprod).append("\n");
        sb.append("Precio Entrada= ").append(precioEntrada).append("\n");
        sb.append("Espectadores= ").append(espectadores).append("\n");
        return sb.toString();
        //</editor-fold>
    }
    
    
}
