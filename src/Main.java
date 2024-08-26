import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Variable tipo ArrayList
        ArrayList alumnos = DATA.listaDeALumnos();

        /* Cada objeto en la lista alumnos, imprimelos*/
        for (Object cadaObjeto : alumnos){
            System.out.println(cadaObjeto);
        }

    }
}