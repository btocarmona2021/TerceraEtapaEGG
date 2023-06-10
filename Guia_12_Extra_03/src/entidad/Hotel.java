package entidad;

public class Hotel extends Alojamiento{

    protected int cantHabitaciones;

    protected int numeroCamas;

    protected int cantPisos;

    protected double precioHabitaciones;

    public Hotel() {
    }

    public Hotel(int cantHabitaciones, int numeroCamas, int cantPisos, double precioHabitaciones, String nombre, String direccion, String localidad, Gerente gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.numeroCamas = numeroCamas;
        this.cantPisos = cantPisos;
        this.precioHabitaciones = precioHabitaciones;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }

    public double getPrecioHabitaciones() {
        return precioHabitaciones;
    }

    public void setPrecioHabitaciones(double precioHabitaciones) {
        this.precioHabitaciones = precioHabitaciones;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cantidad de Habitaciones= ").append(cantHabitaciones).append("\n");
        sb.append("Numero de Camas= ").append(numeroCamas).append("\n");
        sb.append("Cantidad de Pisos= ").append(cantPisos).append("\n");
        sb.append("Precio de Habitaciones= ").append(precioHabitaciones).append("\n");
        return sb.toString();
    }
}
