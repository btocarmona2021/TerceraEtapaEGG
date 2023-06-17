//Leer la altura de N personas y determinar el promedio de estaturas que se
//encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
package Encuentro_04_05_06_Extras;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

public class Ejercicio_06_Extra {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de personas");
        int cantidad = leer.nextInt();
        double[] alturas = new double[cantidad];
        double altura = 0;
        double promedioBajos = 0;
        double promedioGral = 0;
        double contadorBajos = 0;
        for (int i = 0; i < alturas.length; i++) {
            System.out.println("Ingrese la altura de la persona " + (+i + 1));
            altura = leer.nextDouble();
            alturas[i] = altura;
        }

        for (int i = 0; i < alturas.length; i++) {
            promedioGral += alturas[i];

            if (alturas[i] < 1.60) {
                promedioBajos += alturas[i];
                contadorBajos++;
            }
        }
        DecimalFormat formato = new DecimalFormat("#.##");

        System.out.println("El promedio general de medida de todas las personas es " + formato.format(promedioGral / cantidad));
        System.out.println("==========================================================");
        System.out.println("Y el promedio general de las personas con menos de 1.60 mts es "
                + (promedioBajos / contadorBajos));

    }
}
