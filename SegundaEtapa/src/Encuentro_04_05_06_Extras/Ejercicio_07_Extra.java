//Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el
//promedio de n números (n>0). El valor de n se solicitará al principio del programa y
//los números serán introducidos por el usuario. Realice dos versiones del programa,
//una usando el bucle “while” y otra con el bucle “do - while”
package Encuentro_04_05_06_Extras;

import java.util.Scanner;

public class Ejercicio_07_Extra {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de numeros a promediar");
        int cantidad = leer.nextInt();
        int contador = 0;
        int[] numeros = new int[cantidad];
        int max = 0;
        int min = 0;
        int promedio = 0;
//        while (contador < cantidad) {
//            System.out.println("Ingrese el número"
//                    + "" + contador +1);
//            numeros[contador] = leer.nextInt();
//            contador++;
//        }

        do {
            System.out.println("Ingrese el número"
                    + "" + contador + 1);
            numeros[contador] = leer.nextInt();
            contador++;
            
        } while (contador < cantidad);

        for (int i = 0; i < numeros.length; i++) {
            promedio += numeros[i];
            if (max == 0) {
                max = numeros[i];
                min = numeros[i];
            }
            if (max < numeros[i]) {
                max = numeros[i];
            }
            if (min > numeros[i]) {
                min = numeros[i];
            }
        }
        System.out.println("El numero mas chico es " + min + " , el mayor es " + max
                + " ,y el promedio de los " + cantidad + " números es " + (promedio / cantidad));

    }
}
