package entidad;

public class Empleado extends Persona{
    protected int anioIng;
    protected int numeroDespacho;

    public Empleado() {
    }

    public Empleado(int anioIng, int numeroDespacho, String nombre, String apellidos, long dni, String estadoCivil) {
        super(nombre, apellidos, dni, estadoCivil);
        this.anioIng = anioIng;
        this.numeroDespacho = numeroDespacho;
    }
    
    public void nuevoDespacho(){
        System.out.println("Ingrese el numero de despacho");
        this.numeroDespacho=leer.nextInt();
    }

    public int getAnioIng() {
        return anioIng;
    }

    public void setAnioIng(int anioIng) {
        this.anioIng = anioIng;
    }

    public int getNumeroDespacho() {
        return numeroDespacho;
    }

    public void setNumeroDespacho(int numeroDespacho) {
        this.numeroDespacho = numeroDespacho;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Año de Ingreso= ").append(anioIng).append("\n");
        sb.append("Numero de Despacho= ").append(numeroDespacho).append("\n");
        return sb.toString();
    }
}
