package Vistas;

import Entidades.Cine;
import Entidades.Espectador;
import Entidades.Pelicula;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Random;

public class CineTest {

    public static void main(String[] args) {
//<editor-fold desc="PELICULAS">
        Pelicula p1 = new Pelicula("La sombra del pasado", 120, 1, "Alejandro Gómez");
        Pelicula p2 = new Pelicula("El secreto de la montaña", 105, 1, "Sofia Martínez");
        Pelicula p3 = new Pelicula("El último viaje", 135, 1, "Carlos Rodríguez");
        Pelicula p4 = new Pelicula("Aventuras en el espacio", 90, 1, "Laura Pérez");
        Pelicula p5 = new Pelicula("El enigma de la cripta", 110, 1, "Luis Hernández");
        Pelicula p6 = new Pelicula("El legado perdido", 125, 1, "Marta González");
        ArrayList<Pelicula> peliculas = new ArrayList<>();
        peliculas.add(p1);
        peliculas.add(p2);
        peliculas.add(p3);
        peliculas.add(p4);
        peliculas.add(p5);
        peliculas.add(p6);
//</editor-fold>

//<editor-fold desc="ESPECTADORES">
        ArrayList<Espectador> espectadores = new ArrayList<>();
        
        espectadores.add(new Espectador("Juan", 5, 50.0));
        espectadores.add(new Espectador("María", 30, 40.0));
        espectadores.add(new Espectador("Pedro", 18, 26.0));
        espectadores.add(new Espectador("Laura", 22, 35.0));
        espectadores.add(new Espectador("Carlos", 8, 45.0));
        espectadores.add(new Espectador("Ana", 20, 30.0));
        espectadores.add(new Espectador("Luis", 35, 55.0));
        espectadores.add(new Espectador("Sofía", 7, 50.0));
        espectadores.add(new Espectador("Diego", 19, 25.0));
        espectadores.add(new Espectador("Marta", 3, 40.0));
        espectadores.add(new Espectador("Marta", 3, 40.0));
        espectadores.add(new Espectador("Juan", 25, 50.0));
        espectadores.add(new Espectador("Ana", 18, 30.0));
        espectadores.add(new Espectador("Luisa", 20, 60.0));
        espectadores.add(new Espectador("Pedro", 30, 70.0));
        espectadores.add(new Espectador("Carla", 40, 80.0));
        espectadores.add(new Espectador("Roberto", 35, 45.0));
        espectadores.add(new Espectador("María", 15, 25.0));
        espectadores.add(new Espectador("Luis", 28, 55.0));
        espectadores.add(new Espectador("Laura", 21, 35.0));
        espectadores.add(new Espectador("Javier", 32, 65.0));
        espectadores.add(new Espectador("Sofía", 19, 40.0));
        espectadores.add(new Espectador("Fernando", 22, 50.0));
        espectadores.add(new Espectador("Isabel", 26, 45.0));
        espectadores.add(new Espectador("Andrés", 33, 70.0));
        espectadores.add(new Espectador("Valentina", 16, 30.0));
        espectadores.add(new Espectador("Diego", 27, 55.0));
        espectadores.add(new Espectador("Gabriela", 23, 35.0));
        espectadores.add(new Espectador("Alejandro", 31, 60.0));
        espectadores.add(new Espectador("Catalina", 17, 25.0));

//</editor-fold>

        //DECLARO LA SALA CON UNA MATRIZ DE 8 X 6
        String[][] asientos = new String[8][6];
        
        //INSTANCIO LA CLASE RANDOM PARA GENERAR LOS ASIENTOS
        Random aleatorio = new Random();
        
        //CON UN FOR EN DECREMENTO EN LAS FILAS LLENO CON UN CARACTER MAS 2 ESPACIOS Y CIERRO CON |
        for (int i = asientos.length - 1; i >= 0; i--) {
            for (int j = 0; j < asientos[j].length; j++) {
                char letra = (char) ('A' + j);
                asientos[i][j] = i + 1 + (letra + " " + " " + " | ");
            }
        }

        System.out.println("======================================");
        //AGREGADO PARA GUARDAR LOS QUE NO PUDIERON ENTRAR
        ArrayList<Espectador> quedaronAfuera = new ArrayList<>();
        
        //INSTANCIO MI CLASE CINE Y DETERMINO QUE PELICULA SE ESTA REPROCUCIENDO
        DecimalFormat formato = new DecimalFormat();
        formato.setMaximumFractionDigits(2);
        DecimalFormatSymbols fs = new DecimalFormatSymbols();
        fs.setDecimalSeparator('.');
        formato.setDecimalFormatSymbols(fs);
      
        
        Cine cine01 = new Cine(peliculas.get(aleatorio.nextInt(0, 5)),Double.parseDouble(formato.format(aleatorio.nextDouble(0, 50))) , espectadores);

        for (Espectador espectador : espectadores) {

            if (espectador.getDineroDisponible() >= cine01.getPrecioEntrada() && espectador.getEdad() > cine01.getPeliculaReprod().getEdadMinima()) {

                int indiceA = aleatorio.nextInt(0, 8);
                int indiceB = aleatorio.nextInt(0, 6);

                if (asientos[indiceA][indiceB].substring(3, 4).equals(" ")) {
                    asientos[indiceA][indiceB] = asientos[indiceA][indiceB].substring(0, 2).concat(" X | ");

                } else {
                    while (asientos[indiceA][indiceB].substring(3, 4).equals("X")) {

                        
                        indiceA = aleatorio.nextInt(0, 8);
                        indiceB = aleatorio.nextInt(0, 6);
                        
//                        if (indiceA == 7 && indiceB == 5) {
//                            indiceB = 0;
//                            indiceA = 0;
//                        } else if (indiceA < 7 && indiceB < 5) {
//                            indiceB++;
//                        } else if (indiceB == 5) {
//                            indiceB = 0;
//                            indiceA++;
//                        }
                    }
                    asientos[indiceA][indiceB] = asientos[indiceA][indiceB].substring(0, 2).concat(" X | ");

                }

            }else{
               quedaronAfuera.add(espectador);
            }

        }
        System.out.println("Se esta proyectando " + cine01.getPeliculaReprod().getTitulo() + "\n"
                + "El precio de la entrada es " + cine01.getPrecioEntrada() + " Pesos \n"
                + "La edad minima para ingresar es " + cine01.getPeliculaReprod().getEdadMinima() + " Años");
        
        System.out.println("=====================================");

        for (int i = asientos.length - 1; i >= 0; i--) {
            for (int j = 0; j < asientos[j].length; j++) {
                System.out.print(asientos[i][j]);
            }
            System.out.println("");
        }
        
        for (Espectador afuera : quedaronAfuera) {
            System.out.println("************************************************");
            System.out.println (afuera.getNombre() + " quedó sin ingresar" + " tiene " + afuera.getEdad()+" años y " + afuera.getDineroDisponible() + " Pesos" );
        }

    }
}
