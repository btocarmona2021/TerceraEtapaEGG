/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class PeliculaServicio {

    String respuesta = "";
    Scanner leer = new Scanner(System.in);

    public void crearPelicula(ArrayList<Pelicula> lista) {
        do {
            System.out.println("Ingrese titulo , director y duracion");
            lista.add(new Pelicula(leer.next().toUpperCase(), leer.next().toUpperCase(), leer.nextDouble()));
            System.out.println("Queres ingresar otra pelicula? (s/n)");
            respuesta = leer.next();
        } while (respuesta.equalsIgnoreCase("s"));

    }

    public void mostrarPeliculas(ArrayList<Pelicula> lista) {
        for (Pelicula pelicula : lista) {
            System.out.println(pelicula.getTitulo());
        }
    }

    public void mostrarMayorQue1h(ArrayList<Pelicula> lista) {
        System.out.println("Peliculas con duracion mayor a 1 hs:");
        for (Pelicula pelicula : lista) {
            if (pelicula.getDuracion() > 1) {
                System.out.println(pelicula.getTitulo());
            }
        }
    }

    
    
}

/*
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
*/
