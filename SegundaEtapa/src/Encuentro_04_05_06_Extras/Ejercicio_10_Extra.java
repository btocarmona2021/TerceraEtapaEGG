//Realice un programa para que el usuario adivine el resultado de una multiplicación
//entre dos números generados aleatoriamente entre 0 y 10. El programa debe
//indicar al usuario si su respuesta es o no correcta. En caso que la respuesta sea
//incorrecta se debe permitir al usuario ingresar su respuesta nuevamente. Para
//realizar este ejercicio investigue como utilizar la función Math.random() de Java.
package Encuentro_04_05_06_Extras;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Ejercicio_10_Extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ThreadLocalRandom aleatorio = ThreadLocalRandom.current();
        int numero01 = aleatorio.nextInt(0, 10);
        int numero02 = aleatorio.nextInt(0, 10);
        int resultado = numero01 * numero02;
        System.out.println("resultado = " + resultado);
        int adivina;
        
        
        do {
            System.out.println("Ingrese el resultado a adivinar");
            adivina = leer.nextInt();
            if (adivina == resultado) {
                System.out.println("Genial , ADIVINASTE! los numeros multiplicados fueron "+ numero01 + " y " + 
                        numero02);
            }

        } while (adivina != resultado);

    }
}
