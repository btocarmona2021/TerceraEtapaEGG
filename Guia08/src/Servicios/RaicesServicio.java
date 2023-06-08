package Servicios;

import Entidades.Raices;

public class RaicesServicio {


    public double getDiscriminante(Raices raiz) {
        double A = raiz.getCoeficienteA();
        double B = raiz.getCoeficienteB();
        double C = raiz.getCoeficienteC();
        return (Math.pow(B, 2)) - 4 * A * C;
    }

    public boolean tieneRaices(Raices raiz) {
        boolean discriminante;
        if (this.getDiscriminante(raiz) >= 0) {
            discriminante = true;
        } else {
            discriminante = false;
        }
        return discriminante;
    }

    public boolean tieneRaiz(Raices raiz) {
        boolean discriminante;
        if (this.getDiscriminante(raiz) == 0) {
            discriminante = true;
        } else {
            discriminante = false;
        }
        return discriminante;
    }

    public void obtenerRaices(Raices raiz) {

        if (tieneRaices(raiz) == true) {
            System.out.println("Se puede resolver empleando (-b-√((b^2)4*a*c)))/(2*a)");
            System.out.println("Tambien se puede resolver empleando");
            System.out.println("Se puede resolver empleando (-b+√((b^2)4*a*c)))/(2*a)");
            System.out.println("=====================================================");
        }
    }

    public void obtenerRaiz(Raices raiz) {
        if (tieneRaiz(raiz) == true) {
            System.out.println("Se puede resolver SOLO empleando (-b-√((b^2)4*a*c)))/(2*a)");
            System.out.println("============================================================");
        }
    }

    public void calcular(Raices raiz) {

        if (tieneRaices(raiz) == true) {

            obtenerRaices(raiz);
        } else if (tieneRaiz(raiz) == true) {
            obtenerRaiz(raiz);
        } else {
            System.out.println("La ecuacion no tiene solución");
            System.out.println("==============================");
        }

    }

}
