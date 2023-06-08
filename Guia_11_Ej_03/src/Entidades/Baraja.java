package Entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Baraja {

    private ArrayList<Carta> baraja;
    
    public Baraja() {
    }

    public Baraja(ArrayList<Carta> baraja) {
        this.baraja = baraja;
    }

    public void barajar() {
        if (baraja.size()>0) {
            Collections.shuffle(baraja);
            System.out.println("Se ha realizado una nueva mezcla de cartas");
        }else{
            System.out.println("No hay más cartas no se puede barajar");
        }

    }

    public void siguienteCarta() {
        if (baraja.size()>0) {
            System.out.println("La siguiente carta es " + baraja.get(0));
        } else if (baraja.size() == 1) {
            System.out.println("Es la última carta del maso");
        } else {
            System.out.println("No quedan más cartas en el maso, Lo siento");
        }
        
    }

    public void cartasDisponibles() {
        System.out.println("Aún quedan " + baraja.size() + " cartas disponibles en el maso");
    }

    public static int cartasDadas = 0;
 ArrayList<Carta> salidas = new  ArrayList<>();
 
    public void darCartas(int cantidadCartas) {
       
        if (baraja.size()>= cantidadCartas) {
            System.out.println("Se te entregaron " + cantidadCartas + " cartas.");
            for (int i = 0; i < cantidadCartas; i++) {
                  salidas.add(baraja.get(0));
                  baraja.remove(0);
            }
        } else {
            System.out.println("No queda esa cantidad de cartas en la baraja");
        }
    }

    public void cartasMonton() {

        if (salidas.size()!=0) {
            System.out.println("===================");
            System.out.println("Ya ha salido:");
            System.out.println("===================");
            for (Carta yasalieron : salidas) {
                System.out.println(yasalieron);
            }
            System.out.println("===================");

        } else {
            System.out.println("Aún no han salido cartas");
        }
    }

    public void mostrarBaraja() {
        System.out.println("Cartas en el maso");
        
        if (baraja.size()>0) {
            for (Carta carta : baraja) {
                System.out.println(carta);
            }
        } else if (baraja.size()==0) {
            System.out.println("No quedan cartas en la baraja");
        } else {
            System.out.println("Aún no han salido cartas");
        }

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("baraja=").append(baraja);
        return sb.toString();
    }
    
    public static Comparator<Carta> ordenar = new Comparator<Carta>() {
        @Override
        public int compare(Carta o1, Carta o2) {
           
           return  o1.getPalo().compareTo(o2.getPalo());
        }
        
    };
            
}
