package Entidades;


public class Cliente {

    private String nombre;

    private String apellido;

    private int dni;

    private String correo;

    private String domicilio;

    private String telefono;

    private Vehiculo vehiculo;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, int dni, String correo, String domicilio, String telefono, Vehiculo vehiculo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.correo = correo;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.vehiculo = vehiculo;
    }

  

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

   

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre= ").append(nombre).append("\n");
        sb.append("Apellido= ").append(apellido).append("\n");
        sb.append("Dni= ").append(dni).append("\n");
        sb.append("Correo= ").append(correo).append("\n");
        sb.append("Domicilio= ").append(domicilio).append("\n");
        sb.append("Telefono= ").append(telefono).append("\n");
        sb.append("vehiculos=").append( vehiculo);

        return sb.toString();
    }


}
