package Servicios;

import Entidades.Persona;

public class PersonaServicio {
    
    public Persona crearPersona(String nombre, int edad, char sexo, double peso, double altura) {
        return new Persona(nombre, edad, sexo, peso, altura);
    }
    
    public boolean esMayor(Persona persona) {
        boolean estado;
        if (persona.getEdad() > 18) {
            estado= true;
        }else{
            estado= false;
        }
        
        return estado;
    }
    
    public byte calcularIMC(Persona persona){
        byte estado;
        double IMC=  persona.getPeso()/(Math.pow(persona.getAltura(),2));
        if (IMC<20) {
            estado=-1;
        }else if (IMC>=20 && IMC <=25) {
            estado=0;
        } else {
            estado=1;
        }
        return estado;
    }
    
    
}
