package SegundaEv.ColeccionesDeDatos.SetMap.TreeSet;

import java.util.TreeSet;

public class TreeSets {
    public static void main(String[] args) {
        TreeSet<Integer> numeros = new TreeSet <> ();
        numeros.add(4);
        numeros.add(6);
        numeros.add(8);
        numeros.add(10);
        numeros.add(15);
        numeros.add(18);
        numeros.add(21);

        //Conjunto resultante
        for (Integer elto : numeros.descendingSet()) {//Metodo descendingSet, para contar integers en orden inverso.
            System.out.println(elto);
        }
    }
}
