package entidad;

public class EdificioDeOficina extends Edificio {

    private int numerosOficinas;
    private int cantPersOficina;
    private int numeroDePisos;

    public EdificioDeOficina() {
    }

    public EdificioDeOficina(int numerosOficinas, int cantPersOficina, int numeroDePisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.numerosOficinas = numerosOficinas;
        this.cantPersOficina = cantPersOficina;
        this.numeroDePisos = numeroDePisos;
    }

    @Override
    public double calcularSuperficie() {
        return this.ancho * this.largo;
    }

    @Override
    public double calcularVolumen() {
        return this.ancho * this.largo * this.alto;
    }
    
    
    public void  cantPersonas(){
        int cantPersPiso=this.cantPersOficina*this.numerosOficinas;
        int cantPersEdificio= cantPersPiso*this.numeroDePisos;
        System.out.println("La cantidad de personas por piso es " + cantPersPiso);
        System.out.println("Y la cantidad de personas trabajando en el edificio es " + cantPersEdificio);
        
    }
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Numero de Oficinas= ").append(numerosOficinas).append("\n");
        sb.append("Cantidad de Personas x Oficina= ").append(cantPersOficina).append("\n");
        sb.append("Numero De Pisos= ").append(numeroDePisos).append("\n");
        return sb.toString();
    }

}
