package Entidades;

import java.util.Random;

public class Revolver {

    private int posicioActual;

    private int posicionAgua;

    Random aleatorio = new Random();

    public Revolver() {

    }
    

    public void llenarRevolver() {
        this.posicioActual = aleatorio.nextInt(1, 7);
        this.posicionAgua = aleatorio.nextInt(1, 7);
       
    }

    public boolean mojar() {
        return posicioActual == posicionAgua;
    }
    
    public void siguienteChorro() {
        if (posicioActual<6) {
            this.posicioActual++;
        }else{
            posicioActual=1;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("La posicion actual está en= ").append(posicioActual).append("\n");
        sb.append("La posicion del agua está en= ").append(posicionAgua).append("\n");
        return sb.toString();
    }

    public int getPosicioActual() {
        return posicioActual;
    }

    public void setPosicioActual(int posicioActual) {
        this.posicioActual = posicioActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    

}
