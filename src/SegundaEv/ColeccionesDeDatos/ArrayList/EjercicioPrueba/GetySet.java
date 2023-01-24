package SegundaEv.ColeccionesDeDatos.ArrayList.EjercicioPrueba;

import java.util.ArrayList;

public class GetySet {

    public static void main(String[] args) {
        ArrayList<String> miColeccion = new ArrayList<String>();
        miColeccion.add("Collection");
        miColeccion.add("List");
        miColeccion.add("Set");
        miColeccion.add("SortedSet");
        miColeccion.add("Map");

        //Por tu código aquí
        /* Ejemplo largo, se puede depurar.
        String aux = miColeccion.get(2);
        miColeccion.set(2, miColeccion.get(1));
        miColeccion.set(1,aux);
        */


        //Metodo mejor.
        miColeccion.add(miColeccion.remove(0));

        // Para imprimir la lista tras el cambio
        for (String elto : miColeccion) {
            System.out.println(elto);
        }
    }
}
