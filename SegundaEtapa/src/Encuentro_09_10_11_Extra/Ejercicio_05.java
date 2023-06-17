//Realizar un programa que llene una matriz de tamaño NxM con 
//valores aleatorios y muestre la suma de sus elementos.
package Encuentro_09_10_11_Extra;

import java.util.Scanner;

public class Ejercicio_05 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int n, m;
        System.out.println("Ingrese el valor de la primer dimension de la matriz");
        n = leer.nextInt();
        System.out.println("Ingrese el valor de la segunda dimension de la matriz");
        m = leer.nextInt();

        int[][] matriz = new int[n][m];
        int suma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[j].length; j++) {
                matriz[i][j] = (int) (Math.random() * 100);
                suma = suma + matriz[i][j];
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("La suma de todos los indices da como resultado " + suma);

    }

}
