package Entidades;


public class Persona {

    private String nombre;

    private String apellido;

    private int edad;

    private int documento;

    private Perro perro;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, int documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre= ").append(nombre).append("\n");
        sb.append("Apellido= ").append(apellido).append("\n");
        sb.append("Edad= ").append(edad).append("\n");
        sb.append("Documento= ").append(documento).append("\n");
        sb.append(perro).append("\n");
   
        return sb.toString();
    }
    
    


}
