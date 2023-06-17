//Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
//donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un
//programa que permita introducir un cuadrado por teclado y determine si este
//cuadrado es mágico o no. El programa deberá comprobar que los números
//introducidos son correctos, es decir, están entre el 1 y el 9
package Encuentro_09_10_11;

import java.util.Scanner;

public class Ejercicio_06 {

    public static void main(String[] args) {

        int[][] matriz = new int[3][3];
        
        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                System.out.println("Ingrese un numero entre 1 y 9");
                int num = leer.nextInt();
                
                while (num < 1 || num > 9) {
                    System.out.println("Ingrese nuevamente el numero ,el ingresado no cumple con "
                            + "lo solicitado");
                    num = leer.nextInt();
                }
                matriz[i][j] = num;
            }
        }
        
        int fila1 = 0;
        int fila2 = 0;
        int fila3 = 0;
        int col1 = 0;
        int col2 = 0;
        int col3 = 0;
        int diag1 = 0;
        int diag2 = 0;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                if (i == 0 && j <= 2) {
                    fila1 += matriz[i][j];
                } 
                if (i == 1 && j <= 2) {
                    fila2 += matriz[i][j];
                }
                if (i == 2 && j <= 2) {
                    fila3 += matriz[i][j];
                }
                if (j == 0 && i <= 2) {
                    col1 += matriz[i][j];
                }
                if (j == 1 && i <= 2) {
                    col2 += matriz[i][j];
                }
                if (j == 2 && i <= 2) {
                    col3 += matriz[i][j];
                }
                if (j == 0 && i == 0 || j == 1 && i == 1 || j == 2 && i == 2) {
                    diag1 += matriz[i][j];
                }
                if (i==2 && j==0 || i==1 && j==1 || j==2 && i==0) {
                    diag2 += matriz[i][j];
                }
            }
        }
//        System.out.println(fila1+" " + fila2 + " "+ fila3+" "+ col1+" "+ col2 +" "+ col3 + " "+ diag1+ " " + diag2 );
        if (fila1==fila2 && fila1==fila3 && fila1 == col1 && fila1 == col2 && fila1== col3 && fila1 ==diag1 
            && fila1 == diag2){
            System.out.println("El cubo es Mágico");
        }else{
            System.out.println("El cubo NO ES Mágico");
        }
        
        mostrarMatriz(matriz);

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
