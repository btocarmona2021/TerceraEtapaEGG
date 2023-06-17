//Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
//solicite números al usuario hasta que la suma de los números introducidos supere el
//límite inicial.
package Encuentro_04_05_06;

import java.util.Scanner;

public class Ejercicio_06 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int opcion;
        double num1=0;
        double num2=0;
        String respuesta="";
        OUTER:
        do {
            System.out.println("Elija una Opción");
            System.out.println("=======================");
            System.out.println("'1' para sumar");
            System.out.println("'2' para restar");
            System.out.println("'3' para multiplicar");
            System.out.println("'4' para dividir");
            System.out.println("'5' Salir");
            System.out.println("=======================");
            opcion = leer.nextInt();
            if (opcion <5) {
                System.out.println("Ingrese el primer valor");
                num1 = leer.nextDouble();
                System.out.println("Ingrese el segundo valor para realizar la operacion");
                num2 = leer.nextDouble();
            }
            switch (opcion) {
                case 1:
                    System.out.println("La suma da como resultado " + Math.round(num1 + num2));
                    break;
                case 2:
                    System.out.println("La resta da como resultado " + Math.round(num1 - num2));
                    break;
                case 3:
                    System.out.println("La multiplicación da como resultado " + Math.round(num1 * num2));
                    break;
                case 4:
                    System.out.println("La división da como resultado " + Math.round(num1 / num2));
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                  
                    respuesta=leer.next().toUpperCase();
                    
                    
                default:
                    System.out.println("saliendo del programa");
                    break;
            }
        } while (!respuesta.equals("S"));

    }
}
