package Vistas;

import Entidades.Curso;
import Servicios.CursoServicios;

public class CursoTest {

    public static void main(String[] args) {

        CursoServicios cs = new CursoServicios();

        Curso curso01 = cs.crearCurso("2do Grado", 4, 4, 'M', 200, 5);
        Curso curso02 = cs.crearCurso("5to Grado", 5, 5, 'T', 240, 3);
     
        System.out.println("==========CURSO 01 =============");
        System.out.println(curso01.toString());
        System.out.println("");
        System.out.println("==========CURSO 02 =============");
        System.out.println(curso02.toString());
        System.out.println("");
        System.out.println("==========GANANCIAS CURSO 01 ===========");
        System.out.println("El monto de la ganancia semanal del curso " + curso01.getNombreCurso() + " es = " + cs.calcularGananciaSemanal(curso01) + " pesos");
        System.out.println("");
        System.out.println("==========GANANCIAS CURSO 02 ===========");
        System.out.println("El monto de la ganancia semanal del curso " + curso02.getNombreCurso() + " es = " + cs.calcularGananciaSemanal(curso02) + " pesos");
    }

}
