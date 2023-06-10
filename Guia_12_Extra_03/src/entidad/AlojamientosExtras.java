package entidad;

public class AlojamientosExtras {

    protected boolean privado;

    protected int metrosCuadrados;

    public AlojamientosExtras() {
    }

    public AlojamientosExtras(boolean privado, int metrosCuadrados) {
        this.privado = privado;
        this.metrosCuadrados = metrosCuadrados;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Privado= ").append(privado ? "Es privado":" No es privado").append("\n");
        sb.append(", metrosCuadrados=").append(metrosCuadrados).append("\n");
        return sb.toString();
    }
}
