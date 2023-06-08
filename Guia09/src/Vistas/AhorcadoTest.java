package Vistas;

import Entidades.Ahorcado;
import Servicios.AhorcadoService;
import java.util.Random;
       

public class AhorcadoTest {

    public static void main(String[] args) {
        String[] palabras = {"perro", "gato", "conejo", "ratón", "hamster", "erizo", "huron", "mapache", "zorro", "leon", "tigre", "oso", "cebra", "jirafa", "elefante", "rinoceronte", "hipopotamo", "ballena", "delfin", "tiburon", "loro","canario", "iguana", "tortuga", "gerbilo", "periquito", "gallina", "caballo", "oveja", "cerdo", "vaca", "pollo", "pavo", "pato", "conejo", "ardilla","iguana", "camaleón", "gecko", "serpiente", "lagarto", "tejón", "mapache","jaguar", "mono", "murciélago", "puercoespín", "armadillo", "canguro", "koala", "foca", "nutria", "castor", "orca", "pingüino", "avestruz", "tucán", "murciélago", "aguila", "buitre"};
        Random aleatorio = new Random();
        int indice = aleatorio.nextInt(0, palabras.length);
        AhorcadoService as = new AhorcadoService();
        Ahorcado ahorcado_01 = as.crearJuego(palabras[indice], (int)Math.round(palabras[indice].length() * 1.5));
        as.juego(ahorcado_01);
        
    }

}
