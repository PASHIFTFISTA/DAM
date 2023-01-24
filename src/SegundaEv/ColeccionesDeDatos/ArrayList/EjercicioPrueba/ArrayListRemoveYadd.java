package SegundaEv.ColeccionesDeDatos.ArrayList.EjercicioPrueba;

import java.util.ArrayList;

public class ArrayListRemoveYadd {
    public static void main(String[] args) {
        ArrayList<String> miColeccion = new ArrayList<>();
        miColeccion.add("Collection");
        miColeccion.add("List");
        miColeccion.add("Set");
        miColeccion.add("SortedSet");
        miColeccion.add("Map");

        // Para imprimir la lista tras la rotación, recuerda las operaciones remove y add
        miColeccion.add(miColeccion.size(), miColeccion.get(0));
        miColeccion.remove(0);
        // El resultado debería ser: List, Set, SortedSet, Map y Collection
        for (String elto : miColeccion) {
            System.out.println(elto);
        }
    }
}
