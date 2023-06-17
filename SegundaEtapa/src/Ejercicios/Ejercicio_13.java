//Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
//define su tipo de dato de tal manera que te permita alojar sus nombres más adelante. 
package Ejercicios;

public class Ejercicio_13 {

    public static void main(String[] args) {

        String[] equipo = new String[7];
        equipo[0] = "Natalia";
        equipo[1] = "Gabriel";
        equipo[2] = "Pablo";
        equipo[3] = "Anabella";
        equipo[4] = "Eliana";
        equipo[5] = "Juan";
        equipo[6] = "Gonzalo";

        for (int i = 0; i < equipo.length; i++) {
            System.out.println("Integrante " + (i + 1) + " es: " + equipo[i]);
        }
    }
}
