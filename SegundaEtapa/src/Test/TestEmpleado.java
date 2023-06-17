
package Test;

import Encuentro_13_14_15_16_17_18.Empleado;
import java.util.Scanner;

public class TestEmpleado {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese Nombre , edad , y salario");
        
        Empleado empleado01= new Empleado(leer.next(),leer.nextInt(),leer.nextInt());
        System.out.println("El salario debido a su edad se elevaria a " + empleado01.calcularAumento() + " pesos");
    }

}
