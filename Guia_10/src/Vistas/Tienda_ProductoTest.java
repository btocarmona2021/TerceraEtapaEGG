package Vistas;

import Servicios.Tienda_ProductoServicio;
import java.util.HashMap;
import java.util.Scanner;

public class Tienda_ProductoTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        HashMap<String, Double> tienda = new HashMap();
        Tienda_ProductoServicio ps = new Tienda_ProductoServicio();

        String opciones = "0";

       
        do {
            System.out.println("========ELIJA UNA1"
                    + " OPCIÓN=========");
            System.out.println("=                               =");
            System.out.println("= 1 - AGREGAR NUEVO PRODUCTO    =");
            System.out.println("= 2 - MODIFICAR PRECIO PRODUCTO =");
            System.out.println("= 3 - ELIMINAR UN PRODUCTO      =");
            System.out.println("= 4 - MOSTRAR PRODUCTOS Y PRECIO=");
            System.out.println("= 5 - ORDENAR POR PRECIO        =");
            System.out.println("= 6 - ORDENAR POR ALFABETO     ="); 
            System.out.println("= 7 - SALIR                     =");
            System.out.println("=                               =");
            System.out.println("========ELIJA UNA OPCIÓN=========");

                 System.out.println("Ingrese la opcion deseada");
            opciones = leer.nextLine();
            System.out.println("=================================");

            switch (opciones) {
                case "1":
                    ps.createProduct(tienda);
                    break;
                case "2":
                    ps.changePrice(tienda);
                    break;
                case "3":
                    ps.eliminarProducto(tienda);
                    break;
                case "4":
                    ps.mostrarProductos(tienda);
                    break;
                case "5":
                    System.out.println("Realmente desea Salir (S/N)");
                    opciones = leer.nextLine();
                    break;

                default:
                    System.out.println("La opción ingresada no es correcta");

            }

        } while (!opciones.equalsIgnoreCase("S"));

        System.out.println("Programa FINALIZADO");
        

    }

}
