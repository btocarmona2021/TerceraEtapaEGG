
package Test;

import Encuentro_13_14_15_16_17_18.Cuenta;
import java.util.Scanner;

public class TestCuenta {

    
    public static void main(String[] args) {
        Cuenta cuenta01 = new Cuenta();
        Scanner leer = new Scanner(System.in);
        while (cuenta01.getSaldo()>0) {            
            System.out.println("Ingrese el monto a retirar");
            cuenta01.retirarDinero(leer.nextDouble());
            System.out.println("Su saldo es " + cuenta01.getSaldo());
            
        }
    }

}
