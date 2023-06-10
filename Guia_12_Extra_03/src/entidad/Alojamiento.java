package entidad;

public class Alojamiento {

    protected String nombre;

    protected String direccion;

    protected String localidad;

    protected Gerente gerente;

    public Alojamiento() {
    }

    public Alojamiento(String nombre, String direccion, String localidad, Gerente gerente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.gerente = gerente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre= ").append(nombre).append("\n");
        sb.append("Direccion= ").append(direccion).append("\n");
        sb.append("Localidad= ").append(localidad).append("\n");
        sb.append("Gerente= ").append(gerente.getNombreCompleto()).append("\n");
        return sb.toString();
    }
}
