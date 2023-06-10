package vista;

import entidad.Edificio;
import entidad.EdificioDeOficina;
import entidad.Polideportivo;
import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        ArrayList<Edificio> edificios = new ArrayList<>();

        edificios.add(new Polideportivo("Deportivo Talleres", true, 120, 5, 60));
        edificios.add(new Polideportivo("Polideportivo Sur", false, 100, 6, 40));
        edificios.add(new EdificioDeOficina(12, 30, 12, 50, 36, 50));
        edificios.add(new EdificioDeOficina(6, 20, 10, 40, 30, 20));

        for (int i = 0; i < edificios.size(); i++) {

            System.out.print("La superficie del edificio " + (i + 1)+" es ");
            System.out.println(edificios.get(i).calcularSuperficie() + " Mt²");
            System.out.print("El volumen del edificio " + (i + 1) +" es ");
            System.out.println(edificios.get(i).calcularVolumen()+ " Mt³");
            System.out.println("======================================");
        }

    }

}
