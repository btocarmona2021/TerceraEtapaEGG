//Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números
//del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya
//por una E. Ejemplo: 
//0-0-0 
//0-0-1 
//0-0-2 
//0-0-E 
//0-0-4 
//0-1-2 
//0-1-E
package Encuentro_04_05_06_Extras;



public class Ejercicio_12_Extra {

    public static void main(String[] args) {
        int[][][] numeros = new int[10][10][10];
        
        String[] numerosTexto = new String[1000];
        int contador=0;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                for (int k = 0; k < numeros.length; k++) {
                    if (i == 3 && j == 3 && k == 3) {
                        numerosTexto[contador] = "E" + "-" + "E" + "-" + "E";
                    } else if (i == 3 && j == 3) {
                        numerosTexto[contador] = "E" + "-" + "E" + "-" + k;
                    }else if (i == 3) {
                        numerosTexto[contador] = "E" + "-" + j + "-" + k;
                    }else if (j==3 && k==3) {
                        numerosTexto[contador] = i + "-" + "E" + "-" + "E";
                    } else if (j == 3) {
                        numerosTexto[contador] = i + "-" + "E" + "-" + k;
                     }else if (k==3 && i==3) {
                        numerosTexto[contador] = "E" + "-" +j + "-" + "E";  
                    }else if (k==3) {
                        numerosTexto[contador] = i + "-" +j + "-" + "E";
                    }
                    else{ numerosTexto[contador] = i + "-" + j + "-" + k;}
                    contador++;
                }
            }
        }
        
        
        System.out.println("=======================");
        for (int i = 0; i < contador; i++) {
             System.out.println(numerosTexto[i]);
        }
       

    }
}
