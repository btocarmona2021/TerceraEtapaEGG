package vista;

public class Test {

    public static void main(String[] args) {

        String[] nombre = new String[3];
        nombre[0] = "Daniel";
        nombre[1] = "Fernando";
        nombre[2] = "Natalia";
        
         try {
            nombre[3] = "Camilo";
        } catch (Exception e) {
             System.out.println(e.getMessage());
        }
       

    }
    
 

}
