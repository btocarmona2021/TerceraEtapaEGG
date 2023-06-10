package entidad;

public class Polideportivo extends Edificio {
    
    private String nombre;
    private boolean tipoInstalacion;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, boolean tipoInstalacion, int ancho, int alto, int largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }
    @Override
    public double calcularSuperficie(){
        return this.ancho*this.largo;
    }
    @Override
    public  double calcularVolumen(){
                return this.ancho*this.largo*this.alto;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTipoInstalacion() {
        return tipoInstalacion;
    }
    public void setTipoInstalacion(boolean tipoInstalacion) {
        this.tipoInstalacion = tipoInstalacion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre= ").append(nombre).append("\n");
        sb.append("Tipo de Instalacion= ").append(tipoInstalacion).append("\n");
        return sb.toString();
    }


    
}
