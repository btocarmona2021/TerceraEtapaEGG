//Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre
//por pantalla

    package Encuentro_02_03;

import java.util.Scanner;

public class Ejercicio_02 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        String nombre=leer.nextLine();
        System.out.println("Tú nombre es = " + nombre);
    }
}
