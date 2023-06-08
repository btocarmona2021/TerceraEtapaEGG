package Entidades;

public class Pelicula {

    private String titulo;

    private double duracion;

    private int edadMinima;

    private String director;
//<editor-fold desc="CONSTRUCTORES">

    public Pelicula() {
    }

    public Pelicula(String titulo, double duracion, int edadMinima, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
        this.director = director;
    }
//</editor-fold>
//<editor-fold desc="GET y SET">

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    //</editor-fold>
//<editor-fold desc="STRING">
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("titulo=").append(titulo).append("\n");
        sb.append("Duracion=").append(duracion).append("\n");
        sb.append("EdadMinima=").append(edadMinima).append("\n");
        sb.append("director=").append(director).append("\n");
        return sb.toString();
    }
//</editor-fold>
}
