
package Vistas;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

public class Test {

    public static void main(String[] args) {
        
        Animal perro_01 = new Perro("Chiquito", "Dog Chow", 5, "Labrador");
        perro_01.alimentarse();
        Animal gato_01 = new Gato("Mishifus", "Whiskas", 2, "Angora");
        gato_01.alimentarse();
        Animal caballo_01 = new Caballo("Silver", "Alfalfa", 8, "Pura Sangre");
        caballo_01.alimentarse();
    }

}
