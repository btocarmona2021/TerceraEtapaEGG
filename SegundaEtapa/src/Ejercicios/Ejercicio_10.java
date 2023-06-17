//Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
//ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo: 
//5 *****
//3 ***
//11 ***********
//2 ** 
package Ejercicios;

import java.util.Scanner;

public class Ejercicio_10 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int contador = 1;
        int numero;
        
        do {
            System.out.println("Ingrese un numero comprendido entre 1 y 20");
            numero=leer.nextInt();
            for (int i = 0; i < numero; i++) {
                System.out.print("*");
            }
            System.out.println("");
            contador++;

        } while (contador <= 4);

    }
}
