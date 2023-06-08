package Entidades;

public class Perro extends Animal {

    private boolean tieneCola;

    public Perro() {
    }


    public Perro(boolean tieneCola, String nombre) {
        super(nombre);
        this.tieneCola = tieneCola;
    }
    
     public boolean isTieneCola() {
        return tieneCola;
    }

    public void setTieneCola(boolean tieneCola) {
        this.tieneCola = tieneCola;
    }
    
    
    @Override
    public void hacerRuido() {
        System.out.println("Hola hago Guau");
    }

    @Override
    public String toString() {
        return "Perro{" + "tieneCola=" + tieneCola + '}';
    }

   
    
    
}
