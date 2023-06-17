package Ejercicios;

public class PruebaCharAt {

    public static void main(String[] args) {

        String palabra = "Santiago";
        String palabra2 = "Carmona";
        String palabra3 = "SaNtIaGo";
        String palabra4 = "";

        System.out.println("//USO DE CHAR AT");
        System.out.println("Uso de CharAt");
        System.out.println(palabra.charAt(3));
        System.out.println("============================================");

        System.out.println("//COMPARA CADENAS");
        boolean compara = palabra.equals(palabra2);
        System.out.println("¿Las cadenas sosn iguales? " + compara);
        System.out.println("============================================");

        System.out.println("//COMPARAR CADENAS IGNORANDO GRAFIAS DE LA PALABRA");
        boolean compara2 = palabra.equalsIgnoreCase(palabra3);
        System.out.println("¿Las cadenas sosn iguales? " + compara2);
        System.out.println("============================================");

        System.out.println("//CONCATENA");
        String fraseFinal = palabra.concat(" " + palabra2);
        System.out.println("fraseFinal = " + fraseFinal);

        System.out.println("//Retorna true si la cadena contiene la secuencia tipo char del parámetro");
        boolean contiene = palabra.contains("a");
        System.out.println("contiene = " + contiene);

        System.out.println("//Retorna la posicion del caracter buscado index of");
        System.out.println("//Encuentra la posicion de la letra que se repite por segunda vez");
        int contador = 0;
        int posicion = 0;
        for (int i = 0; i < palabra.length(); i++) {

            if (palabra.substring(i, i + 1).equals("g")) {
                contador++;
            }
            if (contador == 2) {
                posicion = i;
                System.out.println(posicion);
                contador++;
            }

        }
        System.out.println("//retorna verdadero si la longitud de la cadena es 0");

        boolean valordelacadena = palabra4.isEmpty();
        System.out.println("valordelacadena = " + valordelacadena);

//     
        String nuevaCadena= palabra.replace('a', 'A');
        System.out.println("nuevaCadena = " + nuevaCadena);
        
        String nombres1= "juan,Pedro,Natalia,Jacinto,Anabella" +","+ "Diego";
        String nombres= nombres1.toUpperCase();
        
        String[] nombreCompas=nombres.split(",");
        
        System.out.println(nombreCompas[0]);
        System.out.println(nombreCompas[1]);
        System.out.println(nombreCompas[2]);
        System.out.println(nombreCompas[3]);
        System.out.println(nombreCompas[4]);
        System.out.println(nombreCompas[5]);
        
        
        
    }
}
