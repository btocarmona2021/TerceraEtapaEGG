//Crear una clase Rectángulo que modele rectángulos por medio de un atributo
//privado base y un atributo privado altura. La clase incluirá un método para crear el
//rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
//método para calcular la superficie del rectángulo y un método para calcular el
//perímetro del rectángulo. Por último, tendremos un método que dibujará el
//rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
//los métodos getters, setters y constructores correspondientes. 
// 
//Superficie = base * altura / Perímetro = (base + altura) * 2.
package Encuentro_13_14_15_16_17_18;

public class Rectangulo {

    private double base;
    private double altura;
    
    public Rectangulo(){
        
    }
    public Rectangulo (double base , double altura){
        this.base=base;
        this.altura=altura;
    }
    //crea rectangulo
    public void crearRectangulo(double base, double altura){
        this.base=base;
        this.altura=altura;
    }
    //calcula superficie
    public double superficie(double base,double altura){
        double sup=base * altura;
        return sup;
    }
    //calcula perimetro
    public double perimetro(double base, double altura){
        double peri = (base+altura)*2;
        return peri;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    
}
