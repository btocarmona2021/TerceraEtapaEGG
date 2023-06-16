package entidad;

import java.util.concurrent.ThreadLocalRandom;

public class AdivinaNumero {
    
    private int numeroaleatorio;
    ThreadLocalRandom aleatorio = ThreadLocalRandom.current();
    public AdivinaNumero() {
        this.numeroaleatorio= aleatorio.nextInt(1, 501);
    }

    public int getNumeroaleatorio() {
        return numeroaleatorio;
    }

    public void setNumeroaleatorio(int numeroaleatorio) {
        this.numeroaleatorio = numeroaleatorio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Numero Aleatorio es =").append(numeroaleatorio);
        return sb.toString();
    }

    
}
