//Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si
//el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2
//horas.
package Encuentro_04_05_06_Extras;

import java.util.Scanner;

public class Ejercicio_01_Extra {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una cierta cantidad de minutos");
        int minutos = leer.nextInt();
        metodo(minutos);
    }

    public static void metodo(int minutos) {
        int dias = minutos / 1440;
        System.out.println("dias = " + dias);
        int horas = (minutos %1440)/60;
        System.out.println("Horas = " + horas);
        int min =(minutos %1440)%60;
        System.out.println("min = " + min);
    }
}
