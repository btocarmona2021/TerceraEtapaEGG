package entidad;

public class HotelCuatroEstrellas extends Hotel{

    private char gimnasio;

    private String nombreRestaurant;

    private int capacidadRestaurant;

    public HotelCuatroEstrellas() {
    }

    public HotelCuatroEstrellas(char gimnasio, String nombreRestaurant, int capacidadRestaurant, int cantHabitaciones, int numeroCamas, int cantPisos, String nombre, String direccion, String localidad, Gerente gerente) {
        super(cantHabitaciones, numeroCamas, cantPisos, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.nombreRestaurant = nombreRestaurant;
        this.capacidadRestaurant = capacidadRestaurant;
    }

    @Override
    public void calcPrecioHab() {
        super.calcPrecioHab();
        int valAgregRest = (capacidadRestaurant < 30) ? 10 : (capacidadRestaurant >= 30 && capacidadRestaurant < 50) ? 30
                : (capacidadRestaurant >= 50) ? 50 : 0;
        if (this.gimnasio == 'A') {
            valAgregRest+=50;
        }else if (this.gimnasio=='B') {
            valAgregRest+=30;
        }
        this.precioHabitaciones+=valAgregRest;
      
    }
    
    
    public char getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(char Gimnasio) {
        this.gimnasio = Gimnasio;
    }

    public String getNombreRestaurant() {
        return nombreRestaurant;
    }

    public void setNombreRestaurant(String nombreRestaurant) {
        this.nombreRestaurant = nombreRestaurant;
    }

    public int getCapacidadRestaurant() {
        return capacidadRestaurant;
    }

    public void setCapacidadRestaurant(int capacidadRestaurant) {
        this.capacidadRestaurant = capacidadRestaurant;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Gimnasio= ").append(gimnasio).append("\n");
        sb.append("NombreRestaurant= ").append(nombreRestaurant).append("\n");
        sb.append("Capacidad de Restaurant= ").append(capacidadRestaurant).append("\n");
        return sb.toString();
    }
}
