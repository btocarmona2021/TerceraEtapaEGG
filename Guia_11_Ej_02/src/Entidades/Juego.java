package Entidades;

import java.util.ArrayList;
import java.util.Collections;


public class Juego {

    private ArrayList<Jugador> jugadores;

    private Revolver revolver;

    public Juego(ArrayList<Jugador> jugadores, Revolver revolver) {
        Collections.shuffle(jugadores);
        this.jugadores =jugadores ;
        this.revolver = revolver;
    }
    public void ronda() {
      boolean finjuego=false;
        while (finjuego==false) {
            for (Jugador jugador : jugadores) {
                System.out.println("Participante " + jugador.getNombre());
                 System.out.println("Disparando *");
            if (revolver.mojar()) {
                System.out.println("=========================");
                System.out.println("Se ha mojado el jugador "+ jugador);
                System.out.println("***JUEGO TERMINADO***");
                finjuego=true;
                break;
            }else{
                try {
                    revolver.siguienteChorro();
                    System.out.println("ha fallado");
                    System.out.println("recargando...en posicion " +revolver.getPosicioActual());
                    Thread.sleep(3000);
                } catch (InterruptedException ex) {
                    ex.getMessage();
                }
            }
        }
            
        }
        
        
        
    }
    
    
}
