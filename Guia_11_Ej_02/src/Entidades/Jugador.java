package Entidades;

public class Jugador {
//<editor-fold desc="ATRIBUTOS">
    private int idJugador;

    private String nombre;

    private boolean mojado;

    private int numeroJugador=6;
//</editor-fold>
//<editor-fold desc="CONSTRUCTORES"> 
    public Jugador() {
    }
    

    public Jugador(int idJugador, String nombre, boolean mojado, int numeroJugador) {
        this.idJugador = idJugador;
        this.nombre = nombre.concat(" " + idJugador);
        this.mojado = mojado;
        this.numeroJugador = numeroJugador;
    }
    //</editor-fold>
//<editor-fold desc="GET Y SET">
    public int getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    public int getNumeroJugador() {
        return numeroJugador;
    }

    public void setNumeroJugador(int numeroJugador) {
        this.numeroJugador = numeroJugador;
    }
//</editor-fold>
//<editor-fold desc="METODOS">
    public boolean disparo(Revolver revolver) {
        if (revolver.mojar()) {
            this.mojado = false;
        } else {
            this.mojado = true;
        }
        revolver.siguienteChorro();
        return !this.mojado;
    }
//</editor-fold>

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Numero= ").append(numeroJugador).append("\n");
        sb.append("Su idJugador es= ").append(idJugador).append("\n");
        sb.append("Su nombre= ").append(nombre).append("\n");
       
        return sb.toString();
    }
    
}
