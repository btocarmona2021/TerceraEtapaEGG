package entidad;

public final class Profesor extends Empleado {

    private String departamento;

    public Profesor() {
    }

    public Profesor(String departamento, int anioIng, int numeroDespacho, String nombre, String apellidos, long dni, String estadoCivil) {
        super(anioIng, numeroDespacho, nombre, apellidos, dni, estadoCivil);
        this.departamento = departamento;
    }

    public void cambioDepartamento() {
        System.out.println("Ingrese el nuevo departamento");
        this.departamento = leer.nextLine();
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Departamento= ").append(departamento).append("\n");
        return sb.toString();
    }

}
