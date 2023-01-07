package PrimeraEv.Tarea2_Iteracion1.Ejercicio4;

import java.util.Scanner;

public class hay10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String resultado="NO";
        int numero;
        do {
            numero = in.nextInt();
            if (numero==10)
                resultado="SI";
        }
        while (numero !=-1);
        System.out.println(resultado);
    }
}
