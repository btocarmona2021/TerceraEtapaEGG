package vista;

import entidad.Electrodomestico;
import entidad.Lavadora;
import entidad.Televisor;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        ArrayList<Electrodomestico> electros = new ArrayList<>();

        electros.add(new Lavadora(50, 100000, "Azul", 'B', 80));
        electros.add(new Lavadora(10, 50000, "Blanco", 'C', 60));
        electros.add(new Televisor(24, false, 30000, "negro", 'A', 35));
        electros.add(new Televisor(50, true, 80000, "Gris", 'B', 45));

        double precioTotal = 0;
        double totalLavarropas = 0;
        double totalTelevisores = 0;
        for (int i = 0; i < electros.size(); i++) {
            System.out.println(electros.get(i).getClass().getName());
            System.out.println("El precio final del producto " + (i + 1) + " es " + electros.get(i).precioFinal());
            precioTotal += electros.get(i).getPrecio();
            if (electros.get(i) instanceof Lavadora) {
                totalLavarropas += electros.get(i).getPrecio();
            } else {
                totalTelevisores += electros.get(i).getPrecio();
            }

        }
        System.out.println("El precio total de todos los productos es: " + precioTotal);
        System.out.println("El precio total de los lavarropas es: " + totalLavarropas);
        System.out.println("El precio total de los lavarropas es: " + totalTelevisores);

    }

}
