/*
todas las clase hijas de Hoteles ya estan
*/

package entidad;

public final class HotelCincoEstrellas extends HotelCuatroEstrellas{

    private int cantSalonesConf;

    private int cantSuites;

    private int cantLimosinas;

    public HotelCincoEstrellas() {
    }

    public HotelCincoEstrellas(int cantSalonesConf, int cantSuites, int cantLimosinas, char gimnasio, String nombreRestaurant, int capacidadRestaurant, int cantHabitaciones, int numeroCamas, int cantPisos, String nombre, String direccion, String localidad, Gerente gerente) {
        super(gimnasio, nombreRestaurant, capacidadRestaurant, cantHabitaciones, numeroCamas, cantPisos, nombre, direccion, localidad, gerente);
        this.cantSalonesConf = cantSalonesConf;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }


    @Override
    public void calcPrecioHab() {
        super.calcPrecioHab();
        this.precioHabitaciones+=(15*cantLimosinas);
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
