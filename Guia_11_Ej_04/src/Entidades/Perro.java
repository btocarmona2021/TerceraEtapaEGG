package Entidades;

public class Perro {

    private String nombre;

    private String raza;

    private int edad;

    private String tamanio;
    
    private boolean adoptado;
    private String adoptante;

    public Perro() {
    }

    public Perro(String nombre, String raza, int edad, String tamanio, boolean adoptado) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
        this.adoptado = adoptado;
    }

    public boolean isAdoptado() {
        return adoptado;
    }

    public void setAdoptado(boolean adoptado) {
        this.adoptado = adoptado;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Perro= ");
        sb.append(nombre).append("\n");
        sb.append("Raza= ").append(raza);
        sb.append(" Edad= ").append(edad);
        sb.append(" Tamaño= ").append(tamanio);
        return sb.toString();
    }

    public String getAdoptante() {
        return adoptante;
    }

    public void setAdoptante(String adoptante) {
        this.adoptante = adoptante;
    }
    
    

   
}
