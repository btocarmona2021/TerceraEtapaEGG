package Servicios;

import java.util.Date;

public class FechaService {

    public static Date fechaNacimiento(int anio, int mes, int dia) {

        return new Date(anio - 1900, mes - 1, dia);
    }

    public static Date fechaActual() {
        Date fechaActual = new Date();

        return fechaActual;
    }
    
    public static int diferencia(Date fechaActual, Date fechaNacimiento) {
        
        return fechaActual.getYear()-fechaNacimiento.getYear();
        
        
    }

}
