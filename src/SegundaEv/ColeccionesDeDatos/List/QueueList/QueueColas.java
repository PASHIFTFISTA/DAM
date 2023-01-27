package SegundaEv.ColeccionesDeDatos.List.QueueList;

import java.util.LinkedList;


public class QueueColas {
    public static void main(String[] args) {
        LinkedList <String> miColeccion = new LinkedList<>();
        miColeccion.add("Collection");
        miColeccion.add("List");
        miColeccion.add("Set");
        miColeccion.add("SortedSet");
        miColeccion.add("Map");

        System.out.println("Primer Elemento: "+miColeccion.poll());


        miColeccion.add(miColeccion.poll());
        System.out.println("Resto de elementos:");
        for (String elto : miColeccion) {
            System.out.println(elto);
        }
    }
}
