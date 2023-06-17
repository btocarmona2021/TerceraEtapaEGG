//Crear una función rellene un vector con números aleatorios,
//pasándole un arreglo por parámetro. Después haremos otra 
//función o procedimiento que imprima el vector.
package Encuentro_09_10_11_Extra;

public class Ejercicio_03 {

    public static void main(String[] args) {

        int[] vec = new int[4];
        rellenarVector(vec);
        mostrarVector(vec);
    }

    public static void rellenarVector(int[] vec) {
        for (int i = 0; i < vec.length; i++) {
            vec[i] = (int) (Math.random() * 100);
        }
    }

    public static void mostrarVector(int[] vec) {
        for (int i = 0; i < vec.length; i++) {
            System.out.print("[" + vec[i] + "]");
        }
    }
}
