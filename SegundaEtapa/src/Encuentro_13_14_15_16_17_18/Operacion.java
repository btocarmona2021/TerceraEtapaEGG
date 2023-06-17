//Crear una clase llamada Operacion que tenga como atributos privados numero1 y 
//numero2. A continuación, se deben crear los siguientes métodos:
//
//a) Método constructor con todos los atributos pasados por parámetro.
//b) Metodo constructor sin los atributos pasados por parámetro.
//c) Métodos get y set.
//d) Método para crearOperacion(): que le pide al usuario los dos números y los
//guarda en los atributos del objeto. 
// 
//e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
//f) Método restar(): calcular la resta de los números y devolver el resultado al main
//g) Método dividir(): primero valida que no se haga una multiplicación por cero,
//si fuera a dividir por cero, el método devuelve 0 y se le informa al usuario el
//error. Si no, se hace la multiplicación y se devuelve el resultado al main
//h) Método dividir(): primero valida que no se haga una división por cero, si fuera a
//pasar una división por cero, el método devuelve 0 y se le informa al usuario el
//error se le informa al usuario. Si no, se hace la división y se devuelve el resultado
//al main.
package Encuentro_13_14_15_16_17_18;

public class Operacion {

    private int numero01;
    private int numero02;

    public Operacion(){
        
    }
    
    public Operacion(int numero01, int numero02) {
        this.numero01 = numero01;
        this.numero02 = numero02;
    }
    
    //METODO CREAR OPERACION
    public void crearOperacion (int numero01 , int numero02){
        this.numero01=numero01;
        this.numero02=numero02;
    }
    //METODO SUMAR
    public int sumar(int numero01,int numero02){
        int suma=numero01+numero02;
        return suma;
    }
    //METODO RESTAR
    public int restar(int numero01,int numero02){
        int restar = numero01 - numero02;
        return restar;
    }
    //METODO dividir
    public double multiplicar(double numero01,double numero02){
        double multiplicar = numero01 * numero02;
        
        return multiplicar;
    }
     //METODO dividir
    public double dividir(double numero01,double numero02){
        if (numero02==0) {
            System.out.println("No se puede dividir por 0");
            return 0;
        }else{
            double dividir = numero01 / numero02;
        
        return dividir;
        }
    }
    
    
    
    public void setNumero01 (int numero01){
        this.numero01=numero01;
    }
    public int getNumero01 (){
        return this.numero01;
    }

    public int getNumero02() {
        return numero02;
    }

    public void setNumero02(int numero02) {
        this.numero02 = numero02;
    }
    
    
}
