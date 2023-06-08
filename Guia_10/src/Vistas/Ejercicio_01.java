//Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
//programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
//después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
//salir, se mostrará todos los perros guardados en el ArrayList.
//====================================================================//
//Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
//un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
//está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
//ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
//la lista ordenada.
package Vistas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio_01 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ArrayList<String> razas = new ArrayList();
        String respuesta = "";
        while (respuesta.equalsIgnoreCase("S") || respuesta.equals("")) {
            System.out.println("Ingrese un nombre de raza de perro");
            razas.add(leer.nextLine());
            System.out.println("Si desea guardar otra raza responda S, si quiere salir responda N");
            respuesta = leer.nextLine();
        }
        for (String raza : razas) {
            System.out.println("Las razas ingresadas son " + raza);
        }
        System.out.println("==============Ejercicio 02==============");
        Iterator it = razas.iterator();
        System.out.println("Ingrese una raza de perro a eliminar");
        String perroAEliminar = leer.nextLine();

        while (it.hasNext()) {
            if (it.next().equals(perroAEliminar)) {
                it.remove();
                break;
            } else {
                System.out.println("La raza de perro que intenta eliminar"
                        + " no se encuentra en la lista");
            }
        }
        System.out.println("============================");
        for (String raza : razas) {
            System.out.println("Las razas que aun se encuentran en la lista es " + raza);
        }

    }

}
