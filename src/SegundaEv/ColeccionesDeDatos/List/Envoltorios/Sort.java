package SegundaEv.ColeccionesDeDatos.List.Envoltorios;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {
    public static void main(String[] args) {
        ArrayList<String> miColeccion = new ArrayList<>();
        miColeccion.add("Alto");
        miColeccion.add("Collection");
        miColeccion.add("List");
        miColeccion.add("Set");
        miColeccion.add("Alpha");
        miColeccion.add("SortedSet");
        miColeccion.add("Map");
        Collections.sort(miColeccion);
        for (String elto : miColeccion) {
            System.out.println(elto);
        }
    }
}
