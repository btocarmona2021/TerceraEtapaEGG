package Entidades;

public class Espectador {

    private String nombre;

    private int edad;

    private double dineroDisponible;

//<editor-fold desc="CONSTRUCTORES">
    public Espectador() {
    }

    public Espectador(String nombre, int edad, double dineroDisponible) {
        this.nombre = nombre;
        this.edad = edad;
        this.dineroDisponible = dineroDisponible;
    }
    //</editor-fold>
//<editor-fold desc="GET Y SET">

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getDineroDisponible() {
        return dineroDisponible;
    }

    public void setDineroDisponible(double dineroDisponible) {
        this.dineroDisponible = dineroDisponible;
    }
    //</editor-fold>
//<editor-fold desc="STRING">

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre= ").append(nombre).append("\n");
        sb.append("Edad= ").append(edad).append("\n");
        sb.append("Dinero Disponible= ").append(dineroDisponible).append("\n");
        return sb.toString();
    }
    //</editor-fold>
}
