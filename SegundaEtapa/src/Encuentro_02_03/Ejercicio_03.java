//Escribir un programa que pida una frase y la muestre toda en mayúsculas y
//después toda en minúsculas. Nota: investigar la función toUpperCase() y
//toLowerCase() en Java.

    package Encuentro_02_03;

import java.util.Scanner;

public class Ejercicio_03 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa una frase");
        String frase=leer .nextLine();
        convertir(frase);
    }
    public static void convertir(String frase){
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
    }
}
