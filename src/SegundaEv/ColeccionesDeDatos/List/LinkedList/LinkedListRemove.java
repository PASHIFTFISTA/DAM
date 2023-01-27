package SegundaEv.ColeccionesDeDatos.List.LinkedList;

import java.util.LinkedList;

public class LinkedListRemove {
    public static void main(String[] args) {
        LinkedList<String> miColeccion = new LinkedList<>();
        miColeccion.add("Collection");
        miColeccion.add("List");
        miColeccion.add("Set");
        miColeccion.add("SortedSet");
        miColeccion.add("Map");
        miColeccion.add("List");

        while (miColeccion.remove("List"));

        System.out.println(miColeccion);
    }
}
