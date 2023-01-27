package SegundaEv.ColeccionesDeDatos.List.Envoltorios;

import java.util.ArrayList;
import java.util.Collections;

public class Ej_Rotar_Rotate {
    public static void main(String[] args) {
        ArrayList<String> miColeccion = new ArrayList<>();
        miColeccion.add("Collection");
        miColeccion.add("List");
        miColeccion.add("Set");
        miColeccion.add("SortedSet");
        miColeccion.add("Map");
        System.out.println("Lista inicial: ");
        for (String elto : miColeccion) {
            System.out.print(elto + " ");
        }
        System.out.println();
// Pon tu código aquí




        Collections.rotate(miColeccion,3);

        System.out.println("Lista Final: ");
        for (String elto : miColeccion) {
            System.out.print(elto + " ");
        }
    }
}
