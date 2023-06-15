package vista;

import entidad.Alquiler;
import entidad.BarcoMotor;
import entidad.BarcoVelero;
import entidad.BarcoYate;
import entidad.Cliente;
import enumeracion.Posiciones;
import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        BarcoVelero bv_01 = new BarcoVelero(6, "LXC985", 60, 2013);
        BarcoMotor bm_01 = new BarcoMotor(250, "LXC984", 70, 2012);
        BarcoYate by_01 = new BarcoYate(400, 200, "LXC986", 110, 2018);
       
        Cliente cliente_01 = new Cliente("Alberto", 24342942);
        Cliente cliente_02 = new  Cliente("Daniel", 35624897);
        Cliente cliente_03 = new Cliente("Fernando", 26898787);
       
       
        Alquiler alquiler_01 = new Alquiler(cliente_01,"2023/05/01", "2023/05/05", by_01,Posiciones.PONTON_01);
        Alquiler alquiler_02 = new Alquiler(cliente_02, "2023/01/01", "2023/01/21", bm_01, Posiciones.PONTON_02);
        Alquiler alquiler_03= new Alquiler(cliente_03, "2023/11/02", "2023/11/30",by_01, Posiciones.PONTON_05);

        
        ArrayList<Alquiler> alquileres =new ArrayList<>();
        
        alquileres.add(alquiler_01);
        alquileres.add(alquiler_02);
        alquileres.add(alquiler_03);

        
        for (int i = 0; i < alquileres.size(); i++) {
            System.out.print(alquileres.get(i));
          
            System.out.println("precio por alquiler de amarre " + alquileres.get(i).getBarco().calculoTarifa(alquileres.get(i).getFechaAmarre(), alquileres.get(i).getFechaDesamarre())+" pesos");
             System.out.println("=======================");
        }
        
    }

}
