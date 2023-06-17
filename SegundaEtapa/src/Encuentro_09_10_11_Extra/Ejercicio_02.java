//Escriba un programa que averigüe si dos vectores de 
//N enteros son iguales (la comparación deberá detenerse 
//en cuanto se detecte alguna diferencia entre los elementos).
package Encuentro_09_10_11_Extra;

import java.util.Scanner;

public class Ejercicio_02 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor del vector");
        int n = leer.nextInt();
        int cont = 0;
        int[] vector01 = new int[n];
        int[] vector02 = new int[n];

        for (int i = 0; i < vector01.length; i++) {
            System.out.println("Ingrese el numero " + (i + 1) + " del vector 01");
            vector01[i] = leer.nextInt();
        }
        for (int i = 0; i < vector02.length; i++) {
            System.out.println("Ingrese el numero " + (i + 1) + " del vector 02");
            vector02[i] = leer.nextInt();
        }

        for (int i = 0; i < vector01.length; i++) {

            if (vector01[i] == vector02[i]) {
                cont = cont + 1;

            } else {
                System.out.println("Los vectores son distintos");
                break;
            }

            if (cont == n) {
                System.out.println("Los vectores son iguales");
            }
        }

    }

}
