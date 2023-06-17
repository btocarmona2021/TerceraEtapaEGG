//Una obra social tiene tres clases de socios:  

//Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
//descuento en todos los tipos de tratamientos.

//Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
//descuento para los mismos tratamientos que los socios del tipo A.  
//Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre
//dichos tratamientos.  
//Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real
//que represente el costo del tratamiento (previo al descuento) y determine el importe
//en efectivo a pagar por dicho socio.
package Encuentro_04_05_06_Extras;

import java.util.Scanner;

public class Ejercicio_05_Extra {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el tipo de Socio");
        System.out.println("A) TIPO A");
        System.out.println("B) TIPO B");
        System.out.println("C) TIPO C");
        String tipo = leer.nextLine().toUpperCase();
        System.out.println("Ahora ingresá el valor del costo de tratamiento");
        double costo= leer.nextDouble();
        
        switch (tipo) {
            case "A":System.out.println("El costo de tratamiento es de "+ (costo - (costo *0.50)));
                break;
            case "B":System.out.println("El costo de tratamiento es de "+ (costo - (costo *0.35)));
                break;
            case "C":System.out.println("El costo de tratamiento es de "+ costo);
                break;
            default:
            
        }
    }
}
