package PrimeraEv.Tarea7.Ejercicio3;

import java.util.Scanner;

public class Ascendentes {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();

        if (num1>num2) {
            System.out.println(num2);
            System.out.println(num1);
        }
        else {
            System.out.println(num1);
            System.out.println(num2);
        }
    }
}
