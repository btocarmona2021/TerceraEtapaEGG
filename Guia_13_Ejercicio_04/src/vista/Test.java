package vista;

import entidad.AdivinaNumero;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        AdivinaNumero an = new AdivinaNumero();
        int numero = 0;
        int contador = 0;
        do {
            try {
                System.out.println("Ingrese el numero a adivinar");
                numero = leer.nextInt();

            } catch (Exception e) {
                System.out.println(e);
                leer.nextLine();

            }
            contador++;
        } while (numero == 0);

        do {

            if (numero > an.getNumeroaleatorio()) {
                System.out.println("Ingresa un numero más chico");
                try {
                    numero = leer.nextInt();
                } catch (Exception e) {
                    System.out.println(e);
                    leer.nextLine();

                }
                contador++;
            } else if (numero < an.getNumeroaleatorio()) {
                System.out.println("Ingresa un numero más grande");
                try {
                    numero = leer.nextInt();

                } catch (Exception e) {
                    System.out.println(e);
                    leer.nextLine();

                }
                contador++;
            }

        } while (an.getNumeroaleatorio() != numero);

        System.out.println("Genial adivinaste con " + contador + " intentos");

    }

}
