package Servicios;

import Entidades.Persona;
import java.util.Date;

public class PersonaService {

    public Persona crearPersona(String nombre, Date fechanacimiento) {
        Date fecha = new Date(fechanacimiento.getYear() - 1900, fechanacimiento.getMonth() - 1, fechanacimiento.getDay());
        return new Persona(nombre, fecha);
    }

    public int calcularEdad(Persona persona) {
        Date fechaActual = new Date();
        return fechaActual.getYear() - persona.getFechanacimiento().getYear();

    }

    public boolean menorQue(Persona persona, int edadAConsultar) {
        boolean menor = false;
        if (persona.getFechanacimiento().getYear() < edadAConsultar) {
            menor = true;
        } else {
            menor = false;
        }
        return menor;
    }
    
    public void mostrarPersona(Persona persona){
        System.out.println("El nombre de la persona es " + persona.getNombre());
        System.out.println("La feha de naciemiento es " + persona.getFechanacimiento());
    }
    
}
