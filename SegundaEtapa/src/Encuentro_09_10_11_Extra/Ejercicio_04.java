package Encuentro_09_10_11_Extra;

import java.util.Scanner;

public class Ejercicio_04 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        double[] vec = new double[10];

        int aprobados = 0;
        int desaprobados = 0;
       
        
        for (int i = 0;i < vec.length;i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Ingresa la nota " + (j + 1) + " del alumno " + (i + 1));
                vec[i] += leer.nextDouble();
            }
            vec[i] = vec[i] / 4;
            System.out.print("El promedio del alumno " + (i + 1) + " es de " + (vec[i]));
            if (vec[i] >= 7) {
                aprobados++;
            } else {
                desaprobados++;
            }
            System.out.println(" ");
        }

        System.out.println();

        System.out.println("Aprobados: " + aprobados);
        System.out.println("Desaprobados: " + desaprobados);
    }
}
