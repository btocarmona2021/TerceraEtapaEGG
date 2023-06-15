package entidad;

public final class Estudiantes extends Persona {

    private String curso;

    public Estudiantes() {
    }

    public Estudiantes(String curso, String nombre, String apellidos, long dni, String estadoCivil) {
        super(nombre, apellidos, dni, estadoCivil);
        this.curso = curso;
    }

    public void cambioCurso() {
        System.out.println("Ingrese el nuevo curso");
        this.curso = leer.nextLine();
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Curso= ").append(curso);
        return sb.toString();
    }

}
