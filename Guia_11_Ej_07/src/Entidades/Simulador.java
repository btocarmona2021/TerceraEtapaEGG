package Entidades;

/*
    La clase Simulador debe tener un método que genere un listado de alumnos manera
aleatoria y lo retorne. Las combinaciones de nombre y apellido deben ser generadas de
manera aleatoria. Nota: usar listas de tipo String para generar los nombres y los apellidos.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.ThreadLocalRandom;

public class Simulador {

    ThreadLocalRandom aleatorio = ThreadLocalRandom.current();

    ArrayList<Voto> votos = new ArrayList<>();
    ArrayList<Alumno> votados;

    public Simulador() {
    }

    public ArrayList<String> creaNombrecompleto(ArrayList<String> nombres, ArrayList<String> apellidos) {
        ArrayList<String> nombreCompleto = new ArrayList<>();
        for (int i = 0; i < nombres.size(); i++) {
            nombreCompleto.add(nombres.get(aleatorio.nextInt(0, nombres.size())) + " "
                    + apellidos.get(aleatorio.nextInt(0, apellidos.size())));

        }
        return nombreCompleto;
    }

    public ArrayList<Integer> crearListaDni(ArrayList<String> nombresCompletos) {

        HashSet<Integer> dniSinRepetir = new HashSet<>();

        for (int i = 0; i < nombresCompletos.size(); i++) {
            dniSinRepetir.add(aleatorio.nextInt(6000000, 45808747));
        }
        return new ArrayList(dniSinRepetir);
    }

    public ArrayList<Alumno> crearListaAlumno(ArrayList<String> nC, ArrayList<Integer> dnis) {
        ArrayList<Alumno> alumnos = new ArrayList<>();

        for (int i = 0; i < dnis.size(); i++) {
            alumnos.add(new Alumno(nC.get(i), dnis.get(i)));
        }
        return alumnos;
    }

    public void votacion(ArrayList<Alumno> alumnos) {
        int votado;

        for (int i = 0; i < alumnos.size(); i++) {
            int hecho = -1;
            votados = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                votado = aleatorio.nextInt(0, alumnos.size());
                while (votado == i || hecho == votado) {
                    votado = aleatorio.nextInt(0, alumnos.size());
                }
                alumnos.get(votado).setCantVotos(alumnos.get(i).getCantVotos() + 1);
                hecho = votado;

                votados.add(alumnos.get(votado));
            }
            votos.add(new Voto(alumnos.get(i), votados));
        }

    }

    public void mostrarAlumnos() {

        for (int i = 0; i < votos.size(); i++) {
            System.out.println("============VOTANTE==============");
            System.out.println(votos.get(i).getAlumno().getNombreCompleto());
            System.out.println("Tiene:" + votos.get(i).getAlumno().getCantVotos() + " votos");
            System.out.println("=======VOTÓ A:========");
            for (int j = 0; j < votos.get(i).getVotados().size(); j++) {
                System.out.println(votos.get(i).getVotados().get(j).getNombreCompleto() + " Tiene " + votos.get(i).getVotados().get(j).getCantVotos() + " votos");
            }
        }

    }

    public void recuentoVotos(ArrayList<Alumno> alumnos) {
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
    }

    public void crearCincoFacilitadores(ArrayList<Alumno> alumnos) {
        System.out.println("Hoy estan de facilitadores: ");
        System.out.println("===========================");

        for (int i = 0; i < 5; i++) {
            System.out.println("Facilitador " + (i + 1) + " " + alumnos.get(0).getNombreCompleto() + " Tiene: "
                    + alumnos.get(0).getCantVotos() + " votos" + " DNI: " + alumnos.get(0).getDni());
            alumnos.remove(0);
        }
        System.out.println("==========================");
        Collections.sort(alumnos, Alumno.comparaVotos);
        System.out.println("suplentes de facilitadores: ");
        System.out.println("===========================");

        for (int i = 0; i < 5; i++) {
            System.out.println("Suplente " + (0 + 1) + ": " + alumnos.get(0).getNombreCompleto() + " Tiene "
                    + alumnos.get(0).getCantVotos() + " Votos - DNI " + alumnos.get(0).getDni());
            alumnos.remove(0);
        }
        System.out.println("==========================");
        System.out.println("Alumnos que serán asistidos (ordenados por DNI)");
        System.out.println("==========================");
        Collections.sort(alumnos,Alumno.ordenaDNI);
        char letra='A';
        for (Alumno alumno : alumnos) {
            System.out.println(letra+") "+ alumno.getDni()+"=>"+alumno.getNombreCompleto()+" con-> " + alumno.getCantVotos() + " votos");
            letra=(char)(letra+1);
                    
        }

    }
}
