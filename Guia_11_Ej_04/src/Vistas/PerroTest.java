package Vistas;

import Entidades.Perro;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class PerroTest {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Perro> jauria = new ArrayList();
        llenaJauria(jauria);

        ArrayList<Persona> adoptantes = new ArrayList();
        llenarAdoptantes(adoptantes);

        for (int i = 0; i < adoptantes.size(); i++) {
            System.out.println(adoptantes.get(i).getNombre() + ",ingrese el nombre de la mascota a adoptar");
            String mascota = leer.nextLine();
            boolean encontrado = false;
            Perro seleccionado = null;
            for (int j = 0; j < jauria.size(); j++) {
                if (mascota.equalsIgnoreCase(jauria.get(j).getNombre())) {
                    seleccionado = jauria.get(j);
                    encontrado = true;
                    break;
                } else {
                    encontrado = false;
                }
            }
            if (encontrado == true && seleccionado.isAdoptado() == false) {
                adoptantes.get(i).setPerro(seleccionado);
                seleccionado.setAdoptado(true);
                seleccionado.setAdoptante(adoptantes.get(i).getNombre());
                System.out.println(" Buena elección " + seleccionado.getNombre() + ", ya es parte de tu familia");
                System.out.println("╚════════════════════════════════════════════════════╝");

            } else if (encontrado && seleccionado.isAdoptado() == true) {
                System.out.println(" El perro que intenta adoptar ya tiene familia su dueño es " + seleccionado.getAdoptante());
                System.out.println("╚═══════════════════════════════════════════════════════════════════╝");

                i += -1;
            } else {
                System.out.println("El nombre de la mascota no se encontro en la jauria,se ingreserá a la base de datos");
                System.out.println("Ingrese raza");
                String raza = leer.nextLine();
                System.out.println("Ingrese edad");
                int edad = leer.nextInt();
                leer.nextLine();
                System.out.println("Ingrese tamaño Grande/Mediano/Chico ");
                String tamanio = leer.nextLine();
                adoptantes.get(i).setPerro(new Perro(mascota, raza, edad, tamanio, true));
                jauria.add(adoptantes.get(i).getPerro());
                jauria.get(jauria.size() - 1).setAdoptante(adoptantes.get(i).getNombre());
            }
        }
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║    LISTADO DE PERRITOS CON SUS DUEÑOS    ║ ");
        System.out.println("╚══════════════════════════════════════════╝");
        for (Persona adoptante : adoptantes) {
            System.out.println(adoptante);
        }
    }

    public static void llenaJauria(ArrayList<Perro> jauria) {
        Scanner leer = new Scanner(System.in);
        Perro perro_01 = new Perro("Chiquito", "Caniche", 8, "chico", false);
        Perro perro_02 = new Perro("Lola", "Labrador", 3, "Mediano", false);
        Perro perro_03 = new Perro("Manchita", "Caniche", 4, "Chico", false);
        Perro perro_04 = new Perro("Mordelo", "Beagle", 1, "Grande", false);
        Perro perro_05 = new Perro("Asustalo", "Pitbull", 7, "Mediano", false);
        Perro perro_06 = new Perro("Corbata", "Dogo Arg", 5, "Grande", false);
        jauria.add(perro_01);
        jauria.add(perro_02);
        jauria.add(perro_03);
        jauria.add(perro_04);
        jauria.add(perro_05);
        jauria.add(perro_06);
    }

    public static void llenarAdoptantes(ArrayList<Persona> adoptantes) {
        Persona persona_01 = new Persona("Daniel", "Garcia", 32, 32654897);
        Persona persona_02 = new Persona("Fernando", "Ariente", 47, 25365845);
        Persona persona_03 = new Persona("Fabian", "Perez", 34, 38456888);
        Persona persona_04 = new Persona("Natalia", "Pereira", 33, 28669843);
        Persona persona_05 = new Persona("Adriana", "Hermida", 44, 26747151);
        Persona persona_06 = new Persona("Graciela", "Castellano", 51, 20414326);

        adoptantes.add(persona_01);
        adoptantes.add(persona_02);
        adoptantes.add(persona_03);
        adoptantes.add(persona_04);
        adoptantes.add(persona_05);
        adoptantes.add(persona_06);
    }
}
