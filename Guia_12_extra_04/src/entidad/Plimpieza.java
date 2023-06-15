package entidad;

public class Plimpieza extends Empleado {

    private String seccion;

    public Plimpieza() {
    }

    public Plimpieza(String seccion, int anioIng, int numeroDespacho, String nombre, String apellidos, long dni, String estadoCivil) {
        super(anioIng, numeroDespacho, nombre, apellidos, dni, estadoCivil);
        this.seccion = seccion;
    }

    public void trasladoSeccion() {
        System.out.println("Ingrese la seccion a trasladar");
        this.seccion = leer.nextLine();
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Seccion= ").append(seccion).append("\n");
        return sb.toString();
    }

}
