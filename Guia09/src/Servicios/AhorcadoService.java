package Servicios;

import Entidades.Ahorcado;
import Entidades.Utilidad;

public class AhorcadoService {

    public Ahorcado crearJuego(String palabra, int cantMax) {

        String[] palabrabuscada = new String[palabra.length()];
        for (int i = 0; i < palabrabuscada.length; i++) {
            palabrabuscada[i] = palabra.substring(i, i + 1);

        }
        return new Ahorcado(palabrabuscada, cantMax);
    }

    public void longitud(Ahorcado ahorcado) {

        System.out.println("La palabra tiene " + ahorcado.getPalabraABuscar().length + " letras");

    }

    public void buscarLetra(Ahorcado ahorcado) {
        System.out.println("Ingrese una letra");
        String letra = Utilidad.leer().nextLine();
        for (int i = 0; i < ahorcado.getPalabraABuscar().length; i++) {
            int cont = 0;
            if (ahorcado.getPalabraABuscar()[i].equalsIgnoreCase(letra)) {
                System.out.println("La letra (" + letra + ") es parte de la palabra en la posicion " + (i + 1));
            } else {
                cont++;
            }
            if (cont == ahorcado.getPalabraABuscar().length) {
                System.out.println("Lo siento la letra " + letra + " no se encuentra en la palabra "
                        + "intente con otra");
            }
        }
        encontradas(ahorcado, letra);
    }
    String nuevafrase = "";
    int encontraste = 0;

    public void encontradas(Ahorcado ahorcado, String letra) {
        boolean estaba = false;
        if (nuevafrase.equalsIgnoreCase("")) {
            for (int i = 0; i < ahorcado.getPalabraABuscar().length; i++) {
                nuevafrase = nuevafrase.concat("_");
            }
        }
        StringBuilder sb = new StringBuilder(nuevafrase);

        for (int i = 0; i < ahorcado.getPalabraABuscar().length; i++) {
            if (ahorcado.getPalabraABuscar()[i].equalsIgnoreCase(letra)) {
                encontraste++;
                estaba = true;
                sb.replace(i, i + 1, letra);
            }
        }
        System.out.println(sb);
        nuevafrase = sb.toString();
        if (encontraste == ahorcado.getPalabraABuscar().length) {
            System.out.println("Perfecto ! has encontrado (" + encontraste + ") de [" + ahorcado.getPalabraABuscar().length + "] Letras,"
                    + " hasta el momento ");
            System.out.println("Felicitaciones! has adivinado, la palabra era " + nuevafrase);
            ahorcado.setCantMax(-1);
        } else {
            System.out.println("has encontrado (" + encontraste + ") de [" + ahorcado.getPalabraABuscar().length + "] Letras,"
                    + " hasta el momento ");
        }
        if (estaba == true && ahorcado.getCantMax() > 0) {
            System.out.println("Le quedan " + ahorcado.getCantMax() + " intentos");
        } else if (estaba == true && ahorcado.getCantMax() < 0) {
            System.out.println("Lo has conseguido");
        } else {
            ahorcado.setCantMax(ahorcado.getCantMax() - 1);
            System.out.println("Le quedan " + ahorcado.getCantMax() + " intentos");
        }
    }
// <editor-fold desc="Anterior modo">
//    public void intentos(Ahorcado ahorcado) {
//        if (encontradas(ahorcado, nuevafrase)==true) {
//            System.out.println("Le quedan " + ahorcado.getCantMax() + " intentos");
//        }else{
//             System.out.println("Le quedan " + ahorcado.getCantMax() + " intentos");
//        ahorcado.setCantMax(ahorcado.getCantMax() - 1);
//        }
//       
//
//    }
// </editor-fold>
    
    public void juego(Ahorcado ahorcado) {
        System.out.println("Comienza el juego usted tiene " + ahorcado.getCantMax() + " intentos");
        while (ahorcado.getCantMax() > 0) {
//            intentos(ahorcado);
            longitud(ahorcado);
            buscarLetra(ahorcado);

        }
        if (ahorcado.getCantMax() == 0) {
            System.out.println("Lo siento no has, adivinado la palabra era "+ String.join("",ahorcado.getPalabraABuscar()));
        } else {
            System.out.println("Genial!");

        }

    }

}
