package vista;

import java.util.Scanner;

public class DivisionNumero {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String numero1 = leer.nextLine();
        String numero2 = leer.nextLine();
        int num1=0;
        int num2=0;
        double resultado=0;
        try {
            num1 = Integer.parseInt(numero1);
            num2 = Integer.parseInt(numero2);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            System.out.println(e);
        }
        
        try {
            resultado=num1/num2;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println(e);
            
        }
        System.out.println("el resultado es " + resultado);

    }

}
