package Vistas;

import Servicios.FechaService;
import static Servicios.FechaService.fechaNacimiento;
import java.util.Date;

public class FechaServiceTest {

    public static void main(String[] args) {

        FechaService.fechaNacimiento(1975, 1, 13);
        Date fechaNacimiento=fechaNacimiento(1975, 1, 13);
        Date fechaActual =FechaService.fechaActual();
        System.out.println(FechaService.fechaNacimiento(1975, 1, 13));

        System.out.println(FechaService.fechaActual());
        System.out.println(FechaService.diferencia(fechaActual,fechaNacimiento));

    }

}
