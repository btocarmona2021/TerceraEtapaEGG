package Enumeraciones;

public enum TipoAuto {
    AUTO("Auto"),
    CAMIONETA("Camioneta"),
    CAMION("Camión"),
    MOTO("Moto");
    
    private String descripcion;

    private TipoAuto(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
}
