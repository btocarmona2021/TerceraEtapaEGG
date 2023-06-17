//Escribir un programa que lea un número entero y devuelva el número de dígitos
//que componen ese número. Por ejemplo, si introducimos el número 12345, el
//programa deberá devolver 5. Calcular la cantidad de dígitos matemáticamente
//utilizando el operador de división. Nota: recordar que las variables de tipo entero
//truncan los números o resultados.
package Encuentro_04_05_06_Extras;

import java.util.Scanner;

public class Ejercicio_11_Extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero te diré cuantos digitos tiene");
        int numero = leer.nextInt();
        int digitos = 1;
        while (numero > 10) {
            numero = numero / 10;
            digitos++;
        }
        System.out.println("El numero ingresado tiene " + digitos + " digitos");

    }
}
