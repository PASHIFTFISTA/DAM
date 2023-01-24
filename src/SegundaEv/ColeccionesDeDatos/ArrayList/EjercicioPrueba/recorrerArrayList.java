package SegundaEv.ColeccionesDeDatos.ArrayList.EjercicioPrueba;

import java.util.ArrayList;

public class recorrerArrayList {

    public static void main(String[] args) {
        ArrayList<String> miColeccion = new ArrayList<>();
        miColeccion.add("Collection");
        miColeccion.add("List");
        miColeccion.add("Set");
        miColeccion.add("SortedSet");
        miColeccion.add("Map");

        for (String elto : miColeccion) {
            System.out.println(elto);
        }
    }
}
