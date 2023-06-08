//Definir la clase Tiempo, la cual tendrá la hora, minutos y segundos. Definir dos constructores: un
//constructor vacío y otro con la hora, minutos y segundos ingresado por el usuario. Deberá definir
//además, los métodos getters y setters correspondientes, y el método imprimirHoraCompleta().
//Recordar crear una validación sobre las horas, minutos y segundos ingresados por el usuario. Te
//animas a simular el paso del tiempo en consola??????
package Entidades;

import java.util.Scanner;

public class Tiempo {

    Scanner leer = new Scanner(System.in);
    private int hora;
    private int minutos;
    private int segundos;

    public Tiempo() {

    }

    public Tiempo(int hora, int minutos, int segundos) {

        while (hora < 0 && hora > 24) {
            System.out.println("La hora es incorrecta re - ingrese por favor");
            this.hora = leer.nextInt();
        }
        
        this.hora = hora;

        while (minutos < 0 && minutos > 60) {
            System.out.println("Los minutos son incorrectos re - ingrese por favor");
            this.minutos = leer.nextInt();
        }
        
        this.minutos = minutos;
        
        while (segundos < 0 && segundos > 1000000) {
            System.out.println("Los segundos son incorrectos re - ingrese por favor");
            this.segundos = leer.nextInt();
        }
        
        this.segundos = segundos;
    }
   

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

}
