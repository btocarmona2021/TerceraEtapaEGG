package Entidades;

public class Ahorcado {
     
    private String[] palabraABuscar;
    private int letrasEncontradas;
    private int cantMax;
    private String[] palabras;
    
    public Ahorcado() {
    }

    public Ahorcado(String[] palabraABuscar, int cantMax) {
        this.palabraABuscar = palabraABuscar;
        this.cantMax = cantMax;
    }
    
    

    public String[] getPalabraABuscar() {
        return palabraABuscar;
    }

    public void setPalabraABuscar(String[] palabraABuscar) {
        this.palabraABuscar = palabraABuscar;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getCantMax() {
        return cantMax;
    }

    public void setCantMax(int cantMax) {
        this.cantMax = cantMax;
    }

    public String[] getPalabras() {
        return palabras;
    }

    public void setPalabras(String[] palabras) {
        this.palabras = palabras;
    }
    

}
