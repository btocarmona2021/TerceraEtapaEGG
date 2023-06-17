// Escribir un programa que pida dos números enteros por teclado y calcule la suma
// de los dos. El programa deberá después mostrar el resultado de la suma
package Encuentro_02_03;

import java.util.Scanner;

public class Ejercicio_01 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese el primer número");
        int num1 = leer.nextInt();
        System.out.println("Ahora ingresa el segundo número a sumar");
        int num2 = leer.nextInt();
        System.out.println("La suma de ambos numeros es " + suma(num1, num2));

    }

    public static int suma(int num1, int num2) {
        int suma = num1 + num2;
        return suma;
    }
}
