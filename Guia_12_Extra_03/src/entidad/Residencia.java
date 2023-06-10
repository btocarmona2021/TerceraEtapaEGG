package entidad;

public class Residencia extends AlojamientosExtras{

    private int cantHabitaciones;

    private boolean descuento;

    private boolean campoDeportivo;

    public Residencia() {
    }

    public Residencia(int cantHabitaciones, boolean descuento, boolean campoDeportivo, boolean privado, int metrosCuadrados) {
        super(privado, metrosCuadrados);
        this.cantHabitaciones = cantHabitaciones;
        this.descuento = descuento;
        this.campoDeportivo = campoDeportivo;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public boolean isDescuento() {
        return descuento;
    }

    public void setDescuento(boolean descuento) {
        this.descuento = descuento;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cantidad de Habitaciones= ").append(cantHabitaciones).append("\n");
        sb.append("Descuento= ").append(descuento?"Posee descuento":"No hay descuento").append("\n");
        sb.append("Campo Deportivo= ").append(campoDeportivo?"Posee Campo dep":"No posee Campo dep").append("\n");
        return sb.toString();
    }
}
