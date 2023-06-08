package Principal;

import Entidades.Tiempo;
import Servicios.TiempoServicio;

public class TiempoTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TiempoServicio ts = new TiempoServicio();
        Tiempo t1 = ts.crearTiempo(10, 181, 0);
        for (int i = 0; i < 7200; i++) {
            t1.setSegundos(t1.getSegundos()+1);
              ts.imprimirHoraCompleta(t1);
        }
        
      

    }

}
