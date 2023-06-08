package entidad;

public class Circulo implements calculosFormas{

    @Override
    public double calculaArea (double a, double radio){
        
        return VALORPI*(Math.pow(radio, 2));
    }
    
    
    @Override
    public double calculaPerimetro(double a,double diametro){
        
        return (2*VALORPI)*diametro;
    }
    
}
