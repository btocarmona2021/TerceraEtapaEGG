//Crear un programa que dibuje una escalera de números, donde cada línea de
//números comience en uno y termine en el número de la línea. Solicitar la altura de
//la escalera al usuario al comenzar. Ejemplo: si se ingresa el número 3:  
//1
//12
//123 
package Encuentro_04_05_06_Extras;

import java.util.Scanner;

public class Ejercicio_13_Extra {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la altura");
        int altura =leer.nextInt();
        String cadena="";
        
        for (int i = 0; i < altura; i++) {
           cadena=cadena +(i+1);
            System.out.print(cadena );
            System.out.println("");
        }
    }
}
