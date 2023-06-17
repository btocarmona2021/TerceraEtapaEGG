//Escriba un programa que lea números enteros. Si el número es múltiplo de cinco
//debe detener la lectura y mostrar la cantidad de números leídos, la cantidad de
//números pares y la cantidad de números impares. Al igual que en el ejercicio
//anterior los números negativos no deben sumarse. Nota: recordar el uso de la
//sentencia break. 
package Encuentro_04_05_06_Extras;

import java.util.Scanner;

public class Ejercicio_08_Extra {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un numero entero");
        int num = leer.nextInt();
        int contador = 0;
        int pares = 0;
        int impares = 0;

        while (num % 5 != 0) {
            contador++;
            if (num % 2 == 0 && num > 0) {
                pares++;
            } else if (num % 2 != 0) {
                impares++;
            }
            System.out.println("Ingresa otro numero");
            num = leer.nextInt();
            if (num % 5 == 0) {
                break;
            }
        }

        System.out.println("La cantidad de numeros pares ingresados es de " + pares + " "
                + ",y la cantidad de numeros impares ingresados es de " + impares);

    }
}
