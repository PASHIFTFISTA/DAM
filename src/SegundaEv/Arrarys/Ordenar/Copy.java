package SegundaEv.Arrarys.Ordenar;

import java.util.Arrays;

public class Copy {
    public static void main(String[] args) {
        int[] primes = { 1, 2, 3, 5, 7, 11, 13, 17, 19, 23 };
        int[] c = new int[ primes.length ];
        System.arraycopy( primes, 1, c, 3, 6);     // copy array primes to array c

        System.out.println(Arrays.toString(primes));
        System.out.println(Arrays.toString(c));
    }
}
