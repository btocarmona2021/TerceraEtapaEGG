package Entidades;

import java.util.ArrayList;

public class Vehiculo {

    private String Marca;

    private String modelo;

    private int anio;

    private int numeroMotor;

    private String serieChasis;

    private String color;

    private String tipo;

    public Vehiculo() {
    }

    public Vehiculo(String Marca, String modelo, int anio, int numeroMotor, String serieChasis, String color, String tipo) {
        this.Marca = Marca;
        this.modelo = modelo;
        this.anio = anio;
        this.numeroMotor = numeroMotor;
        this.serieChasis = serieChasis;
        this.color = color;
        this.tipo = tipo;
    }
  

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

   

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getNumeroMotor() {
        return numeroMotor;
    }

    public void setNumeroMotor(int numeroMotor) {
        this.numeroMotor = numeroMotor;
    }

    public String getSerieChasis() {
        return serieChasis;
    }

    public void setSerieChasis(String serieChasis) {
        this.serieChasis = serieChasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

  

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Marca= ").append(Marca).append("\n");
        sb.append("Modelo= ").append(modelo).append("\n");
        sb.append("Año= ").append(anio).append("\n");
        sb.append("Numero de Motor= ").append(numeroMotor).append("\n");
        sb.append("Serie de Chasis= ").append(serieChasis).append("\n");
        sb.append("Color= ").append(color).append("\n");
        sb.append("Tipo= ").append(tipo).append("\n");
        return sb.toString();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

 
    
}
