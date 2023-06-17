//Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
//define su tipo de dato de tal manera que te permita alojar sus nombres más adelante. 
//       "Natalia";"Gabriel";"Pablo";"Anabella";"Eliana";"Juan";"Gonzalo";

package Ejercicios;

import java.util.Scanner;

public class Ejercicio_14 {

    public static void main(String[] args) {

        String[] equipo = new String[7];
        Scanner leer = new Scanner(System.in);
        
        for (int i = 0; i < equipo.length; i++) {
            System.out.println("Ingrese el nombre de su compañero");
            equipo[i]=leer.nextLine();
        }
        boolean primermensaje=false;

        for (int i = 0; i < equipo.length; i++) {
            if (primermensaje==false) {
                System.out.println("Los nombres de mis compañeros son los siguientes");
                System.out.println("================================================");
                primermensaje=true;
            }
            System.out.println("Integrante " + (i + 1) + " es: " + equipo[i]);
            
        }
        System.out.println("================================================");
    }
}
