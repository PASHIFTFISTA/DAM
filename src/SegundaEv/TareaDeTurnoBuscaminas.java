package SegundaEv;

import java.util.Arrays;
import java.util.Scanner;

public class TareaDeTurnoBuscaminas {

    static Character [][] buscaMinas;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String filas = in.nextLine();
        String columnas = in.nextLine();

        buscaMinas = new Character[Integer.parseInt(filas)][Integer.parseInt(columnas)];
        String minasOvidas;

        for (int i = 0; i < Integer.parseInt(columnas); i++) {

            minasOvidas=in.nextLine();

            for (int j = 0; j < Integer.parseInt(filas); j++) {

                buscaMinas[i][j] = minasOvidas.charAt(j);
            }
            System.out.println(Arrays.deepToString(buscaMinas));
        }

    }
}
