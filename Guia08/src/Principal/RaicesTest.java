package Principal;

import Entidades.Raices;
import Servicios.RaicesServicio;

public class RaicesTest {

    public static void main(String[] args) {
        RaicesServicio rs = new RaicesServicio();
        Raices raiz = new Raices(9, 27, 5);
        rs.getDiscriminante(raiz);
        rs.tieneRaices(raiz);
        rs.tieneRaiz(raiz);
        rs.obtenerRaices(raiz);
        rs.obtenerRaiz(raiz);
        rs.calcular(raiz);
        
         String caracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
        
        char[] caracterNif =caracteres.toCharArray();
        
        for (int i = 0; i < caracterNif.length; i++) {
            System.out.println(caracterNif[i]);
        }

    }

}
