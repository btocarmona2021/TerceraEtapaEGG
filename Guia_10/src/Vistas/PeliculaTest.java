/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Vistas;
import Entidades.Pelicula;
import Servicios.PeliculaServicio;
import java.util.ArrayList;
import static java.util.Collections.reverse;
/**
 *
 * @author bruno
 */
public class PeliculaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Pelicula> listaPel = new ArrayList();
        PeliculaServicio sp = new PeliculaServicio();
        sp.crearPelicula(listaPel);
        
        sp.mostrarPeliculas(listaPel);
        sp.mostrarMayorQue1h(listaPel);
        listaPel.sort(Pelicula.compararDuracion);
        System.out.println("------");
        reverse(listaPel);
        for (Pelicula pelicula : listaPel) {
            System.out.println(pelicula.getDuracion());
        }
        System.out.println("-----");
        reverse(listaPel);
        for (Pelicula pelicula : listaPel) {
            System.out.println(pelicula.getDuracion());
        }
        listaPel.sort(Pelicula.compararTitulo);
        for (Pelicula pelicula : listaPel) {
            System.out.println(pelicula.getTitulo());
        }
        
        listaPel.sort(Pelicula.compararDirector);
        for (Pelicula pelicula : listaPel) {
            System.out.println(pelicula.getDirector());
        }
    }
}
/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.*
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
*/