package entidad;

import java.util.Date;

public class Barco {

    protected String matricula;

    protected int eslora;

    protected int anioFabricacion;

    public Barco() {
    }

    public Barco(String matricula, int eslora, int anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }
    

    public double calculoTarifa(Date fechaA, Date fechaD) {
         
        int diasDeAmarre = fechaD.getDate() - fechaA.getDate();
        
        System.out.println("Total de dias de amarre " + diasDeAmarre + " dias");
        return (this.eslora * 10) * diasDeAmarre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Matricula= ").append(matricula).append("|n");
        sb.append("Eslora= ").append(eslora).append("|n");
        sb.append("Año Fabricacion= ").append(anioFabricacion).append("|n");
        return sb.toString();
    }

}
