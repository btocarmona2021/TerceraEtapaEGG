package entidad;

import java.util.Date;

public class BarcoVelero extends Barco {

    private int cantMastiles;

    private int potenciaCV;

    public BarcoVelero() {
    }

    public BarcoVelero(int cantMastiles, String matricula, int eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.cantMastiles = cantMastiles;

    }

    @Override
    public double calculoTarifa(Date fechaA, Date fechaD) {
         
        return super.calculoTarifa(fechaA, fechaD) + this.cantMastiles;
    }

    public int getCantMastiles() {
        return cantMastiles;
    }

    public void setCantMastiles(int cantMastiles) {
        this.cantMastiles = cantMastiles;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cantidad Mastiles= ").append(cantMastiles).append("\n");
        sb.append("Potencia CV= ").append(potenciaCV).append("\n");
        return sb.toString();
    }

}
