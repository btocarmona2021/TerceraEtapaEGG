//Declarar una clase llamada Circunferencia que tenga como atributo privado el radio
//de tipo real. A continuación, se deben crear los siguientes métodos: 
// 
//a) Método constructor que inicialice el radio pasado como parámetro.
//b) Métodos get y set para el atributo radio de la clase Circunferencia.
//c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
//del objeto.
//d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio
//).
//e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio)
package Encuentro_13_14_15_16_17_18;

public class Circunferencia {

    private double radio;

    public Circunferencia() {
    }
    

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void crearCircunferencia(double radio) {
        this.radio = radio;
    }

    public double area(double radio) {
        double resultadoArea = Math.PI * radio;
        return resultadoArea;
    }
    
    public double perimetro(double radio){
        double resultadoPerimetro=2* Math.PI * radio;
        return resultadoPerimetro;
    }

    @Override
    public String toString() {
        return "radio= " + radio ;
    }
    
    
}
