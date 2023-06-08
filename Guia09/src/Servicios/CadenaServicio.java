package Servicios;

import Entidades.Cadena;



public class CadenaServicio {

    public int cantVocales(Cadena cadena) {
        
        int vocales = 0;
        for (int i = 0; i < cadena.getFrase().length(); i++) {

            switch (cadena.getFrase().substring(i, i + 1).toLowerCase()) {
                case "a":
                    vocales++;
                    break;
                case "e":
                    vocales++;
                    break;
                case "i":
                    vocales++;
                    break;
                case "o":
                    vocales++;
                    break;
                case "u":
                    vocales++;
                    break;
                default:

            }

        }
        return vocales;
    }

    public void invertirFrase(Cadena cadena) {
        String nuevafrase = "";
        for (int i = 0; i < cadena.getLongitud(); i++) {
            nuevafrase = nuevafrase.concat(cadena.getFrase().substring((cadena.getLongitud() - 1) - i, cadena.getLongitud() - i));
        }
        cadena.setFrase(nuevafrase);
        System.out.println(cadena.getFrase());

    }

    public int vecesRepetido(Cadena cadena, String letraBuscada ) {
   
        int cant = 0;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            if (cadena.getFrase().substring(i, i + 1).equals(letraBuscada)) {
                cant++;
            }
        }
        return cant;

    }

    public boolean compararFrase(Cadena cadena, String fraseaComparar) {

        return cadena.getLongitud() == fraseaComparar.length();
    }

    public String unirFrases(Cadena cadena, String fraseaUnir) {
        return cadena.getFrase().concat(fraseaUnir);
    }

    public void reemplazarA(Cadena cadena) {
        String nuevafrase = "";
        for (int i = 0; i < cadena.getLongitud(); i++) {
            if (cadena.getFrase().substring(i, i + 1).equalsIgnoreCase("a")) {
                nuevafrase = nuevafrase.concat("@");
            } else {
                nuevafrase = nuevafrase.concat(cadena.getFrase().substring(i, i + 1));
            }
        }
        System.out.println(nuevafrase);

    }

    public boolean contieneletra(Cadena cadena, String letra) {
      
        return cadena.getFrase().contains(letra);
    }
    
    public int[] generarnumero(){
        int[] numeros={5,6,8,3,12,4};
        
        return numeros;
    }

}
