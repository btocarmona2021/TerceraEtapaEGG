//Implementar un programa que le pida dos números enteros a usuario y determine si ambos o 
//alguno de ellos es mayor a 25. 
package Encuentro_02_03;

import java.util.Scanner;

public class Ejercicio_06 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Ingrese el primer numero entero");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero entero");
        num2 = leer.nextInt();

        if (num1 > 25 && num2 > 25) {
            System.out.println("Los dos numeros ingresados son mayores a 25 / " + num1 + " " + num2);
        } else if (num1 > 25) {
            System.out.println("El primer numero ingresado es mayor a 25 / " + num1);
        } else if (num2 > 25) {
            System.out.println("El segundo numero ingresado es mayor a 25 / " + num2);
        } else {
            System.out.println("Los dos numeros ingresados son menores a 25 / " + num1 + " " + num2);
        }
    }
}
