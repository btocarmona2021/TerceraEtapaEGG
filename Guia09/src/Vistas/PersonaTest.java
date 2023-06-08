
package Vistas;

import Entidades.Persona;
import Servicios.PersonaService;
import java.util.Date;

public class PersonaTest {
    public static void main(String[] args) {
        PersonaService ps =new PersonaService();
        Date fechanaciemiento=new Date(1975, 1, 13);
        Persona p1= ps.crearPersona("Alberto",fechanaciemiento);
        System.out.println("Nombre = "+p1.getNombre());
        System.out.println("Nació = "+p1.getFechanacimiento());
        System.out.println("La edad es de "+ps.calcularEdad(p1)+" Años");
        
    }

}
