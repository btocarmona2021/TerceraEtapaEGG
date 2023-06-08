package Entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class Ejemplo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        HashSet<String> nombres = new HashSet();
        nombres.add("Andres");
        nombres.add("Analia");
        nombres.add("Juan");
        nombres.add("Daniel");
        nombres.add("Nicolas");
        nombres.add("Facundo");
        System.out.println(Alumno.convertiraArray(nombres));

        System.out.println("======================");
        ArrayList<String> temp = Alumno.convertiraArray(nombres);

        System.out.println(temp);

        temp.remove(2);

        System.out.println(temp);

//        ArrayList<String> nuevoarray = new ArrayList(nombres);
//        nuevoarray.remove(1);
//        System.out.println(nuevoarray);
//        
//        Collections.sort(nuevoarray, Alumno.ordenarAlf);
//        
    }
    public static Comparator<String> ordenarAlf = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {

            return o1.compareTo(o2);
        }
    };

}
