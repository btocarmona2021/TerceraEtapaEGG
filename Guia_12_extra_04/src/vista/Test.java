package vista;

import entidad.Empleado;
import entidad.Estudiantes;
import entidad.Persona;
import entidad.Plimpieza;
import entidad.Profesor;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useLocale(Locale.US);

        //<editor-fold desc="Personas">
        Persona persona_01 = new Persona("Daniel", "Fernandez", 24333666, "SOLTERO");
        Persona persona_02 = new Persona("Fernando", "Castellano", 18666444, "CASADO");

        Persona empleado_01 = new Empleado(1990, 1, "Javier", "Garcia", 38111222, "SOLTERO");
        Persona empleado_02 = new Empleado(1988, 2, "Natalia", "Gomez", 20222333, "SOLTERO");

        Persona profesor_01 = new Profesor("MATEMATICAS", 1999, 3, "Juan", "Castellano", 15999887, "DIVORCIADO");
        Persona profesor_02 = new Profesor("HISTORIA", 2000, 1, "Maria", "Rojas", 22456789, "CASADO");

        Persona plimpieza_01 = new Plimpieza("BIBLIOTECA", 1980, 1, "Santiago", "Mendez", 32987654, "VIUDO");
        Persona plimpieza_02 = new Plimpieza("MANTENIMIENTO", 1999, 2, "Andres", "Perez", 22465867, "CASADO");

        Persona estudiante_01 = new Estudiantes("CUARTO", "Daniela", "Millapi", 40123456, "SOLTERO");
        Persona estudiante_02 = new Estudiantes("QUINTO", "Gustavo", "Moyano", 41889444, "SOLTERO");

        ArrayList<Persona> personas = new ArrayList<>();

        personas.add(persona_01);
        personas.add(persona_02);
        personas.add(empleado_01);
        personas.add(empleado_02);
        personas.add(profesor_01);
        personas.add(profesor_02);
        personas.add(plimpieza_01);
        personas.add(plimpieza_02);
        personas.add(estudiante_01);
        personas.add(estudiante_02);
//</editor-fold>

        String op;
        do {

            System.out.println("=========================================");
            System.out.println("=         ELIJA UNA OPCION              =");
            System.out.println("= 1) Cargar una nueva persona           =");
            System.out.println("= 2) Cambiar estado civil-PERSONAS      =");
            System.out.println("= 3) Reasignación de despacho-EMPLEADO  =");
            System.out.println("= 4) Cambio a un nuevo curso-ESTUDIANTE =");
            System.out.println("= 5) Cambio de departamento-PROFESOR    =");
            System.out.println("= 6) Traslado de sección-PERSONAL LIMP  =");
            System.out.println("= 7) Mostrar todas las personas         =");
            System.out.println("= 8) SALIR                              =");
            System.out.println("=========================================");

            op = leer.nextLine();
            System.out.println("=========================================");

            switch (op) {
                case "1":
                    System.out.println("Que tipo de persona desea cargar?");
                    String per;
                    System.out.println("========================");
                    System.out.println("=   ELIJA UNA OPCION   =");
                    System.out.println("= 1) PERSONA           =");
                    System.out.println("= 2) EMPLEADO          =");
                    System.out.println("= 3) PERSONAL LIMPIEZA =");
                    System.out.println("= 4) PROFESOR          =");
                    System.out.println("= 5) ESTUDIANTE        =");
                    System.out.println("= 6) VOLVER AL MENU    =");
                    System.out.println("========================");

                    per = leer.nextLine();
                    switch (per) {
                        case "1":
                            System.out.println("Ingrese:\nNombre:\nApellido:\nDNI:\nEstado civil: ");
                            personas.add(new Persona(leer.nextLine(), leer.nextLine(), leer.nextInt(), leer.nextLine() + leer.nextLine()));
                            break;
                        case "2":
                            System.out.println("Ingrese:\nAño de ingreso:\nNumero de despacho\nNombre:\nApellido:\nDNI:\nEstado civil: ");
                            personas.add(new Empleado(leer.nextInt(), leer.nextInt(), leer.nextLine() + leer.nextLine(), leer.nextLine(), leer.nextInt(), leer.nextLine() + leer.nextLine()));
                            break;
                        case "3":
                            System.out.println("Ingrese:\nSeccion:\nAño de ingreso:\nNumerode despacho:Nombre:\nApellido:\nDNI:\nEstado civil: ");
                            personas.add(new Plimpieza(leer.nextLine(), leer.nextInt(), leer.nextInt(), leer.nextLine() + leer.nextLine(), leer.nextLine(), leer.nextInt(), leer.nextLine() + leer.nextLine()));
                            break;
                        case "4":
                            System.out.println("Ingrese:\nDepartamento:\nAño de ingreso:\nNumero de despacho\nNombre:\nApellido:\nDNI:\nEstado civil: ");
                            personas.add(new Profesor(leer.nextLine(), leer.nextInt(), leer.nextInt(), leer.nextLine() + leer.nextLine(), leer.nextLine(), leer.nextInt(), leer.nextLine() + leer.nextLine()));
                            break;
                        case "5":
                            System.out.println("Ingrese:\nCurso:\nNombre:\nApellido:\nDNI:\nEstado civil: ");
                            personas.add(new Estudiantes(leer.nextLine(), leer.nextLine(), leer.nextLine(), leer.nextInt(), leer.nextLine() + leer.nextLine()));
                            break;
                        case "6":
                            break;
                        default:

                    }
                    break;
                case "2":
                    System.out.println("Ingrese el nombre de la persona");
                    String nombre = leer.nextLine();
                    for (Persona persona : personas) {
                        if (persona.getNombre().equalsIgnoreCase(nombre)) {
                            persona.cambioEstadoCivil();
                            break;
                        }
                    }
                    break;
                case "3":
                    System.out.println("Ingrese el nombre del empleado");
                    nombre = leer.nextLine();
                    for (Persona persona : personas) {
                        if (persona instanceof Empleado empleado) {
                            if (empleado.getNombre().equalsIgnoreCase(nombre)) {
                                empleado.nuevoDespacho();
                                System.out.println("se ha designado a " + empleado.getNombre()
                                        + " al despacho " + empleado.getNumeroDespacho());
                                break;
                            }
                        }
                    }
                    break;
                case "4":
                    System.out.println("Ingrese el nombre del estudiante");
                    nombre = leer.nextLine();
                    for (Persona persona : personas) {
                        if (persona instanceof Estudiantes) {

                            if (((Estudiantes) persona).getNombre().equalsIgnoreCase(nombre)) {
                                ((Estudiantes) persona).cambioCurso();
                                System.out.println("se ha designado a " + ((Estudiantes) persona).getNombre()
                                        + " al curso " + ((Estudiantes) persona).getCurso());
                                break;
                            }
                        }
                    }
                    break;
                case "5":
                    System.out.println("Ingrese el nombre del profesor");
                    nombre = leer.nextLine();
                    for (Persona persona : personas) {
                        if (persona instanceof Profesor profesor) {
                            if (profesor.getNombre().equalsIgnoreCase(nombre)) {
                                profesor.cambioDepartamento();
                                System.out.println("se ha designado a " + profesor.getNombre()
                                        + " al departamento " + profesor.getDepartamento());
                                break;
                            }
                        }
                    }
                    break;
                case "6":
                    System.out.println("Ingrese el nombre del personal de servicio");
                    nombre = leer.nextLine();
                    for (Persona persona : personas) {
                        if (persona instanceof Plimpieza plimpieza) {
                            if (plimpieza.getNombre().equalsIgnoreCase(nombre)) {
                                plimpieza.trasladoSeccion();
                                System.out.println("se ha designado a " + plimpieza.getNombre()
                                        + " a la seccion " + plimpieza.getSeccion());
                                break;
                            }
                        }
                    }
                    break;
                case "7":
                    System.out.println("Se muestran todas las personas");
                    mostrar(personas);
                    break;
                case "8":
                    System.out.println("Realmente desea salir? S/N");
                    op = leer.nextLine();
                    break;
                default:

            }
        } while (!op.equalsIgnoreCase("S"));

    }

    public static void mostrar(ArrayList<Persona> personas) {
        for (Persona persona : personas) {

            if (persona instanceof Estudiantes estudiantes) {
                System.out.println("==========ESTUDIANTE=========");
                System.out.println("Estudiante: " + persona.getNombre() + " " + persona.getApellidos());
                System.out.println("Se encuentra en " + estudiantes.getCurso() + " Grado");

            } else if (persona instanceof Plimpieza plimpieza) {
                System.out.println("==========PERSONAL LIMPIEZA=========");
                System.out.println("Personal de Limpieza: " + persona.getNombre() + " " + persona.getApellidos());
                System.out.println("Se encuentra en la seccion " + plimpieza.getSeccion());

            } else if (persona instanceof Profesor profesor) {
                System.out.println("==========PROFESOR=========");
                System.out.println("Profesor: " + persona.getNombre() + " " + persona.getApellidos());
                System.out.println("Se encuentra en el departamento " + profesor.getDepartamento());

            } else if (persona instanceof Empleado empleado) {
                System.out.println("==========EMPLEADO=========");
                System.out.println("Empleado: " + persona.getNombre() + " " + persona.getApellidos());
                System.out.println("Se encuentra en el despacho " + empleado.getNumeroDespacho());

            } else if (persona instanceof Persona) {
                System.out.println("==========PERSONA=========");
                System.out.println("Persona:" + persona.getNombre() + " " + persona.getApellidos());
                System.out.println("Su estado civil es " + persona.getEstadoCivil());

            }

        }
    }
}
