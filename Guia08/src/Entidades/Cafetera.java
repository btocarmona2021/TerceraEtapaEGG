package Entidades;

public class Cafetera {

    private int CANTIDADMAXIMA=1000;
    private int cantidadActual;

    public Cafetera() {
    }

    public Cafetera(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public int getCANTIDADMAXIMA() {
        return CANTIDADMAXIMA;
    }

    public void setCANTIDADMAXIMA(int CANTIDADMAXIMA) {
        this.CANTIDADMAXIMA = CANTIDADMAXIMA;
    }
    
    
    
    
    
}
