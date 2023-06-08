package Vistas;

import Entidades.Alumno;
import Entidades.Simulador;
import java.util.ArrayList;
import java.util.Arrays;

public class VotacionesTest {
    
    public static void main(String[] args) {
        //Creo un arreglo de nombres y otro de apellidos para no agregarlos a mano en el ArrayList.
        String[] nombres = {"Juan", "María", "Pedro", "Ana", "Luis", "Carlos", "Laura", "Andrés", "Mónica", "Roberto", "Valeria", "Diego", "Isabel", "Hugo", "Fernanda", "Javier", "Carmen", "Ricardo", "Gabriela", "Sergio", "Paula", "Alejandro", "Daniela", "José", "Elena", "Miguel", "Mariana", "Rosa", "Felipe", "Patricia"};
        String[] apellidos = {"Pérez", "López", "Rodríguez", "García", "Martínez", "Fernández", "Torres", "Ramírez", "Gómez", "Vargas", "Castro", "Herrera", "Morales", "Jiménez", "Ortega", "Ríos", "Silva", "Soto", "Navarro", "Bravo", "Mendoza", "Guzmán", "Paredes", "Rojas", "Castro", "Salazar", "Peña", "Morales", "Muñoz", "Medina"};
        //Convierto los arreglos a ArrayList.
        ArrayList<String> nombresAlumnos = new ArrayList<>(Arrays.asList(nombres));
        ArrayList<String> apellidosAlumnos = new ArrayList<>(Arrays.asList(apellidos));
        //Instancio un objeto de Simulador.
        Simulador s1 = new Simulador();
        //Haciendo uso de los ArrayList de nombres y apellidos generos nombres completos aleatoriamente.
        ArrayList<String> nombreCompleto = s1.creaNombrecompleto(nombresAlumnos, apellidosAlumnos);
        //Haciendo uso de la cantidad de nombres completos de las personas genero numeros de DNI aletoriamente,.
        ArrayList<Integer> dnis = s1.crearListaDni(nombreCompleto);
        //A partir de los nombres Completos y DNI genero los Alumnos.
        ArrayList<Alumno> alumnos = s1.crearListaAlumno(nombreCompleto, dnis);
        //Imprimo el listado de los alumnos.
//        System.out.println("===========LISTADO DE ALUMNOS===========");
//        for (Alumno alumno : alumnos) {
//            System.out.println(alumno);
//        }
        
        s1.votacion(alumnos);
        s1.mostrarAlumnos();
        System.out.println("======RECUENTO DE VOTOS=======");
        s1.recuentoVotos(alumnos);
        System.out.println("========FACILITADORES Y SUPLENTES=======");
        s1.crearCincoFacilitadores(alumnos);
        
    }
  
}

