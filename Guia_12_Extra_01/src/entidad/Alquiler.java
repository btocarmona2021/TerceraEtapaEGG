package entidad;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Alquiler {

    private Cliente cliente;

    private Date fechaAmarre;

    private Date fechaDesamarre;

    private Barco barco;

    private Enum posicionAmarre;

    public Alquiler() {
    }

    public Alquiler(Cliente cliente,String fechaAmarre, String fechaDesamarre, Barco barco, Enum posicionAmarre) {
        this.cliente = cliente;
        Date amarre = new Date(fechaAmarre);
        Date desamarre = new Date(fechaDesamarre);
        this.fechaAmarre = amarre;
        this.fechaDesamarre = desamarre;
        this.barco = barco;
        this.posicionAmarre = posicionAmarre;
    }
    

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFechaAmarre() {
        return fechaAmarre;
    }

    public void setFechaAmarre(Date fechaAmarre) {
        this.fechaAmarre = fechaAmarre;
    }

    public Date getFechaDesamarre() {
        return fechaDesamarre;
    }

    public void setFechaDesamarre(Date fechaDesamarre) {
        this.fechaDesamarre = fechaDesamarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public Enum getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(Enum posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    @Override
    public String toString() {
        
        SimpleDateFormat formatter = new SimpleDateFormat("dd 'de' MMM 'del' YYYY");
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente= ").append(cliente.getNombre()).append("\n");
        sb.append("Fecha Amarre= ").append(formatter.format(fechaAmarre)).append("\n");
        sb.append("Fecha Desamarre= ").append(formatter.format(fechaDesamarre)).append("\n");
        sb.append("Barco= ").append(barco.getMatricula()).append("\n");
        sb.append("Posicion Amarre= ").append(posicionAmarre).append("\n");
        return sb.toString();
    }

  
    
}
