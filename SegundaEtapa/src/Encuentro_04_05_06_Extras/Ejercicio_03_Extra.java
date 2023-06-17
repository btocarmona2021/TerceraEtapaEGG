//Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una
//vocal. Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la
//clase String.
package Encuentro_04_05_06_Extras;

import java.util.Scanner;

public class Ejercicio_03_Extra {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una letra");
        String letra = leer.nextLine();
        metodo(letra);
    }

    public static void metodo(String letra) {

        switch (letra.toLowerCase()) {
            case "a":System.out.println("La letra ingresada es una a");
                break;
            case "e":System.out.println("La letra ingresada es una e");
                break;
            case "i":System.out.println("La letra ingresada es una i");
                break;
            case "o":System.out.println("La letra ingresada es una o");
                break;
            case "u":System.out.println("La letra ingresada es una u");
                break;
            default:
                System.out.println("La letra ingresada no es una vocal");

        }

    }
}
