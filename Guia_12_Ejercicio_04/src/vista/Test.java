package vista;

import entidad.Circulo;
import entidad.Rectangulo;

public class Test {

    public static void main(String[] args) {

        Circulo circ_01 = new Circulo();
        Rectangulo rect_01 = new Rectangulo();

        System.out.println("circ_01 - Area = " + circ_01.calculaArea(0, 10));
        System.out.println("circ_01 - Perimetro = " + circ_01.calculaPerimetro(0, 10));
        System.out.println("rect_01 - Area = " + rect_01.calculaArea(5, 6));
        System.out.println("rect_01 - Perimetro = " + rect_01.calculaPerimetro(5, 6));

    }

}
