package Principal;

import Entidades.NIF;
import Servicios.NIFServicio;

public class NIFTest {

    public static void main(String[] args) {

        NIFServicio ns = new NIFServicio();
        NIF nif01 = new NIF();
        ns.crearNif(24342942, nif01);
        ns.mostrar(nif01);

    }

}
