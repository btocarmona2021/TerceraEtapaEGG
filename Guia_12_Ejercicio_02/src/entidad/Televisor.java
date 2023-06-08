package entidad;

import java.util.Scanner;

public class Televisor extends Electrodomestico {

    private int resolucion;
    private boolean sintonizador;

    Scanner leer = new Scanner(System.in);

    public Televisor() {
    }

    public Televisor(int resolucion, boolean sintonizador, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    @Override
    public void crearTelevisor() {
        super.crearElectrodomestico();
        System.out.println("Por favor ingrese La resolucion del TV");
        this.resolucion = leer.nextInt();
        leer.nextLine();
        System.out.println("El televiso posee sintonizador TDT SI/NO");
        this.sintonizador = leer.nextLine().equalsIgnoreCase("SI");
    }
    
    @Override
    public double precioFinal(){
        
        if (this.resolucion>40 && this.isSintonizador()==true) {
            this.precio+=(super.precioFinal()*1.30)+500;
        }   else{
            this.precio+=super.precioFinal();
        }
        
       return this.precio;
    }
  
    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

}
