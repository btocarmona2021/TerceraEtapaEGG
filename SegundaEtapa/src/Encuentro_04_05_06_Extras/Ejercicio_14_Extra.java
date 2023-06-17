//Se dispone de un conjunto de N familias, cada una de las cuales tiene una M
//cantidad de hijos. Escriba un programa que pida la cantidad de familias y para
//cada familia la cantidad de hijos para averiguar la media de edad de los hijos de
//todas las familias.
package Encuentro_04_05_06_Extras;

import java.util.Scanner;

public class Ejercicio_14_Extra {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de familias");
        int familias =leer.nextInt();
        int hijos;
        int sumaHijos=0;
        int edad=0;
        
        for (int i = 0; i < familias; i++) {
            System.out.println("Ingrese la cantidad de hijos que tiene la familia "+ (i+1));
            hijos=leer.nextInt();
            sumaHijos+=hijos;
            for (int j = 0; j < hijos; j++) {
                System.out.println("Escriba la edad del hijo "+ (j+1));
                edad+=leer.nextInt();
            }
        }
        
        System.out.println("Hay " + familias +" familias ,con un total de " + sumaHijos + " hijos,con un promedio de edad de " +
                edad/sumaHijos+" años");
     
    }
}
