
package Principal;

import Entidades.CuentaBancaria;
import Servicios.CuentaBancariaServicio;
import java.util.Scanner;

public class CuentaBancariaTest {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
      CuentaBancariaServicio cbs = new CuentaBancariaServicio();
      CuentaBancaria[] cuentas = new CuentaBancaria[2];
    
        for (int i = 0; i < cuentas.length; i++) {
            System.out.println("Ingrese numero de cuenta");
            int numCuenta=leer.nextInt();
            System.out.println("Ingrese numero de cliente");
            int numCliente=leer.nextInt();
            System.out.println("Ingrese un saldo");
            double saldo=leer.nextDouble();
                cuentas[i]= new CuentaBancaria(numCuenta, numCliente,saldo);
        }
        
        for (int i = 0; i < cuentas.length; i++) {
            System.out.println(cuentas[i].toString());
        }
       
    }

}
