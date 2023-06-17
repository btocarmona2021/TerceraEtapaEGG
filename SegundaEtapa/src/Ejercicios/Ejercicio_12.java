//Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
//que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del
//segundo, sino informe que no lo son
package Ejercicios;

import java.util.Scanner;

public class Ejercicio_12 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num1 = leer.nextInt();
        System.out.println("Ingresa el segundo numero");
        int num2 = leer.nextInt();
        esMultiplo(num1, num2);

    }

    public static void esMultiplo(double num1, double num2) {

        boolean estado = (num1 / num2) % 2 == 0;
        if (estado == true || (num1 / num2) == 1) {
            System.out.println("El primer numero es multiplo del segundo");
        } else {
            System.out.println("El primer numero NO es multiplo del segundo");
        }
    }
}
