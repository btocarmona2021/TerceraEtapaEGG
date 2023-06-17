//Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" 
//y un método "calcular_area" que calcule y devuelva el área del rectángulo.
//Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados de 4 y 6 
//y imprime el área del rectángulo.

package Encuentro_13_14_15_16_17_18;

public class Rectangulo02 {
    private double lado01;
    private double lado02;

    public Rectangulo02() {
    }

    public Rectangulo02(int lado01, int lado02) {
        this.lado01 = lado01;
        this.lado02 = lado02;
    }
    
    public double calcularArea(){
        double area=0;
        area=lado01*lado02;
        return area;
    }
    
    
    
    
}
