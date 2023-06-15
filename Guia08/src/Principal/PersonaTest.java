package Principal;

import Entidades.Persona;
import Servicios.PersonaServicio;

public class PersonaTest {

    public static void main(String[] args) {

        PersonaServicio ps = new PersonaServicio();
        Persona persona01 = ps.crearPersona("Alberto", 48, 'M', 90, 1.80);
        Persona persona02 = ps.crearPersona("Fabiana", 48, 'F', 65, 1.65);
        Persona persona03 = ps.crearPersona("Santiago", 15, 'M', 72, 1.70);
        Persona persona04 = ps.crearPersona("Olga", 71, 'F', 45, 1.55);
               
        
        Persona[] personas = {persona01, persona02, persona03, persona04};

        byte[] pesoideal = new byte[4];
        boolean[] edades = new boolean[4];
        double bajoPeso = 0;
        double pesoNormal = 0;
        double sobrePeso = 0;
        double mayores = 0;
        double menores = 0;

        for (int i = 0; i < personas.length; i++) {
            pesoideal[i] = ps.calcularIMC(personas[i]);
            switch (pesoideal[i]) {
                case -1:
                    bajoPeso++;
                    break;
                case 0:
                    pesoNormal++;
                    break;
                case 1:
                    sobrePeso++;
                    break;
            }
            edades[i] = ps.esMayor(personas[i]);
            if (edades[i]) {
                mayores++;
            } else {
                menores++;
            }
        }
       

        System.out.println("Hay " + Math.round(mayores) + " personas Mayores");
        System.out.println("Hay " + Math.round(menores) + " personas Menores");
        System.out.println("=============================================");
        System.out.println("Hay " + Math.round(bajoPeso) + " personas con Bajo Peso");
        System.out.println("Hay " + Math.round(pesoNormal) + " pesonas con Peso Normal");
        System.out.println("Hay " + Math.round(sobrePeso) + " personas con Sobre Peso");
        System.out.println("=============================================");
        // LA DIVISION POR 0.04 LA HAGO PARA NO TENER QUE PONER A CADA UNO *100
        System.out.println("Hay un " + (mayores / 0.04) + " % de mayores y un " + menores / 0.04 + " % de menores");
        System.out.println("=============================================");
        System.out.println("Hay un " + bajoPeso / 0.04 + " personas con bajo peso");
        System.out.println("Hay un " + pesoNormal / 0.04 + " personas con peso Normal");
        System.out.println("Hay un " + sobrePeso / 0.04 + " personas con sobre peso");

    }
    
   
}
