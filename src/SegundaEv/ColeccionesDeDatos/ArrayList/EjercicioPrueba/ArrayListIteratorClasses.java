package SegundaEv.ColeccionesDeDatos.ArrayList.EjercicioPrueba;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteratorClasses {
    public static void main(String[] args) {
        ArrayList<String> miColeccion = new ArrayList<String>();
        miColeccion.add("Collection");
        miColeccion.add("List");
        miColeccion.add("Set");
        miColeccion.add("SortedSet");
        miColeccion.add("Map");

        String elto;
        Iterator<String> paseador = miColeccion.iterator();

        while (paseador.hasNext()){

            elto = paseador.next();//Método .next para pasar al siguiente elemento.

            if (elto.contains("s")||elto.contains("S")){
                paseador.remove();
            }
            else{
            System.out.println(elto);
            }
        }
    }
}
