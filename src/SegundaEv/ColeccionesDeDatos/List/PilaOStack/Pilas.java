package SegundaEv.ColeccionesDeDatos.List.PilaOStack;

import java.util.Stack;

public class Pilas {
    public static void main(String[] args) {
        Stack<String> miColeccion = new Stack<>();
        miColeccion.push("Collection");
        miColeccion.push("List");
        miColeccion.push("Set");
        miColeccion.push("SortedSet");
        miColeccion.push("Map");

        while (!miColeccion.isEmpty()){
//Pon tu código aquí
            System.out.println(miColeccion.pop());
        }
    }
}
