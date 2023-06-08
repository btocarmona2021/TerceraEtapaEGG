package Vistas;

import Servicios.ArregloService;

public class ArregloServiceTest {

    public static void main(String[] args) {

        double[] A = new double[50];
        double[] B = new double[20];
        ArregloService.inicializarA(A);
        System.out.println("=====================MOSTRAR A======================");
        ArregloService.mostrar(A);
        System.out.println("=====================ORDENADO DE MAYOR A MENOR======================");
        ArregloService.ordenar(A);
        
        ArregloService.inicializarB(A, B);
        ArregloService.mostrarAyB(A, B);

    }

}
