package Servicios;

import Entidades.AdivinaMes;
import Entidades.Utilidad;

public class AdivinaMesServicio {

    public boolean adivinaMes(AdivinaMes am, String mesaAdivinar) {

        while (!am.getMesSecreto().equalsIgnoreCase(mesaAdivinar)) {

            System.out.println("No has adivinado, intenta nuevamente");
            mesaAdivinar = Utilidad.leer().nextLine();

        }
        return true;

    }

}
