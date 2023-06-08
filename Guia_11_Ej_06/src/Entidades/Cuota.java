package Entidades;

import Enumeraciones.FormaPago;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cuota {

    private int numCuota;

    private double montoCuota;

    private boolean pagado;

    private Date fechaVencimiento;

    private String formapago;
    
    private static int cuentaCuota=1;

    SimpleDateFormat sd = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy");
    public Cuota() {
       
    }

    public Cuota(int numCuota, double montoTotal, boolean pagado, Date fechaVencimiento, String formapago) {
        
        this.numCuota = numCuota;
        this.montoCuota = montoTotal;
        this.pagado = pagado;
        Date fecha = fechaVencimiento;
        this.fechaVencimiento = fecha;
        this.formapago = formapago;
        
    }

    public int getNumCuota() {
        return numCuota;
    }

    public void setNumCuota(int numCuota) {
        this.numCuota = numCuota;
    }

    public double getMontoTotal() {
        return montoCuota;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoCuota = montoTotal;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    public String getFechaVencimiento() {
        return sd.format(fechaVencimiento);
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getFormapago() {
        return formapago;
    }

    public void setFormapago(String formapago) {
        this.formapago = formapago;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Número Cuota= ").append(numCuota).append("\n");
        sb.append("Monto Total= ").append(montoCuota).append("\n");
        sb.append("Pagado= ").append(pagado ? "Pagado":" Sin pagar").append("\n");
        sb.append("Fecha de Vencimiento= ").append(sd.format(fechaVencimiento)).append("\n");
        sb.append("Forma de pago= ").append(formapago).append("\n");
        return sb.toString();
    }
}
