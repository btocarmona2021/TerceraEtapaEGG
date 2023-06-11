package entidad;

public final class Camping extends AlojamientosExtras{

    private int capMaxCarpas;

    private int cantBanios;

    private boolean restaurant;

    public Camping() {
    }

    public Camping(int capMaxCarpas, int cantBanios, boolean restaurant, boolean privado, int metrosCuadrados, String nombre, String direccion, String localidad, Gerente gerente) {
        super(privado, metrosCuadrados, nombre, direccion, localidad, gerente);
        this.capMaxCarpas = capMaxCarpas;
        this.cantBanios = cantBanios;
        this.restaurant = restaurant;
    }

    

    public int getCapMaxCarpas() {
        return capMaxCarpas;
    }

    public void setCapMaxCarpas(int capMaxCarpas) {
        this.capMaxCarpas = capMaxCarpas;
    }

    public int getCantBanios() {
        return cantBanios;
    }

    public void setCantBanios(int cantBanios) {
        this.cantBanios = cantBanios;
    }

    public boolean isRestaurant() {
        return restaurant;
    }

    public void setRestaurant(boolean restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Capacidad Max Carpas= ").append(capMaxCarpas).append("\n");
        sb.append("Cantidad de Baños= ").append(cantBanios).append("\n");
        sb.append("Restaurant= ").append(restaurant ?"Tiene Restaurant":"No tiene Restaurant").append("\n");        return sb.toString();
    }
}
