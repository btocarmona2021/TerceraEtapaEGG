package Vistas;

import Entidades.ParDeNumeros;
import Servicios.ParDeNumerosServicio;


public class ParDeNumerosTest {
    public static void main(String[] args) {
        
    
        ParDeNumeros p1= new ParDeNumeros();
        
        ParDeNumerosServicio.mostrarValores(p1);
        ParDeNumerosServicio.devolverMayor(p1);
        ParDeNumerosServicio.calcularPotencia(p1);
        ParDeNumerosServicio.calcularRaiz(p1);
                
    }

}
