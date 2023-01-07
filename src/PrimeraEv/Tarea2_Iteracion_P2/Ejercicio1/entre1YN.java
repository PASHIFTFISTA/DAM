package PrimeraEv.Tarea2_Iteracion_P2.Ejercicio1;

import java.util.Scanner;

public class entre1YN {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numeroMaximo = in.nextInt();
        for (int i=1; i <= numeroMaximo; i++)
            System.out.println(i);
    }
}
