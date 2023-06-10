package entidad;

public class Gerente {

    private Object nombreCompleto;

    private long dni;

    public Gerente() {
    }

    public Gerente(Object nombreCompleto, long dni) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
    }

    public Object getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(Object nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre Completo= ").append(nombreCompleto).append("\n");
        sb.append("DNI= ").append(dni).append("\n");
        return sb.toString();
    }
}
