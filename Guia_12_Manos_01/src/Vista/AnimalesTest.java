package Vista;

import Entidades.Animal;
import Entidades.Gato;
import Entidades.Perro;
import java.util.ArrayList;

public class AnimalesTest {

    public static void main(String[] args) {

        ArrayList<Animal> animales = new ArrayList<>();

        Animal a = new Animal("ANIMAL");
        Animal b = new Perro(true, "PERRO");
        Animal c = new Gato("Marron", "Gato");
        animales.add(a);
        animales.add(b);
        animales.add(c);
        
        
        for (Animal animale : animales) {
            System.out.println("====================");
            System.out.println(animale.getNombre());
            animale.hacerRuido();
        }
        
        

       

    }

}
