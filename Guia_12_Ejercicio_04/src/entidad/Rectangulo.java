package entidad;

public class Rectangulo implements calculosFormas{
    
    
        @Override
    public double calculaArea(double a, double b){
        
        return a*b;
    }
    
    @Override
    public double calculaPerimetro(double a,double b){
        
        return (2*a)+(2*b);
    }

}
