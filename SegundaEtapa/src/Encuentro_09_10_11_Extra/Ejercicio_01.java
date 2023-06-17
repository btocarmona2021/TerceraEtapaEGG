//Realizar un algoritmo que calcule la suma de todos los elementos
//de un vector de tamaño N, con los valores ingresados por el usuario.


package Encuentro_09_10_11_Extra;

import java.util.Scanner;

public class Ejercicio_01 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor del vector");
        int n =leer.nextInt();
        int suma=0;
        int [] vector = new int[n];
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Por favor ingrese el numero "+ (i+1));
            vector[i]=leer.nextInt();
            suma=suma + vector[i];
        }
        System.out.println("La suma de los indices es " + suma);
    }

}
