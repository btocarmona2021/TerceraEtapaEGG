package Vistas;

import Entidades.Poliza;
import java.util.ArrayList;
import java.util.Scanner;

public class PolizasTest {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Poliza> polizas = new ArrayList<>();
        String opcion;
        do {
            System.out.println("===========================");
            System.out.println("    Elija una opción       ");
            System.out.println("---------------------------");
            System.out.println(" 1. Crear nueva poliza     ");
            System.out.println(" 2. Consultar cliente      ");
            System.out.println(" 3. Consultar Cuotas       ");
            System.out.println(" 4. Pagar Cuotas           ");
            System.out.println(" 5. Salir                  ");
            System.out.println("===========================");
            opcion = leer.nextLine();
            switch (opcion) {
                case "1":
                    polizas.add(new Poliza());
                    break;
                case "2": {
                    System.out.println("Ingrese el numero de Cliente a consultar");
                    int cliente = leer.nextInt() - 1;
                    leer.nextLine();
                    System.out.println(polizas.get(cliente).getCliente());
                }
                break;
                case "3": {
                    System.out.println("Ingrese el numero de Cliente a consultar");
                    int cliente = leer.nextInt() - 1;
                    leer.nextLine();
                    System.out.println(polizas.get(cliente).getCantCuotas());
                }
                break;
                case "4": {
                    System.out.println("Ingrese el numero de Cliente");
                    int cliente = leer.nextInt() ;
                    leer.nextLine();
                    for (int i = 0; i < polizas.get(cliente-1).getCantCuotas().size(); i++) {
                        if (polizas.get(cliente-1).getCantCuotas().get(i).isPagado()==false) {
                            System.out.println("Esta adeudando la cuota "+ (i+1)+ " vence el " + 
                                    polizas.get(cliente-1).getCantCuotas().get(i).getFechaVencimiento()+" desea abonarla Si/no");
                            String resp= leer.nextLine();
                            if (resp.equalsIgnoreCase("si")) {
                                polizas.get(cliente-1).getCantCuotas().get(i).setPagado(true);
                            }
                        }
                    }
                    System.out.println(polizas.get(cliente-1).getCantCuotas());
                }
                break;

                case "5":
                    System.out.println("Esta seguro de salir SI/NO");
                    opcion = leer.nextLine();
                    break;
                default:

            }
        } while (!opcion.equalsIgnoreCase("Si"));
    }

}
