package entidad;

import java.util.Scanner;

public class Electrodomestico {

    protected double precio;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    Scanner leer = new Scanner(System.in);

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    //<editor-fold desc="METODOS">
    public void comprobarConsumoEnergetico(char letra) {
        if (letra >= 'A' && letra <= 'F') {
            this.consumoEnergetico = letra;
        } else {
            this.consumoEnergetico = 'F';
        }
    }

    public void comprobarColor(String color) {
        String[] colores = {"Blanco", "Negro", "Rojo", "Azul", "Gris"};
        for (int i = 0; i < colores.length; i++) {
            if (colores[i].equalsIgnoreCase(color)) {
                this.color = color;
            } else {
                this.color = "Blanco";
            }
        }
    }

    public void crearElectrodomestico() {
        System.out.println("Por favor ingrese el precio del producto");
        this.precio = leer.nextDouble()+1000;
        leer.nextLine();
        System.out.println("Por favor ingrese el peso del producto");
        this.peso = leer.nextDouble();
        leer.nextLine();
        System.out.println("Ingrese el color del producto");
        comprobarColor(leer.nextLine());
        System.out.println("Por último ingrese el Caracter del consumo energético");
        comprobarConsumoEnergetico(leer.nextLine().charAt(0));
    }

    public double precioFinal() {
        double preciofinal = 0;
        switch (this.consumoEnergetico) {
            case 'A':
                preciofinal = ((this.peso > 80) ? 1000 : (this.peso >= 50 && this.peso <= 79 ? 800 : (this.peso >= 20 && this.peso <= 49 ? 500 : (this.peso >= 1 && this.peso <= 19 ? 100 :1000)))) + 1000;
                break;
            case 'B':
                preciofinal = ((this.peso >= 80) ? 1000 : (this.peso >= 50 && this.peso <= 79 ? 800 : (this.peso >= 20 && this.peso <= 49 ? 500 : (this.peso >= 1 && this.peso <= 19 ? 100 : 0)))) + 800;
                break;
            case 'C':
                preciofinal = ((this.peso >= 80) ? 1000 : (this.peso >= 50 && this.peso <= 79 ? 800 : (this.peso >= 20 && this.peso <= 49 ? 500 : (this.peso >= 1 && this.peso <= 19 ? 100 : 0))))+ 600;
                break;
            case 'D':
                preciofinal = ((this.peso >= 80) ? 1000 : (this.peso >= 50 && this.peso <= 79 ? 800 : (this.peso >= 20 && this.peso <= 49 ? 500 : (this.peso >= 1 && this.peso <= 19 ? 100 : 0)))) + 500;
                break;
            case 'E':
                preciofinal = ((this.peso >= 80) ? 1000 : (this.peso >= 50 && this.peso <= 79 ? 800 : (this.peso >= 20 && this.peso <= 49 ? 500 : (this.peso >= 1 && this.peso <= 19 ? 100 : 0)))) + 300;
                break;
            case 'F':
                preciofinal = ((this.peso >= 80) ? 1000 : (this.peso >= 50 && this.peso <= 79 ? 800 : (this.peso >= 20 && this.peso <= 49 ? 500 : (this.peso >= 1 && this.peso <= 19 ? 100 : 0))))+100;
                break;
            default:
        }
        return preciofinal;
    }

    //</editor-fold>
    //<editor-fold desc="GET y SET">
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    //</editor-fold>

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Precio= ").append(precio).append("\n");
        sb.append("Color= ").append(color).append("\n");
        sb.append("Consumo Energetico= ").append(consumoEnergetico).append("\n");
        sb.append("Peso= ").append(peso).append("\n");
        return sb.toString();
    }
}
