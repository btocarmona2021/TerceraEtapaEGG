package Entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Poliza {

    private int numeroPoliza;
    private Cliente cliente;

    private Vehiculo vehiculo;

    private ArrayList<Cuota> cantCuotas = new ArrayList<>();

    private double montoTotal;

    private boolean incluyeGranizo;

    private double montoMaxGranizo;

    private Date fechaInicio;

    private Date fechaFin;

    private String formaPago;

    private String cobertura;
    private static int contadorPoliza;

    Scanner leer = new Scanner(System.in);
    SimpleDateFormat sd = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy");

  
    public Poliza() {
        System.out.println("====================================================");
        System.out.println("Vamos a ingresar el rodado a nuestra base de datos");
        System.out.println("Ingrese la marca");
        String marcaV = leer.nextLine();
        System.out.println("Ingrese el modelo");
        String modeloV = leer.nextLine();
        System.out.println("Ingrese el año yyyy");
        int anio = leer.nextInt();
        System.out.println("Ahora el número de motor");
        int nMotor = leer.nextInt();
        leer.nextLine();
        System.out.println("Ingrese el número de chasis");
        String serieChasis = leer.nextLine();
        System.out.println("Ingrese el color del vehiculo");
        String colorV = leer.nextLine();
        System.out.println("Ingrese el tipo de vehiculo");
        String tipoV = leer.nextLine();

        this.vehiculo = new Vehiculo(marcaV, modeloV, anio, nMotor, serieChasis, colorV, tipoV);
        System.out.println("====================================================");
        System.out.println("Vamos a ingresar el Cliente a nuestra base de datos");
        System.out.println("Ingrese nombre del cliente");
        String nombreC = leer.nextLine();
        System.out.println("Ingrese el apellido");
        String apellidoC = leer.nextLine();
        System.out.println("Ingrese el DNI por favor.");
        int dniC = leer.nextInt();
        leer.nextLine();
        System.out.println("Ingrese el correo electrónico");
        String correoC = leer.nextLine();
        System.out.println("Ingrese el domicilio actual");
        String domicilioC = leer.nextLine();
        System.out.println("Ingrese el número de teléfono");
        String telefonoC = leer.nextLine();
        this.cliente = new Cliente(nombreC, apellidoC, dniC, correoC, domicilioC, telefonoC, this.vehiculo);
        this.numeroPoliza = ++Poliza.contadorPoliza;
        System.out.println("Ingrese la fecha de inicio de la poliza año/mes/dia");
        Date fechaIni = new Date(leer.nextLine());
        System.out.println("Ingrese la fecha del fin de la poliza año/mes/dia");
        Date fechaFi = new Date(leer.nextLine());
        this.fechaInicio = fechaIni;
        this.fechaFin = fechaFi;
        Calendar sumarMes = Calendar.getInstance();
        Date fechaVencimineto = this.fechaInicio;
        sumarMes.setTime(fechaVencimineto);
        System.out.println("Ingrese el monto total de las cuotas");
        this.montoTotal = leer.nextInt();
        leer.nextLine();
        System.out.println("Ingrese la forma de Pago");
        this.formaPago = leer.nextLine();
        for (int i = 0; i < (fechaFin.getMonth() + 1) - fechaInicio.getMonth(); i++) {
            sumarMes.add(Calendar.MONTH, 1);
            fechaVencimineto = sumarMes.getTime();
            cantCuotas.add(new Cuota(i + 1, montoTotal / ((this.fechaFin.getMonth() + 1) - this.fechaInicio.getMonth()), false, fechaVencimineto, this.formaPago));
        }
        System.out.println("La cobertura incluye daños por granizo Si/No");
        String granizo = leer.nextLine();
        boolean estado = false;
        if (granizo.equalsIgnoreCase("SI")) {
            estado = true;
        } else {
            estado = false;
        }
        this.incluyeGranizo = estado;
        System.out.println("Ingrese el monto maximo de granizo");
        this.montoMaxGranizo = leer.nextInt();
        leer.nextLine();
        System.out.println("Ingrese el tipo de cobertura");
        this.cobertura = leer.nextLine();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculos() {
        return vehiculo;
    }

    public void setVehiculos(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(int numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public ArrayList<Cuota> getCantCuotas() {
        return cantCuotas;
    }

    public void setCantCuotas(ArrayList<Cuota> cantCuotas) {
        this.cantCuotas = cantCuotas;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public boolean isIncluyeGranizo() {
        return incluyeGranizo;
    }

    public void setIncluyeGranizo(boolean incluyeGranizo) {
        this.incluyeGranizo = incluyeGranizo;
    }

    public double getMontoMaxGranizo() {
        return montoMaxGranizo;
    }

    public void setMontoMaxGranizo(double montoMaxGranizo) {
        this.montoMaxGranizo = montoMaxGranizo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public String getCobertura() {
        return cobertura;
    }

    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente= ").append(cliente).append("\n");
        sb.append("Numero de Poliza= ").append(numeroPoliza).append("\n");
        sb.append("Cantidad de Cuotas= ").append(cantCuotas.size() + " ").append(cantCuotas).append("\n");
        sb.append("Monto Total= ").append(montoTotal).append("\n");
        sb.append("Incluye Granizo= ").append(incluyeGranizo ? "SI" : "NO").append("\n");
        sb.append("Monto Max Granizo= ").append(montoMaxGranizo).append("\n");
        sb.append("Fecha Inicio= ").append(sd.format(fechaInicio)).append("\n");
        sb.append("Fecha Fin= ").append(sd.format(fechaFin)).append("\n");
        sb.append("Forma de Pago= ").append(formaPago).append("\n");
        sb.append("Cobertura= ").append(cobertura).append("\n");
        return sb.toString();
    }

}
