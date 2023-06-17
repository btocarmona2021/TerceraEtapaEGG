//Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, 
//Autor, Número de páginas, y un constructor con todos los atributos pasados por
//parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los 
//datos al usuario y luego informar mediante otro método el número de ISBN, el título,
//el autor del libro y el numero de páginas.

package Encuentro_13_14_15_16_17_18;

public class Libro {
    //atributos
    public String ISBN;
    public String titulo;
    public String autor;
    public int numeroPaginas;
    
    //constructor vacio
    public Libro(){
        
    }
    
    //constructor con todos los parametros
    public Libro(String ISBN, String titulo,String autor, int numeroPaginas){
        this.ISBN = ISBN;
        this.titulo=titulo;
        this.autor=autor;
        this.numeroPaginas=numeroPaginas;
        
    }
    
    public void cargar(String ISBN, String titulo,String autor, int numeroPaginas){
        
        this.ISBN = ISBN;
        this.titulo=titulo;
        this.autor=autor;
        this.numeroPaginas=numeroPaginas;
    }
    
    public void mostrar (){
        System.out.println("ISBN = " +this.ISBN);
        System.out.println("Titulo = "  + this.titulo);
        System.out.println("Autor = " + this.autor);
        System.out.println("Cantidad de Páginas = " + this.numeroPaginas);
    }
         
    
    
}
