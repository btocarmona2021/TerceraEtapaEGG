package Vistas;

import Entidades.Paises;
import Servicios.PaisesServicios;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class PaisesTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        PaisesServicios ps = new PaisesServicios();
        
        HashSet<Paises> paises = new HashSet();
        
        ps.crearPaises(paises);
        ArrayList<Paises> paisesOrdenados = new ArrayList(paises);
        
        paisesOrdenados.sort(Paises.comparaPaises);
        ps.mostrar(paisesOrdenados);
        System.out.println("Ingrese un pais a buscar y eliminar");
       ps.eliminaPais(paises,leer.nextLine());
       
       

    }

}
