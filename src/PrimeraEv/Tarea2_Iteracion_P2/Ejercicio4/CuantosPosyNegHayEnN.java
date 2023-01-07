package PrimeraEv.Tarea2_Iteracion_P2.Ejercicio4;

import java.util.Scanner;

public class CuantosPosyNegHayEnN {
    public static void main(String[] args) {
        int numero;
        int contadorPositivos=0;
        int contadorNegativos=0;
        Scanner in = new Scanner(System.in);
        int cantNumeros = in.nextInt();

        for( int i=1; i<=cantNumeros ; i++) {
            numero = in.nextInt();
            if (numero < 0)
                contadorNegativos++;
            else if (numero > 0)
                contadorPositivos++;
            else break;
        }
        System.out.println(contadorPositivos);
        System.out.println(contadorNegativos);
    }
}
