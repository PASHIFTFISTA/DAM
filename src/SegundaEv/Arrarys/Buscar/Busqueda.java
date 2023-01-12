package SegundaEv.Arrarys.Buscar;

import java.util.Arrays;

public class Busqueda {

    public static void main(String[] args) {

        int [] puzzle = {1,2,4,5,6};
        Arrays.sort(puzzle);
        int pieza=0;

        for (int i = 0; i < puzzle.length; i++) {

            if (puzzle[i] != i + 1) {
                pieza = i + 1;
                i=puzzle.length;
            }
        }
        System.out.println("La pieza faltante es la Nº"+Math.abs(Arrays.binarySearch(puzzle, pieza)));

    }
}
