//Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
//en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
//reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
//vocales acentuadas) se mantienen sin cambios
package Ejercicios;

import java.util.Scanner;

public class Ejercicio_11 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String palabra = "";
        String frase = "";

        do {
            System.out.println("Escriba una palabra o frase");
            frase = leer.nextLine();
            palabra += frase + " ";
        } while (!".".equals(frase));
        System.out.println( reemplaza(palabra));
    }

    public static String reemplaza(String palabra) {
        String nuevaFrase = "";

        for (int i = 0; i < palabra.length(); i++) {
            switch (palabra.substring(i, i + 1)) {
                case "a":
                    nuevaFrase = nuevaFrase.concat("@");
                    break;
                case "e":
                    nuevaFrase = nuevaFrase.concat("#");
                    break;
                case "i":
                    nuevaFrase = nuevaFrase.concat("$");
                    break;
                case "o":
                    nuevaFrase = nuevaFrase.concat("%");
                    break;
                case "u":
                    nuevaFrase = nuevaFrase.concat("*");
                    break;
                default:
                    nuevaFrase = nuevaFrase.concat(palabra.substring(i, i + 1));

            }

        }
        return nuevaFrase;
    }
}
