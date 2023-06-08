package Enumeraciones;

public enum TipoCobertura {

    TOTAL("Total"),
    CONTRA_TERCEROS("Contra Terceros"),
    ROBO("Robo"),
    DANIOS_MATERIALES("Daños Materiales"),
    INCENDIO("Incendio"),
    ASISTENCIA_EN_RUTA("Asistencia en la Ruta"),
    LUNETAS_Y_CRISTALES("Lunetas y Cristales");
    
    private final String detalle;

    private TipoCobertura(String detalle) {
        this.detalle = detalle;
      
    }

    public String getDetalle() {
        return detalle;
    }

   

}
