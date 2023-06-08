package entidad;

import java.util.Date;

public class BarcoMotor extends Barco {

    private int potenciaCV;

    public BarcoMotor() {
    }

    public BarcoMotor(int potenciaCV, String matricula, int eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;

    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    @Override
    public double calculoTarifa(Date fechaA, Date fechaD) {
        
        return super.calculoTarifa(fechaA, fechaD) + this.potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Potencia CV= ").append(potenciaCV).append("\n");
        return sb.toString();
    }
}
