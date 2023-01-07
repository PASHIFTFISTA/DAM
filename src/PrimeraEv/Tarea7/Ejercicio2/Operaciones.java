package PrimeraEv.Tarea7.Ejercicio2;

import java.util.Scanner;

public class Operaciones {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int suma = num1 + num2;
        int resta = num1 - num2;
        int mult = num1 * num2;

        System.out.println(suma);
        System.out.println(resta);
        System.out.println(mult);

        if (num2==0)
            System.out.println("ERROR: Numero/0");
        else
            System.out.println(num1 / num2);
    }
}
