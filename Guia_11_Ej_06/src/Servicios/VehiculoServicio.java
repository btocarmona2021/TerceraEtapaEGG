package Servicios;

import Entidades.Vehiculo;
import java.util.Scanner;

public class VehiculoServicio {

    Scanner leer = new Scanner(System.in);

    public Vehiculo crearVehiculo() {
        System.out.println("Ingrese la marca del vehículo");
        String marca = leer.nextLine();
        System.out.println("Ingrese el modelo del vehículo");
        String modelo = leer.nextLine();
        System.out.println("Ingrese el año del vehículo");
        int anio = leer.nextInt();
        leer.nextLine();
        System.out.println("Ingrese el numero de motor");
         int nmotor = leer.nextInt();
        leer.nextLine();
        System.out.println("Ingrese la serie del chasis");
        String serie = leer.nextLine();
        System.out.println("Ingrese el color del vehículo");
        String color = leer.nextLine();
        System.out.println("ingrese el tipo de vehículo");
        String tipo= leer.nextLine();
        return new Vehiculo(marca, modelo, anio, nmotor, serie, color, tipo);
    }

}
