//Definir una clase llamada Puntos que contendrá las coordenadas de dos
//puntos, sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto.
//Generar un objeto puntos usando un método crearPuntos() que le pide al
//usuario los dos números y los ingresa en los atributos del objeto.
//Después, a través de otro método calcular y devolver la distancia que
//existe entre los dos puntos que existen en la clase Puntos. Para conocer
//como calcular la distancia entre dos puntos consulte el siguiente link:

package Encuentro_13_14_15_16_17_18;

import java.util.Scanner;

public class Puntos {

    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Puntos() {
    }

    
    
    ///FALTA TERMINAR NO ENTIENDO LA CONSIGNA
    public void crearPuntos() {
        Scanner leer = new Scanner(System.in);
        System.out.println("por favor ingrese la coordenada x1");
        this.x1 = leer.nextInt();
        System.out.println("por favor ingrese la coordenada y1");
        this.y1 = leer.nextInt();
        System.out.println("por favor ingrese la coordenada x2");
        this.x2 = leer.nextInt();
        System.out.println("por favor ingrese la coordenada y2");
        this.y2 = leer.nextInt();
    }
    
    public double calcularDistancia(){
        double distancia;
        distancia= Math.sqrt(Math.pow(Math.abs(x2-x1),2)+ Math.pow(Math.abs(y2-y1),2));
        
        return distancia;
    }
    
    

}
