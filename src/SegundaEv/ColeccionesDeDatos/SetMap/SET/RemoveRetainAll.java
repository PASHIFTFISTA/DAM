package SegundaEv.ColeccionesDeDatos.SetMap.SET;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveRetainAll {

    public static void main(String[] args) {
        HashSet<String> conjuntoB = new HashSet <String>();
        HashSet<String> conjuntoN = new HashSet <String>();
        conjuntoB.addAll(Arrays.asList("Luis Inés Ana Beto".split(" ")));
        conjuntoN.addAll(Arrays.asList("Ana Beto Pedro".split(" ")));
        //Por aquí tu instrucción

        //Tambien se puede usar removeAll
        conjuntoN.retainAll(conjuntoB);

        //Conjunto resultante
        System.out.print("Conjunto Intersección:"+conjuntoN);

    }
}
