package Entidades;



public class Gato extends Animal{
    
    private String color;

    public Gato() {
    }


    public Gato(String color, String nombre) {
        super(nombre);
        this.color = color;
    }
    
    


   
    
    @Override
     public void hacerRuido(){
        System.out.println("Miauuuu");
    }

    @Override
    public String toString() {
        return "Gato{" + "color=" + color + '}';
    }  

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}