package Servicios;

import Entidades.Cliente;
import java.util.Scanner;

public class ClienteServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cliente crearCliente() {

        System.out.println("Ingrese Nombre del cliente");
        String nombre = leer.nextLine();

        System.out.println("Ingrese Apellido del cliente");
        String apellido = leer.nextLine();

        System.out.println("Ingrese DNI");
        int dni = leer.nextInt();
        leer.nextLine();

        System.out.println("Ingrese el Correo electrónico");
        String correo = leer.nextLine();

        System.out.println("Ingrese el domicilio");
        String domicilio = leer.nextLine();

        System.out.println("Por último ingrese el telefono");
        int telefono = leer.nextInt();
        leer.nextLine();

        return new Cliente();
    }

}
