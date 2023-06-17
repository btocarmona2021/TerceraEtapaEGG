//Dada una cantidad de grados centígrados se debe mostrar su equivalente en
//grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5)

    package Encuentro_02_03;

import java.util.Scanner;

public class Ejercicio_04 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa La temperatura en Celcius");
        double celcius=leer .nextDouble();
        conversion(celcius);
    }
    public static void conversion (double celsius){
        System.out.println("La temperatura en Celsius es " + (((celsius *9)/5)+32));
    }
    
}
