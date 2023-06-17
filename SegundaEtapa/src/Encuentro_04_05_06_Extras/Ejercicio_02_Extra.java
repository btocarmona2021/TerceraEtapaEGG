//Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a
//cada una. A continuación, realizar las instrucciones necesarias para que: B tome el 
//valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B.
//Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una
//variable auxiliar
package Encuentro_04_05_06_Extras;

public class Ejercicio_02_Extra {

    public static void main(String[] args) {
        int a = 5;
        int b = 12;
        int c = 24;
        int d = 44;
        metodo(a, b, c, d);
    }

    public static void metodo(int a, int b, int c, int d) {
        System.out.println("a =" + a);
        System.out.println("b =" + b);
        System.out.println("c =" + c);
        System.out.println("d =" + d);
        System.out.println("============");
        int aux = b;
        b = c;
        c = a;
        a = d;
        d = aux;
        System.out.println("a =" + a);
        System.out.println("b =" + b);
        System.out.println("c =" + c);
        System.out.println("d =" + d);

    }
}
