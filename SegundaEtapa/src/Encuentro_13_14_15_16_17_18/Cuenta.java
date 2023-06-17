//Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
//Luego, crea un método "retirar_dinero" que permita retirar una cantidad
//de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea 
//negativo después de realizar una transacción de retiro

package Encuentro_13_14_15_16_17_18;

public class Cuenta {
    
    private double saldo=800;
    private String titular;

    public Cuenta() {
    }

    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public void retirarDinero(double dineroaRetirar){
        if (this.saldo>= dineroaRetirar) {
            this.saldo=this.saldo - dineroaRetirar;
        }else{
            System.out.println("El dinero a retirar es superior al saldo, ingrese un monto menor");
            
        }
        
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
}
