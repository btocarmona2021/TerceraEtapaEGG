//Simular la división usando solamente restas. Dados dos números enteros mayores
//que uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo
//restas. Método: Restar el dividendo del divisor hasta obtener un resultado menor
//que el divisor, este resultado es el residuo, y el número de restas realizadas es el
//cociente. Por ejemplo: 50 / 13:  
//50 – 13 = 37  una resta realizada 
//37 – 13 = 24  dos restas realizadas  
//24 – 13 = 11  tres restas realizadas 
//dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.  
package Encuentro_04_05_06_Extras;

import java.util.Scanner;

public class Ejercicio_09_Extra {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un numero entero");
        int dividendo = leer.nextInt();
        System.out.println("Ingresa el segundo numero entero");
        int divisor = leer.nextInt();
        int restas=0;
       
        do {
            dividendo = dividendo - divisor;
            restas++;
        } while (dividendo > divisor);

        System.out.println("El residuo de la division es " + dividendo + " ,"
                + "y el cocientes es " + restas);        
    }
}
