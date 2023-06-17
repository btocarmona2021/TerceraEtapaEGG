//Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se
//pedirá de nuevo hasta que la nota sea correcta.  
package Ejercicios;

import java.util.Scanner;

public class Ejercicio_08 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese una nota");
        int nota = leer.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("La nota ingresada es menor a 0 ó mayor a 10 por favor ingrese otra");
            nota = leer.nextInt();
        }

        if (nota > 0 && nota <= 10) {
            System.out.println("La nota ingresada es " + nota + " correcto!");
        }

    }
}
