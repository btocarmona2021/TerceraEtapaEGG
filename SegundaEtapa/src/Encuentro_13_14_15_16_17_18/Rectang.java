//Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2"
//y un método "calcular_area" que calcule y devuelva el área del rectángulo.

//Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados de 
//4 y 6 y imprime el área del rectángulo.
package Encuentro_13_14_15_16_17_18;

public class Rectang {

    private double lado1;
    private double lado2;

    public Rectang() {
    }
    
    

    public double calcualarArea() {

        return this.lado1 * this.lado2;

    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    
    
    

    
}
