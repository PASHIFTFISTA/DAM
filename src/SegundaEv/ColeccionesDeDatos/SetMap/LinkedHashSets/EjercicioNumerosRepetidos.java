package SegundaEv.ColeccionesDeDatos.SetMap.LinkedHashSets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class EjercicioNumerosRepetidos {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String entrada = in.nextLine();

        HashSet<String> mapsh = new HashSet<>(Arrays.asList(entrada.split(" ")));

        System.out.println(mapsh.size());

    }
}
