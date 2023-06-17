//Escribir un programa que lea un número entero por teclado y muestre por pantalla
//el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
//Math.sqrt().

    package Encuentro_02_03;

import java.util.Scanner;

public class Ejercicio_05 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa La temperatura en Celcius");
        int num1=leer .nextInt();
        dTr(num1);
    }
    public static void dTr(int num1){
        System.out.println("El doble del número es "+num1 *2);
        System.out.println("El triple del numero es "+ num1 *3);
        System.out.println("Y la Raiz cuadrada del numero es " + Math.sqrt(num1));
    }
}
