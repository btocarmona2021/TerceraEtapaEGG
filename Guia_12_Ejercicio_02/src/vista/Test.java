package vista;

import entidad.Electrodomestico;
import entidad.Lavadora;
import entidad.Televisor;

public class Test {

    public static void main(String[] args) {

        Electrodomestico lavadora_01 = new Lavadora();
        Electrodomestico televisor_01 = new Televisor();
        System.out.println("Creando Lavadora");
        lavadora_01.crearLavadora();
        System.out.println("Creando Televisor");
        televisor_01.crearTelevisor();
        System.out.println("Precio Final Lavadora");
        System.out.println(lavadora_01.precioFinal());
        System.out.println("Precio final Televisor");
        System.out.println(televisor_01.precioFinal());

    }

}
