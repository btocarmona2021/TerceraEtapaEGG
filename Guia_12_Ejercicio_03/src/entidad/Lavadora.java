package entidad;

import java.util.Scanner;

public class Lavadora extends Electrodomestico {

    private int cargaRopa;

    Scanner leer = new Scanner(System.in);

    public Lavadora() {
    }

    public Lavadora(int cargaRopa, double precio, String color, char consumoEnergetico, double peso) {
        super(precio+1000, color, consumoEnergetico, peso);
        this.cargaRopa = cargaRopa;
    }

    public void crearLavadora() {
        crearElectrodomestico();
        System.out.println("Ingrese la capacidad de carga");
        this.cargaRopa = leer.nextInt();
        leer.nextLine();
    }

    public int getCargaRopa() {
        return cargaRopa;
    }

    public void setCargaRopa(int cargaRopa) {
        this.cargaRopa = cargaRopa;
    }

    @Override
    public double precioFinal() {

        if (this.cargaRopa > 30) {
            this.precio += super.precioFinal() + 500;
        } else {
            this.precio += super.precioFinal();
        }

        return this.precio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Carga Ropa= ").append(cargaRopa);
        return sb.toString();
    }

}
