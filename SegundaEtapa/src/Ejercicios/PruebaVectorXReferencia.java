//Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
//define su tipo de dato de tal manera que te permita alojar sus nombres más adelante. 
//       "Natalia";"Gabriel";"Pablo";"Anabella";"Eliana";"Juan";"Gonzalo";

package Ejercicios;


import java.util.Scanner;

public class PruebaVectorXReferencia {

    public static void main(String[] args) {

        String[] equipo = new String[7];
        Scanner leer = new Scanner(System.in);
        llenaMatriz(equipo, leer);
        for (int i = 0; i < equipo.length; i++) {
             System.out.println("Integrante " + (i + 1) + " es: " + equipo[i]);
        }
    }
    
    public static void llenaMatriz (String[] equipo,Scanner leer){
        
        for (int i = 0; i < equipo.length; i++) {
             System.out.println("Ingrese el nombre de su compañero");
            equipo[i]=leer.nextLine();
        }
        
    }
}
