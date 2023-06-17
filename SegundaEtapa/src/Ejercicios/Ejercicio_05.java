//Define una variable de tipo boolean, double y char. Guarda información en ellas a través del
//Scanner
package Ejercicios;

import java.util.Scanner;

public class Ejercicio_05 {

    public static void main(String[] args) {
        int numero_01;
        double estado;
        char letra;

        Scanner leer = new Scanner(System.in);
        numero_01=leer.nextInt();
        System.out.println("leer = " + numero_01);
        
        estado=leer.nextDouble(); 
        System.out.println("leer = " + estado);
        
        letra= leer.next().charAt(0);
        System.out.println("leer = " + letra);

    }

}
