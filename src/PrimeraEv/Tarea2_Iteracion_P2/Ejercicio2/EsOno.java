package PrimeraEv.Tarea2_Iteracion_P2.Ejercicio2;

import java.util.Scanner;
public class EsOno {

    public  static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero = in.nextInt();
        System.out.println(EsOno.esPrimo(numero));
    }
    public static boolean esPrimo (int numero){
        //Estos no son primos, así que descartamos directamente estos numeros.
        if (numero==1 || numero==0 || numero==4) {
            return false;
        }
        for (int i = 2; i < numero / 2; i++) {
            if (numero % i == 0)
                return false;
        }
        return true;//Habiendo descartado que el numero introducido no es primo, podemos retornar TRUE
    }
}
