package PrimeraEv.Tarea2_Iteracion_P2.Ejercicio3;

import java.util.Scanner;

public class CuantosNyP {

    public static void main(String[] args) {
        int numero;
        int contadorPositivos=0;
        int contadorNegativos=0;
        Scanner in = new Scanner(System.in);

        for(int i = 1; i<=10 ; i++) {
            numero = in.nextInt();
            if (numero < 0)
                contadorNegativos++;
            else if (numero > 0)
                contadorPositivos++;
        }
        System.out.println(contadorPositivos);
        System.out.println(contadorNegativos);
    }
}
