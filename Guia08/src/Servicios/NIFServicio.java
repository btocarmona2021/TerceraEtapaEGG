package Servicios;

import Entidades.NIF;


public class NIFServicio {

    public void crearNif(long dni,NIF nif) {
        nif.setDni(dni);
        String caracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
        char[] caracterNif = caracteres.toCharArray();
        
        int result=Math.round(dni%23);
        nif.setNif(caracterNif[result]);
        
    }
    
    public void mostrar(NIF nif){
        System.out.println("El NIF es = " + nif.getDni()+"-"+nif.getNif());
    }
    
    
}
