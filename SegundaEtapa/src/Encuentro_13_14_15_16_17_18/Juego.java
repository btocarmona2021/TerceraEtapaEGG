//Crea una clase "Juego" que tenga un método "iniciar_juego" que permita
//a dos jugadores jugar un juego de adivinanza de números. El primer
//jugador elige un número y el segundo jugador intenta adivinarlo. El
//segundo jugador tiene un número limitado de intentos y recibe una pista
//de "más alto" o "más bajo" después de cada intento. El juego termina
//cuando el segundo jugador adivina el número o se queda sin intentos.
//Registra el número de intentos necesarios para adivinar el número y el
//número de veces que cada jugador ha ganado
package Encuentro_13_14_15_16_17_18;

import java.util.Scanner;

public class Juego {

    private int numero; //20
    private int intentos = 0; //+1
    private final int MAXINTENTOS = 5;

    public Juego() {

    }

    public void iniciarJuego(int numero) { //20
        this.numero = numero;
        Scanner leer = new Scanner(System.in);

        while (numero != this.numero) {

            if (this.MAXINTENTOS > intentos) {
                this.intentos++;
                if (this.numero > numero) {
                    System.out.println("Ingresa un numero mas alto");
                    numero = leer.nextInt();
                } else {
                    System.out.println("Ingresa un numero mas bajo");
                    numero = leer.nextInt();
                }

            } else {
                System.out.println("Has agotado los intentos");
                break;
            }
        }

        if (this.numero == numero) {
            System.out.println("Genial hasta adivinado el numero");
        }

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void suma(int num1, int num2) {

        System.out.println(num1 + num2);
        System.out.println("el dia esta bonito");

    }

}
