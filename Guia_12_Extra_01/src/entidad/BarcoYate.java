package entidad;

import java.util.Date;

public class BarcoYate extends Barco {

    private int potenciaCV;

    private int camarotes;

    public BarcoYate() {
    }

    public BarcoYate(int potenciaCV, int camarotes, String matricula, int eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
        this.camarotes = camarotes;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    @Override
    public double calculoTarifa(Date fechaA, Date fechaD) {
       
        return super.calculoTarifa(fechaA, fechaD) + this.potenciaCV + this.camarotes;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Potencia CV= ").append(potenciaCV).append("\n");
        sb.append("Cantidad camarotes= ").append(camarotes).append("\n");
        return sb.toString();
    }
}
