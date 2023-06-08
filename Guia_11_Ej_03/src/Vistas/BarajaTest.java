package Vistas;

import Entidades.Baraja;
import Entidades.Carta;
import java.util.ArrayList;
import java.util.Scanner;

public class BarajaTest {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Carta> maso = new ArrayList();
        for (int i = 0; i < 40; i++) {
            maso.add(new Carta());
        }
        Baraja baraja = new Baraja(maso);
        String op = "";
        while (!op.equalsIgnoreCase("S")) {
            System.out.println("Ingresa una opcion");
            System.out.println("===================");
            System.out.println("1 - Barajar");

            System.out.println("2 - Dar cartas");
            System.out.println("3 - Siguiente Carta");

            System.out.println("4 - Mostra montón salido");
            System.out.println("5 - Cartas Disponibles");
            System.out.println("6 - Mostrar baraja restante");
            System.out.println("7 - Salir");
            System.out.println("===================");
            op = leer.nextLine();

            switch (op) {
                case "1":
                    baraja.barajar();
                    break;
                case "2":
                    System.out.println("Ingresa la cantidad de cartas que quieres");
                    baraja.darCartas(leer.nextInt());
                    leer.nextLine();
                    break;
                case "3":
                    baraja.siguienteCarta();
                    break;
                case "4":
                    baraja.cartasMonton();
                    break;
                case "5":
                    baraja.cartasDisponibles();
                    break;
                case "6":
                    baraja.mostrarBaraja();
                    System.out.println("==================");
                    break;
                case "7":
                    System.out.println("Realmente quiere Salir S/N");
                    op = leer.nextLine();
                    break;
                default:

            }

        }

    }

}
