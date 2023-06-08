package Entidades;

public class Animal {

    private String nombre;
    private String alimento;
    private int edad;
    private String raza;

    public Animal() {
    }
    
     public Animal(String nombre, String alimento, int edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }
     
     public void alimentarse(){
         System.out.println("Soy la clase Padre");
     }
     
     

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre= ").append(nombre).append("\n");
        sb.append("Alimento= ").append(alimento).append("\n");
        sb.append("Edad= ").append(edad).append("\n");
        sb.append("Raza= ").append(raza).append("\n");
        return sb.toString();
    }
     
     

}
