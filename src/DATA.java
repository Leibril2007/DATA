import java.util.ArrayList;

public class DATA {

    //BASE DE DATOS

    //Lista que almacena objatos llamada data que crea el objeto de una lista
    // el new sirve para llamar al metodo constructor de una clase

    public static ArrayList listaDeALumnos(){

        // La clase arrayList crea un objeto de la clase alumno.
        ArrayList<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno("Jose", "Orellana", 18));
        alumnos.add(new Alumno("Mynor", "Calderon", 16));
        alumnos.add(new Alumno("Hector", "Pocon", 19));
        alumnos.add(new Alumno("Danna", "Mijangos", 16));
        alumnos.add(new Alumno("Alberto", "Jimenes", 17));

        return alumnos;
    }




}
