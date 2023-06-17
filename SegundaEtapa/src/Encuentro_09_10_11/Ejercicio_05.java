package Encuentro_09_10_11;

public class Ejercicio_05 {

    public static void main(String[] args) {
        int[][] matriz = {{0, -2, 4}, {2, 0, 2}, {-4, -2, 0}};
        int[][] matrizTrasp = new int[3][3];
        mostrarMatriz(matriz);
        trasponerMatriz(matriz, matrizTrasp);
        System.out.println("-------------------");
        mostrarMatriz(matrizTrasp);
        System.out.println("-------------------");
        System.out.println("La matriz es ANTISIMETRICA? " + esantisimetrica(matriz, matrizTrasp));
    }

    public static void trasponerMatriz(int matriz[][], int matrizTrasp[][]) {
        for (int i = 0; i < matrizTrasp.length; i++) {
            for (int j = 0; j < matrizTrasp.length; j++) {
                matrizTrasp[i][j] = matriz[j][i];
            }
        }
    }

    public static boolean esantisimetrica(int matriz[][], int matrizTrasp[][]) {
        boolean bandera = false;
        int cont = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] == -matrizTrasp[i][j]) {
                    cont++;
                }
            }
        }
        if (cont == 9) {
            bandera = true;
        }
        return bandera;
    }

    public static void mostrarMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[ " + matriz[i][j] + " ]");
            }
            System.out.println("");
        }
    }
}
