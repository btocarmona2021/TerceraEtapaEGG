package Entidades;

import java.awt.Image;
import java.awt.Toolkit;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Utilidad {
   
    private static Scanner leer;
    private static ThreadLocalRandom aleatorio;
    
    static {
        leer = new Scanner(System.in).useDelimiter("\n");
        aleatorio = ThreadLocalRandom.current();
    }
    public static Scanner leer() {
        return leer;
    }

    public static ThreadLocalRandom numero() {
       
        return aleatorio;
    }

    public static LocalDate fecha(int anio, int mes, int dia) {
        LocalDate fecha = LocalDate.of(anio, mes, dia);
        return fecha;
    }

    public static int sumaEnteros(int num1, int num2) {
        return num1 + num2;
    }

    public static double sumaDoubles(double num1, double num2) {
        return num1 + num2;
    }

    public static double area(double lado1, double lado2) {
        return lado1 * lado2;
    }

    public static double formateaDecimal(double numero, int decimales) {

        double formateado = Double.parseDouble(String.format("%." + decimales + "f", numero).replaceAll(",", "."));

        return formateado;
    }

    public static Image getIconImage() {

        Image seteaIcono = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Resources/buscar.png"));

        return seteaIcono;
    }
    
    public static void imagenenLabel(JLabel label,String urlImagen){
        
        ImageIcon imagen=new ImageIcon(urlImagen);
        Icon icono= new ImageIcon(imagen.getImage().getScaledInstance(label.getWidth(),label.getHeight(), Image.SCALE_DEFAULT));
        label.setIcon(icono);
    }

}
