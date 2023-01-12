package SegundaEv.Arrarys.Ordenar;

import java.util.Arrays;

public class Burbuja {
    public static void main(String[] args) {
        int[] sueldos = {1200, 750, 3000, 550, 490};

        int aux;

        System.out.println("El Array desordenado es: " + Arrays.toString(sueldos));
        for (int k = 0; k < 3; k++) {
            // Implementa el algoritmo que acabas de ver en la parte teórica
            for (int f = 0; f < (sueldos.length - 1) - k; f++) {

                if (sueldos[f] > sueldos[f + 1]) {
                    aux = sueldos[f];
                    sueldos [f] = sueldos [f+1];
                    sueldos[f + 1] = aux;
                }
            }
        }
        System.out.println("El Array ordenado es: " + Arrays.toString(sueldos));
        System.out.println("El mayor sueldo de todos es: " + sueldos[sueldos.length - 1]);
    }
}
