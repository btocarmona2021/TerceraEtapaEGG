package Encuentro_09_10_11;

import java.util.Scanner;

public class Ejercicio_03 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int tam;
        System.out.println("Ingrese el tamaño del vector");
        tam = read.nextInt();
        int[] vector = new int[tam];
        rellenarVector(vector);
        contarNum(vector);
        for (int i : vector) {
            
        }
    }

    public static void rellenarVector(int vector[]) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 100000);
            System.out.println(vector[i]);
        }
    }

    public static void contarNum(int vector[]) {
        int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;
        int result;
        
        for (int i = 0; i < vector.length; i++) {
            result = 0;
            while (vector[i] > 0) {
                vector[i] = vector[i] / 10;
                result = result + 1;
            }
            switch (result) { 
                case 1:
                    cont1++;
                    break;
                case 2:
                    cont2++;
                    break;
                case 3:
                    cont3++;
                    break;
                case 4:
                    cont4++;
                    break;
                case 5:
                    cont5++;
                    break;
            }
        }
        System.out.println("Cantidad de num con 1 digito: " + cont1);
        System.out.println("Cantidad de num con 2 digito: " + cont2);
        System.out.println("Cantidad de num con 3 digito: " + cont3);
        System.out.println("Cantidad de num con 4 digito: " + cont4);
        System.out.println("Cantidad de num con 5 digito: " + cont5);
    }
}
