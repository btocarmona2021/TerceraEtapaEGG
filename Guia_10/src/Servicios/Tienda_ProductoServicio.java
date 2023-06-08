package Servicios;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Tienda_ProductoServicio {

    Scanner read = new Scanner(System.in).useLocale(Locale.US).useDelimiter("\n");

    public void createProduct(HashMap<String, Double> shop) {

        System.out.println("Ingrese el nombre del Producto y el precio");
        shop.put(read.nextLine().toUpperCase(), read.nextDouble());
        read.nextLine();
        System.out.println("=======PRODUCTO AGREGADO CORRECTAMENTE=========");

    }

    public void changePrice(HashMap<String, Double> shop) {
        System.out.println("Ingrese el producto que desea modificar su precio");
        String productoMod = read.nextLine();
        boolean encontrado = false;
        for (Map.Entry<String, Double> datos : shop.entrySet()) {
            if (datos.getKey().equalsIgnoreCase(productoMod)) {
                System.out.println("Ingrese el nuevo precio para el producto especificado");
                datos.setValue(read.nextDouble());
                encontrado = true;
                break;
            } else {
                encontrado = false;
            }
        }
        if (encontrado) {
            System.out.println("El precio ha sido modificado");
        } else {
            System.out.println("**** El producto no se encuentra en la tienda *****");
        }
        System.out.println("====================================");

    }
    
    public void eliminarProducto(HashMap<String, Double> tienda) {
        boolean confirmacion = false;
        System.out.println("Ingrese el producto que desea eliminar");
        String aEliminar = read.nextLine();
        for (Map.Entry<String, Double> datos : tienda.entrySet()) {
            if (datos.getKey().equalsIgnoreCase(aEliminar)) {
                tienda.remove(datos.getKey());
                confirmacion = true;
                break;
            } else {
                confirmacion = false;
            }
        }
        if (confirmacion) {
            System.out.println("El producto ha sido eliminado");
        } else {
            System.out.println("no se ha encontrado el producto");
        }
        System.out.println("====================================");
    }

    public void mostrarProductos(HashMap<String, Double> tienda) {
        int contadorProductos = 0;
        for (Map.Entry<String, Double> datos : tienda.entrySet()) {
            System.out.println("El producto " + datos.getKey() + " tiene un valor de " + datos.getValue());
            contadorProductos++;
        }
        System.out.println("El total de productos en stock es de " + contadorProductos);
        System.out.println("====================================");

    }
}
