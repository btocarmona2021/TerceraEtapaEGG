package entidad;

import java.util.Scanner;

public class Persona {
    
    protected String nombre;
    protected String apellidos;
    protected long dni;
    protected String estadoCivil;
    
    Scanner leer = new Scanner(System.in);
    public Persona() {
    }

    public Persona(String nombre, String apellidos, long dni, String estadoCivil) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.estadoCivil = estadoCivil;
    }
    
    public void cambioEstadoCivil(){
        System.out.println("Ingrese el nuevo estado civil");
        this.estadoCivil=leer.nextLine();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre= ").append(nombre).append("\n");
        sb.append("Apellidos= ").append(apellidos).append("\n");
        sb.append("Dni= ").append(dni).append("\n");
        sb.append("Estado Civil= ").append(estadoCivil).append("\n");
        return sb.toString();
    }
}
