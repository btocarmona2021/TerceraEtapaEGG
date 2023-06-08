package Vistas;

import Entidades.Cadena;
import Entidades.Utilidad;
import Servicios.CadenaServicio;
import java.util.Arrays;

public class CadenaTest {

    public static void main(String[] args) {
       

        CadenaServicio cs = new CadenaServicio();
        Cadena cadena01 = new Cadena("Que tengas un lindo dia");
        cs.reemplazarA(cadena01);
        System.out.println("La cadena contiene " + cs.cantVocales(cadena01) + " Vocales");
        System.out.println("La frase invertida quedaria de la siguiente manera ");
        cs.invertirFrase(cadena01);
       
        System.out.println("Ingrese una letra a buscar");
      
        String letraBuscada = Utilidad.leer().nextLine();
        
        System.out.println("La letra buscada se encuentra " + cs.vecesRepetido (cadena01, letraBuscada) + " veces");
        
        Arrays.sort(cs.generarnumero());
        System.out.println(Arrays.toString(cs.generarnumero()));
        
      
        
        
        
        System.out.println("Ingrese una frase a comparar");
        String frase = Utilidad.leer().nextLine();
        if (cs.compararFrase(cadena01, frase)) {
            System.out.println("Las frases son iguales");
        } else {
            System.out.println("Las frases son distintas");
        }
        System.out.println("Ingrese una frase a unir");
        String frase2 = Utilidad.leer().nextLine();
        System.out.println("La frase a unida es " + cs.unirFrases(cadena01, frase2));
        cs.reemplazarA(cadena01);
        System.out.println("Ingrese una letra para verificar si la frase la contiene");
        letraBuscada = Utilidad.leer().nextLine();
        System.out.println(cs.contieneletra(cadena01, letraBuscada));
    }

}
