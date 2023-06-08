
package Vistas;

import Entidades.Perro;
import Entidades.Persona;

public class PerroTest {

    public static void main(String[] args) {
        Perro perro_01 = new Perro("Chiquito", "Caniche", 9, "chico");
        Perro perro_02 = new Perro("Lola", "Labrador", 3, "Grande");
        Persona persona_01 =new Persona("Daniel", "Garcia", 35, 25443052, perro_01);
        Persona persona_02 =new Persona("Santiago", "Almeida", 22, 36554864, perro_02);
        
        System.out.println(persona_01.toString());
        System.out.println("=====================");
        System.out.println(persona_02);

        StringBuilder test = new StringBuilder();

        test.append("Hola").append(" Mundo");
        System.out.println(test.toString());
  
    }

}
