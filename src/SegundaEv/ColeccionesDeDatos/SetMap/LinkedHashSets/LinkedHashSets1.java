package SegundaEv.ColeccionesDeDatos.SetMap.LinkedHashSets;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class LinkedHashSets1 {
    public static void main(String[] args) {
        LinkedHashSet<String> numeros = new LinkedHashSet<>();
        numeros.addAll(Arrays.asList("Uno","Dos","Tres","Cuatro"));
        //Conjunto resultante
        for (String elto : numeros) {
            System.out.println(elto);
        }
    }
}
