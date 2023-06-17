package Encuentro_09_10_11;

import java.util.Scanner;

public class Ejercicio_02 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int tam, num;
        System.out.println("Ingrese el tamaño de su vector");
        tam = read.nextInt();
        int[] vector = new int[tam];
        rellenarVector(vector);
        System.out.println("Ingre el número que desea buscar 1 - 10");
        num = read.nextInt();
        buscarNum(vector, num);
    }

    public static void rellenarVector(int vector[]) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10);
            System.out.println(vector[i]);
        }
    }

    public static void buscarNum(int vector[], int n) {
        int cont = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == n) {
                System.out.println("El número " + n + " se encuentra en la posición: " + i);
                cont = cont + 1;
            }
        }
        if (cont == 0) {
            System.out.println("El número " + n + " no se encuentra en el vector");
        }
    }
}
