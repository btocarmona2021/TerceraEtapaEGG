//Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a
//medida que el usuario las va ingresando, construya una “sopa de letras para niños”
//de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden
//horizontal en una fila que será seleccionada de manera aleatoria. Una vez
//concluida la ubicación de las palabras, rellene los espacios no utilizados con un
//número aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de letras
//creada.  
//Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes 
//funciones de Java substring(), Length() y Math.random().  
package Encuentro_09_10_11_Extra;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Ejercicio_06 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String[][] sopa = new String[20][20];
        ThreadLocalRandom aleatorio = ThreadLocalRandom.current();
        String palabra;
        int cantPalabras = 5;

        for (int i = 0; i < 5; i++) {
            int fila = aleatorio.nextInt(0, 20);
          
                System.out.println("Ingrese palabra");
                palabra = leer.nextLine();
                cantPalabras--;
             
            for (int j = 0; j < palabra.length(); j++) {
                sopa[fila][j] = palabra.substring(j, j + 1);
            }
        }

        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa.length; j++) {
                if (sopa[i][j] == null) {
                    sopa[i][j] = String.valueOf(aleatorio.nextInt(0, 9));
                }
            }
        }
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa.length; j++) {
                System.out.print("[" + sopa[i][j] + "]");
            }
            System.out.println("");
        }

    }

}
