package vista;

import entidad.Alojamiento;
import entidad.AlojamientosExtras;
import entidad.Camping;
import entidad.Gerente;
import entidad.Hotel;
import entidad.HotelCincoEstrellas;
import entidad.HotelCuatroEstrellas;
import entidad.Residencia;
import java.util.ArrayList;
import java.util.Collections;

public class Test {

    public static void main(String[] args) {
        Gerente gerente_01 = new Gerente("Daniel Perez", 24365987);
        Gerente gerente_02 = new Gerente("Hugo Fernandez", 326544987);
        Gerente gerente_03 = new Gerente("Fabricio Monsalve", 32666412);
        ArrayList<Hotel> alojamientos = new ArrayList<>();
        Hotel hotel1 = new HotelCuatroEstrellas('B', "El dormilon", 30, 10, 2, 10, "Hotel Petit", "Ant Agr2020", "San Antonio Oeste", gerente_01);
        Hotel hotel2 = new HotelCincoEstrellas(4, 10, 10, 'A', "La Parrila Loca", 30, 30, 2, 15, "El Austral", "San Martin 654", "Viedma", gerente_02);
        Hotel hotel3 = new HotelCuatroEstrellas('A', "Locos por el asado", 20, 12, 1, 8, "Hotel Confort", "Belgrano 123", "Bahia Blanca", gerente_03);
        AlojamientosExtras camping_01 = new Camping(10, 5, false, false, 180, "Camping Municipal", "La Pampa 1203", "La Pampa", gerente_01);
        AlojamientosExtras camping_02 = new Camping(20, 8, true, true, 200, "Camping del Neuquen", "Moreno 655", "San Antonio", gerente_02);
        AlojamientosExtras camping_03 = new Camping(12, 5, false, true, 160, "El Farolito", "Belgrano 666", "Deán Funes", gerente_03);
        AlojamientosExtras residencia_01 = new Residencia(15, true, true, false, 190, "Camping municipal", "Int San AMrtin 65", "Jesus Maria", gerente_01);
        AlojamientosExtras residencia_02 = new Residencia(16, false, false, false, 120, "Dulces sueños", "Bown 96", "Bariloche", gerente_01);

        ArrayList<AlojamientosExtras> alojamientosExtras = new ArrayList<>();

        alojamientos.add(hotel1);
        alojamientos.add(hotel2);
        alojamientos.add(hotel3);
        alojamientosExtras.add(camping_01);
        alojamientosExtras.add(camping_02);
        alojamientosExtras.add(camping_03);
        alojamientosExtras.add(residencia_01);
        alojamientosExtras.add(residencia_02);

        System.out.println("Lista de Hoteles");
        System.out.println("=================");
        for (Hotel alojamiento : alojamientos) {
            System.out.println(alojamiento.getNombre());
            alojamiento.calcPrecioHab();
        }
        System.out.println("======================================");

        Collections.sort(alojamientos, Hotel.comparaPrecio);
        for (Hotel alojamiento : alojamientos) {
            if (alojamiento instanceof HotelCuatroEstrellas) {
                HotelCuatroEstrellas hotel4 = (HotelCuatroEstrellas) alojamiento;
                System.out.print(alojamiento.getNombre() + " valor de habitación ");
                System.out.println(alojamiento.getPrecioHabitaciones() + " pesos");
            }

        }
        System.out.println("========================================");
        System.out.println("Alojamientos Extras detalles");
        System.out.println("========================================");

        for (AlojamientosExtras alojamientosExtra : alojamientosExtras) {
            if (alojamientosExtra instanceof Camping) {
                Camping camp = (Camping) alojamientosExtra;
                if (camp.isRestaurant()) {
                    System.out.println("Camping con restaurant: " + camp.getNombre());
                }
            }
            if (alojamientosExtra instanceof Residencia) {
                Residencia resi = (Residencia) alojamientosExtra;
                if (resi.isDescuento()) {
                    System.out.println("Residencia con descuento a gremios: " + resi.getNombre());
                }

            }
        }

    }
}
