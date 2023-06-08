package Vistas;

import Entidades.AdivinaMes;
import Entidades.Utilidad;
import Servicios.AdivinaMesServicio;

public class AdivinaMesTest {

    public static void main(String[] args) {
        AdivinaMesServicio ams = new AdivinaMesServicio();
        AdivinaMes am = new AdivinaMes();
        System.out.println("Adivina el mes, ingresalo en minusculas");
        String mesaAdivinar = Utilidad.leer().nextLine();
    
        if (ams.adivinaMes(am, mesaAdivinar)) {
            System.out.println("Genial hás adivinado el mes efectivamente era " + mesaAdivinar + " !Felicitaciones!");

        }

    }

}
