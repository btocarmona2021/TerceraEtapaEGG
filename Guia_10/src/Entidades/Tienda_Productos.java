package Entidades;

import java.util.Comparator;

public class Tienda_Productos {

    private String producto;
    private double precio;

    public Tienda_Productos() {
    }

    public Tienda_Productos(String producto, double precio) {
        this.producto = producto;
        this.precio = precio;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Producto= ").append(producto).append("\n");
        sb.append("Precio= ").append(precio).append(" Pesos").append("\n");
        return sb.toString();
    }

    public static Comparator<Tienda_Productos> comparaPrecio = new Comparator<Tienda_Productos>() {
        @Override
        public int compare(Tienda_Productos o1, Tienda_Productos o2) {
            return Double.compare(o1.getPrecio(), o2.getPrecio());
        }
    };

    public static Comparator<Tienda_Productos> ordenaProducto = new Comparator<Tienda_Productos>() {
        @Override
        public int compare(Tienda_Productos o1, Tienda_Productos o2) {
            return (o1.getProducto().compareTo(o2.getProducto()));
        }
    };

}
