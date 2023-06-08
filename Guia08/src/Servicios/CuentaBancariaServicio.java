package Servicios;

import Entidades.CuentaBancaria;

public class CuentaBancariaServicio {

    public CuentaBancaria crearCuenta(int numeroCuenta, long dni, double saldoActual) {
        return new CuentaBancaria(numeroCuenta, dni, saldoActual);
    }

    public void ingresar(double ingresarDinero, CuentaBancaria cuentaBancaria) {
        cuentaBancaria.setSaldoActual(cuentaBancaria.getSaldoActual() + ingresarDinero);
        System.out.println("Se ha ingresado " + ingresarDinero + " pesos a su cuenta");
        consultarSaldo(cuentaBancaria);
    }

    public void retirarDinero(double dineroaRetirar, CuentaBancaria cuentaBancaria) {
        cuentaBancaria.setSaldoActual(cuentaBancaria.getSaldoActual() - dineroaRetirar);
        System.out.println("Se ha retirado " + dineroaRetirar + " pesos de su cuenta");
        consultarSaldo(cuentaBancaria);
    }

    public void extraccionRapida(double dineroaRetirar, CuentaBancaria cuentaBancaria) {
        if (dineroaRetirar <= cuentaBancaria.getSaldoActual() * 0.20) {
            System.out.println("Se ha retirado el "+ (dineroaRetirar /cuentaBancaria.getSaldoActual()*100) +" % de su saldo");
            cuentaBancaria.setSaldoActual(cuentaBancaria.getSaldoActual() - dineroaRetirar);
        } else{
            System.out.println("El monto ingresado es superior al 20 %");
        }
        consultarSaldo(cuentaBancaria);

    }

    public void consultarSaldo(CuentaBancaria cuentabancaria) {
        System.out.println("Su saldo actual es de " + cuentabancaria.getSaldoActual() + " pesos");
    }

    public void consultarDatos(CuentaBancaria cuentaBancaria) {
        System.out.println("Numero de Cuenta = " + cuentaBancaria.getNumeroCuenta());
        System.out.println("DNI del titular = " + cuentaBancaria.getDniCliente());
        System.out.println("Saldo Actual = " + cuentaBancaria.getSaldoActual());

    }

}
