package Servicios;

import java.util.Arrays;
import java.util.Random;

public class ArregloService {

    public static void inicializarA(double[] A) {
        Random aleatorio = new Random();
        Arrays.setAll(A, i -> aleatorio.nextDouble(100));

    }

    public static void mostrar(double[] A) {
        System.out.println(Arrays.toString(A));
    }

    public static void ordenar(double[] A) {
        Arrays.sort(A);
        double[] AA = new double[A.length];
        for (int i = A.length - 1; i >= 0; i--) {
            AA[((A.length - 1) - i)] = A[i];
        }
        A = Arrays.copyOf(AA, AA.length);
        System.out.println(Arrays.toString(A));
    }

    public static void inicializarB(double[] A, double[] B) {
        System.arraycopy(A, 0, B, 0, 10);
         Arrays.fill(B, 10, B.length, 0.5);
    }

    public static void mostrarAyB(double[] A, double[] B) {
        System.out.println("==============ARREGLO A==============");
        System.out.println(Arrays.toString(A));
        System.out.println("==============ARREGLO B==============");
        System.out.println(Arrays.toString(B));
    }

}
