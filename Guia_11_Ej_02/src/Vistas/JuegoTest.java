
package Vistas;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.Revolver;
import java.util.ArrayList;

public class JuegoTest {
    
    
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador(1, "Alberto", false, 2);
        Jugador jugador2 = new Jugador(2, "Daniel", false, 3);
        Jugador jugador3 = new Jugador(3, "Gustavo", false, 5);
        Jugador jugador4 = new Jugador(4, "Alejandra", false, 4);
        Jugador jugador5 = new Jugador(5, "Vanesa", false, 1);
        ArrayList jugadores = new ArrayList();
        jugadores.add(jugador1);
        jugadores.add(jugador2);
        jugadores.add(jugador3);
        jugadores.add(jugador4);
        jugadores.add(jugador5);
        Revolver revolver_01 = new Revolver();
        revolver_01.llenarRevolver();
        
        Juego juego_01 = new Juego(jugadores, revolver_01);
        juego_01.ronda();
      
    }

}
