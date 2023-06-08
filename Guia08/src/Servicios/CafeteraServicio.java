//Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe
//y se añade a la cafetera la cantidad de café indicada.
package Servicios;

import Entidades.Cafetera;

public class CafeteraServicio {

    public Cafetera crearCafetera() {
        return  new Cafetera();
    }

    public void llenarCafetera(Cafetera cafetera01) {

        cafetera01.setCantidadActual(cafetera01.getCANTIDADMAXIMA());

    }

    public void servirTaza(int servirTaza, Cafetera cafetera01) {

        if (cafetera01.getCantidadActual() >= servirTaza) {
            System.out.println("Su taza de café se ha llenado,Disfrute del mejor café Nespresso");
            cafetera01.setCantidadActual(cafetera01.getCantidadActual() - servirTaza);
        } else if (cafetera01.getCantidadActual() < servirTaza && cafetera01.getCantidadActual() != 0) {
            System.out.println("Su taza no se ha podido de llenar , solo se ingreso " + cafetera01.getCantidadActual()
                    + " ml de café");
            cafetera01.setCantidadActual(cafetera01.getCantidadActual() - cafetera01.getCantidadActual());
        } else {
            System.out.println("No hay café");
        }

    }

    public void vaciarCafetera(Cafetera cafetera01) {
        cafetera01.setCantidadActual(0);
        System.out.println("Se ha vaciado la cafetera, puede limpiarla");
    }

    public void agregarCafe(int agregaCafe, Cafetera cafetera01) {

        if (cafetera01.getCantidadActual() + agregaCafe <= cafetera01.getCANTIDADMAXIMA()) {
            cafetera01.setCantidadActual(cafetera01.getCantidadActual() + agregaCafe);
            System.out.println("Se ha agregado café correctamente");
        }else{
            System.out.println("La cantidad de café a agregar desbordaría la cafetera");
        }

    }

}
