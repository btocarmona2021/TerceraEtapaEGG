package Encuentro_13_14_15_16_17_18;

public class Persona {
    
    // ATRIBUTOS
    
    public String nombre;
    public int edad;
    public int dni;
    
    
    
    
    // CONSTRUCOR VACIO
    public Persona() {
    }

    //CONSTRUCOR CON PARAMETROS

    public Persona(String nombre, int edad, int dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }
    
    //getter and setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombrecito) {
        this.nombre = nombrecito;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
   
    
    
    
}
