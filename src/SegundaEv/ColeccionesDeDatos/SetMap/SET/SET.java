package SegundaEv.ColeccionesDeDatos.SetMap.SET;

import java.util.HashSet;

public class SET {//Son conjuntos que no pueden contener elementos repetidos.

        public static void main(String[] args) {
            HashSet<String> conjuntoB = new HashSet <String>();
            HashSet<String> conjuntoN = new HashSet<String>();
            conjuntoB.add("Luis");
            conjuntoB.add("Inés");
            conjuntoB.add("Ana");
            conjuntoB.add("Beto");
            conjuntoN.add("Ana");
            conjuntoN.add("Beto");
            conjuntoN.add("Pedro");
            conjuntoN.add("Pedro");

            System.out.print("Conjunto B: ");
            for (String elto : conjuntoB) {
                System.out.print(elto + " ");
            }
            System.out.println();
            System.out.print("Conjunto N: ");
            for (String elto : conjuntoN) {
                System.out.print(elto + " ");
            }
        }


}
