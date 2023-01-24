package SegundaEv.ColeccionesDeDatos.ArrayList.EjercicioPrueba;

import java.util.ArrayList;

public class ArrayListSize {

    public static void main(String[] args) {
        ArrayList<String> miColeccion = new ArrayList<>();
        miColeccion.add("Collection");
        miColeccion.add("List");
        miColeccion.add("Set");
        miColeccion.add("SortedSet");
        miColeccion.add("Map");

        String ultimoElto= miColeccion.get(miColeccion.size()-1);
        //¿Cómo conseguir el último elemento

        System.out.println("El último elemento es: " + ultimoElto);
    }
}
