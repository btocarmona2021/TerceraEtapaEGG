package Entidades;

import java.util.Comparator;

public class Paises {

    private String nombre;

    public Paises() {
    }

    public Paises(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static Comparator<Paises> comparaPaises = new Comparator<Paises>() {
        @Override
        public int compare(Paises p1, Paises p2) {

            return p1.getNombre().compareTo(p2.getNombre());
        }
    };

    @Override
    public String toString() {
        return "Paises{" + "nombre=" + nombre + '}';
    }
    
    
   



}
