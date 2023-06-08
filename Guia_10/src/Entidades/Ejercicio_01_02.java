package Entidades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Ejercicio_01_02 {

    public static void main(String[] args) {
        
        
        
        
        
        ArrayList<Integer> numerosA = new ArrayList();
        //CREO 5 ELEMENTOS DE TIPO PRIMITIVO INT
        int x = 20;
        int a = 5, b = 10, c = 15, d = 25, e = 30;
        Integer z=99;
        
        //AGREGO LOS ELEMENTOS AL ARRAYLIST
        numerosA.add(x);
        numerosA.add(a);
        numerosA.add(b);
        numerosA.add(c);
        numerosA.add(d);
        numerosA.add(e);
        //ELIMINO EL ELEMENTO PASANDOLE COMO PARAMETRO SU INDICE
        numerosA.remove(1);
        //TAMBIEN ELIMINO UN ELEMENTO PASANDO EL VALOR DEL OBJETO
        numerosA.remove(Integer.valueOf(25));
        //ELIMINO UN ELEMENTO PASANDO EL OBJETO
        numerosA.remove(z);
        
        //MUESTRO EL ARRAYLIST NUMEROSA
        System.out.println("Con metodo toString "+numerosA.toString());
        
        //CREO UNA INSTANCIA DEL ITERADOR
        Iterator iterador = numerosA.iterator();
        //CREO UN BUCLE WHILE DONDE EL ITERADOR SE DETENDRA CUANDO NO ENCUENTRO UN ELEMENTO POSTERIOR
        while (iterador.hasNext()) {
            System.out.println("Con Iterador "+iterador.next());
        }
        //TAMBIEN PUEDO RECORRER UN ARRAYLIST CON UN FOR EACH
        for (Integer numeros : numerosA) {
            System.out.println("con For each "+ numeros);
        }
        //ADEMAS PUEDO RECORRERLO CON UN FOR CONVENCIONAL
        for (int i = 0; i < numerosA.size(); i++) {
            System.out.println("Con for convencional "+numerosA.get(i));
        }
        

        HashSet<Integer> numerosB = new HashSet<>();
        int y = 20;
        int o = 50, p = 65, q = 70, r = 85, s = 90;
        numerosB.add(y);
        numerosB.add(o);
        numerosB.add(p);
        numerosB.add(q);
        numerosB.add(r);
        numerosB.add(s);

        numerosB.remove(85);
        //  RECORRO EL HASHSET CON UN FOR EACH E IMPRIMO SUS VALORES
        for (Integer numB : numerosB) {
            System.out.println("Los numeros son " + numB);
        }
        

        HashMap<String, Integer> alumnos = new HashMap<>();
        String nombre = "Santiago";
        String nombre2 = "Enrique";
        String nombre3 = "Gonzalo";
        String nombre4 = "Agustin";
        String nombre5 = "Daniela";
        String nombre6 = "Franco";

        int edad = 15;
        int edad1 = 16;
        int edad2 = 17;
        int edad3 = 18;
        int edad4 = 19;
        int edad5 = 20;

        alumnos.put(nombre, edad);
        alumnos.put(nombre2, edad1);
        alumnos.put(nombre3, edad2);
        alumnos.put(nombre4, edad3);
        alumnos.put(nombre5, edad4);
        alumnos.put(nombre6, edad5);
        alumnos.remove("Enrique");
        alumnos.remove("Franco");

        for (String nombres : alumnos.keySet()) {
            System.out.println("Nombres " + nombres);
        }
        for (Integer edades : alumnos.values()) {
            System.out.println("Edades " + edades);
        }
        alumnos.remove("Santiago");
        for (String nombres : alumnos.keySet()) {
            System.out.println("Nombres " + nombres);
        }
        for (Integer edades : alumnos.values()) {
            System.out.println("Edades " + edades);
        }

        //DETECCION DE ERRORES 2
        HashMap<Integer, String> personas = new HashMap();
        String n1 = "Albus";
        String n2 = "Severus";
        int n3 = 5, n4 = 10;
        personas.put(n3, n2);
        personas.put(n4, n2);

    }

}
