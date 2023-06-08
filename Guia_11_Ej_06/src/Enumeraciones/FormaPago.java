package Enumeraciones;

public enum FormaPago {

    EFECTIVO("Efectivo"), 
    TARJETA_DE_CREDITO("Tarjeta de Crédito"), 
    TARJETA_DE_DEBITO("Tarjeta de débito"), 
    TRANSFERENCIA_BANCARIA("Transferencia Bancaria"), 
    MERCADOPAGO("Mercadopago"), 
    CHEQUE("Cheque");
    
    private final String forma;

    private FormaPago(String forma) {
        this.forma = forma;
    }

    public String getForma() {
        return forma;
    }
    
}
