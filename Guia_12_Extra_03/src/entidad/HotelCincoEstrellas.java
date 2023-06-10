/*
todas las clase hijas de Hoteles ya estan
*/

package entidad;

public class HotelCincoEstrellas extends Hotel{

    private int cantSalonesConf;

    private int cantSuites;

    private int cantLimosinas;

    public HotelCincoEstrellas() {
    }

    public HotelCincoEstrellas(int cantSalonesConf, int cantSuites, int cantLimosinas, int cantHabitaciones, int numeroCamas, int cantPisos, double precioHabitaciones, String nombre, String direccion, String localidad, Gerente gerente) {
        super(cantHabitaciones, numeroCamas, cantPisos, precioHabitaciones, nombre, direccion, localidad, gerente);
        this.cantSalonesConf = cantSalonesConf;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    public int getCantSalonesConf() {
        return cantSalonesConf;
    }

    public void setCantSalonesConf(int cantSalonesConf) {
        this.cantSalonesConf = cantSalonesConf;
    }

    public int getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(int cantSuites) {
        this.cantSuites = cantSuites;
    }

    public int getCantLimosinas() {
        return cantLimosinas;
    }

    public void setCantLimosinas(int cantLimosinas) {
        this.cantLimosinas = cantLimosinas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cantidad de Salones Conf = ").append(cantSalonesConf).append("\n");
        sb.append("Cantidad de Suites= ").append(cantSuites).append("\n");
        sb.append("Cantidad de Limosinas= ").append(cantLimosinas).append("\n");
        return sb.toString();
    }
}
