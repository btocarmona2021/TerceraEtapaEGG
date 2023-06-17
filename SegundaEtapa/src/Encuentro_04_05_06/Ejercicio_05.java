//Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
//solicite números al usuario hasta que la suma de los números introducidos supere el
//límite inicial.

package Encuentro_04_05_06;

import java.util.Scanner;

public class Ejercicio_05 {

      public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero que servira de limite en la suma de los valores");
        int limite = leer.nextInt();
        System.out.println("Ingrese el primer numero a sumar");
        int num = leer.nextInt();
        int suma = num;
        
        while (limite > suma) {

            System.out.println("Ingrese el nuevo numero a sumar");
            num = leer.nextInt();
            suma += num;
        }
        System.out.println("La suma de todos los numeros da como resultado es " + suma);
    }
}
