//Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
//bucle y mostrar el mensaje "Se capturó el numero cero".  El programa deberá calcular y mostrar el
//resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
//Nota: recordar el uso de la sentencia break.  

package Ejercicios;

import java.util.Scanner;

public class Ejercicio_09 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int contador=1;
        int suma=0;
        int numero;
        do{
            System.out.println("Ingrese un numero");
            numero=leer.nextInt();
            
            if (numero != 0) {
               
                if (numero > 0) {
                    suma+=numero;
                }
                contador++;
            }else{
                System.out.println("Se Capturo el numero 0 " + " La suma de los numeros ingresados"
                        + " es "+ suma);
                break;
            }
            
        }while(contador <21);
        
        if (contador >= 20) {
            System.out.println("La suma de los 20 numeros ingresados es " + suma);
        }
    }
}
