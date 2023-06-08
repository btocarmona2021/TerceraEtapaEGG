package Servicios;

import Entidades.Tiempo;


public class TiempoServicio {
    
    public Tiempo crearTiempo(int hora,int min,int seg){
        
        return new Tiempo(hora, min, seg);
    }

    public void imprimirHoraCompleta(Tiempo t1){
       int segundos = t1.getSegundos() % 60;
       int minutos = (t1.getMinutos() + (t1.getSegundos()/60))%60;
       int horas= t1.getHora()+ ((t1.getMinutos() + (t1.getSegundos()/60))/60);
        System.out.println("La hora es " + horas+ ":"+minutos+":"+ segundos);
       
    }
    
}
