package Encuentro_09_10_11;

public class Ejercicio_04_bis {

    public static void crearMatriz() {
        int[][] matriz = new int[4][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
                System.out.print("[ " + matriz[i][j] + " ]");
            }
            System.out.println("");

        }
        System.out.println("=======================");
        matrizTraspuesta(matriz);
    }

    public static void matrizTraspuesta(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[ " + matriz[j][i] + " ]");
            }
            System.out.println("");
        }
    }
}
    
   
