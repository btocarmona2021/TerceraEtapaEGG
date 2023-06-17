//Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
//equivalente en romano. 
//¿No te acordás los números romanos? Consultalos acá. 
package Encuentro_04_05_06_Extras;

import java.util.Scanner;

public class Ejercicio_04_Extra {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un numero entres 1 y 10");
        int num = leer.nextInt();

        while (num < 1 || num > 10) {
            System.out.println("Ingresa nuevamente el numero");
            num = leer.nextInt();
        }
         switch (num) {
                case 1:System.out.println("Su equivalente es I");
                    break;
                case 2:System.out.println("Su equivalente es II");
                    break;
                case 3:System.out.println("Su equivalente es III");
                    break;
                case 4:System.out.println("Su equivalente es IV");
                    break;
                case 5:System.out.println("Su equivalente es V");
                    break;
                case 6:System.out.println("Su equivalente es VI");
                    break;
                case 7:System.out.println("Su equivalente es VII");
                    break;
                case 8:System.out.println("Su equivalente es VIII");
                    break;
                case 9:System.out.println("Su equivalente es IX");
                    break;

                default:

            }

    }
}
