package Entidades;


public class Carta {

    private int numeroCarta;
    private String palo;

    private static int numero = 1;
    private static int pasos = 1;
    public Carta() {
        
        while (numero == 8 || numero == 9) {
            numero++;
        }

        if (numero < 13) {
            this.numeroCarta = numero;
             numero++;
        } else {
            numero = 1;
            this.numeroCarta = numero;
            numero++;
            pasos++;
        }
        if (numero==13 && pasos==4) {
            pasos=1;
        }
        switch (pasos) {
            case 1:
                palo = "Basto";
                break;
            case 2:
                palo = "Copa";
                break;
            case 3:
                palo = "Oro";
                break;
            case 4:
                palo = "Espada";
                break;
            default:
        }

    }
    
        public static int getNumero() {
        return numero;
    }

    public static void setNumero(int aNumero) {
        numero = aNumero;
    }
    
    
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(numeroCarta).append(" de ").append(palo);
        return sb.toString();
    }

    public int getNumeroCarta() {
        return numeroCarta;
    }

    public void setNumeroCarta(int numeroCarta) {
        this.numeroCarta = numeroCarta;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

}
