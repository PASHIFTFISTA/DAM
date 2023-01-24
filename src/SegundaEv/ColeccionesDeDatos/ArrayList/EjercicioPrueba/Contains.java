package SegundaEv.ColeccionesDeDatos.ArrayList.EjercicioPrueba;

import java.util.ArrayList;
import java.util.Scanner;

public class Contains {

    public static void main(String[] args) {
        ArrayList<String> miColeccion = new ArrayList<String>();
        miColeccion.add("Collection");
        miColeccion.add("List");
        miColeccion.add("Set");
        miColeccion.add("SortedSet");
        miColeccion.add("Map");

        Scanner sc = new Scanner (System.in);
        System.out.print("Introduce un elemento: ");
        String entrada = sc.nextLine();
        boolean esta = false;

        // Da valor a la variable "esta" para saber si el elemento introducido
        // está o no dentro de la lista

        esta = miColeccion.contains(entrada);


        //Mensaje final
        System.out.println(esta?"Está":"No está");
    }
}
