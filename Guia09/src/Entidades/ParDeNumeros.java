package Entidades;

import java.util.Random;

public class ParDeNumeros {
    
    private double numero_01;
    private double numero_02;

    public ParDeNumeros() {
        Random aleaorio = new Random();
        
        this.numero_01 = aleaorio.nextDouble(100);
        this.numero_02 = aleaorio.nextDouble(100);
    }

    public double getNumero_01() {
        return numero_01;
    }

    public void setNumero_01(double numero_01) {
        this.numero_01 = numero_01;
    }

    public double getNumero_02() {
        return numero_02;
    }

    public void setNumero_02(double numero_02) {
        this.numero_02 = numero_02;
    }
    
    

  
    
    

}
