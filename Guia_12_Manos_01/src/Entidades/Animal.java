package Entidades;

public class Animal {

    private String nombre;
    

    public Animal() {
        
    }

    public Animal(String nombre) {
        this.nombre = nombre;
    }
    
       public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void hacerRuido() {
        System.out.println("Hola soy un animal");
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + '}';
    }

 
    
    
    
    
    
}
