//Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y
//los muestre por pantalla en orden descendente.
package Encuentro_09_10_11;

import java.util.Scanner;

public class Ejercicio_01 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int[] numerosEnteros = new int[100];
        rellena(numerosEnteros);
    }

    public static void rellena(int[] numerosEnteros) {

        for (int i = 0; i < numerosEnteros.length; i++) {
            numerosEnteros[i] = numerosEnteros.length - i;
            System.out.println(numerosEnteros[i]);
        }
    }
}
