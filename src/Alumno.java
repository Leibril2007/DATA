public class Alumno {

    //PROPIEDADES
    private String nombre;
    private String apellido;
    private int edad;

    //CONSTRUCTOR
    public Alumno(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    //GETTERS
    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public int getEdad() {
        return this.edad;
    }

    //SETTERS
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
