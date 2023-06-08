package Servicios;

import Entidades.Paises;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class PaisesServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearPaises(HashSet<Paises> paises) {
        String respuesta = "";
        do {
            System.out.println("Ingrese el nombre del país");
            paises.add(new Paises(leer.nextLine()));
            System.out.println("Desea agregar otro país S/N");
            respuesta = leer.nextLine();
        } while (respuesta.equalsIgnoreCase("S"));

    }

    public void mostrar(ArrayList<Paises> paises) {

        paises = new ArrayList(paises);
        paises.sort(Paises.comparaPaises);
        for (Paises paisesOrdenado : paises) {
            System.out.println(paisesOrdenado);
        }
    }
    
    public void eliminaPais(HashSet<Paises> paises,String paisABuscar){
        Iterator<Paises> it = paises.iterator();
        boolean eliminado=false;
        
        while (it.hasNext()) {  
            if (it.next().getNombre().equals(paisABuscar)) {
                it.remove();
                eliminado=true;
                break;
            }
        }
        
        if (eliminado) {
            System.out.println("Se elimino el pais " + paisABuscar);
        }else{
            System.out.println("No se encontro el pais " + paisABuscar);
        }
        for (Paises paise : paises) {
            System.out.println(paise);
        }
    }

}
