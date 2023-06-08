package Servicios;

import Entidades.ParDeNumeros;

public class ParDeNumerosServicio {

    public static void mostrarValores(ParDeNumeros numeros) {
        System.out.println("Numero 01 = " + numeros.getNumero_01());
        System.out.println("Numero 02 = " + numeros.getNumero_02());
    }
    
    public static double devolverMayor(ParDeNumeros numeros){
       
        return Math.max(numeros.getNumero_01(), numeros.getNumero_02());
    }
    
    public static void calcularPotencia(ParDeNumeros numero){
        int num1=(int) Math.round(numero.getNumero_01());
        int num2=(int) Math.round(numero.getNumero_02());
        Math.min(num1, num2);
        if (num1>num2) {
            System.out.println("La potencia de " + num1 + " elevado a la " + num2 + " es = " + Math.pow(num1, num2));
        }else{
             System.out.println("La potencia de " + num2 + " elevado a la " + num1 + " es = " + Math.pow(num2, num1));
        }
    }
    
    public static void calcularRaiz(ParDeNumeros numero){
        int num1=(int) Math.abs(numero.getNumero_01());
        int num2=(int) Math.abs(numero.getNumero_02());
        
        if (num1>num2) {
            System.out.println("La raiz cuadrada del numero "+num2+" es = "+Math.sqrt(num2));
        }else{
            System.out.println("La raiz cuadrada del numero "+num1+" es = "+Math.sqrt(num1));
        }
        
    }
     

}
