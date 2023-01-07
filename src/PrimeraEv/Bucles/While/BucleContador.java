package PrimeraEv.Bucles.While;

import java.util.Scanner;

public class BucleContador {

    public static void main(String[] args) {
        int value = 100;
        Scanner in = new Scanner(System.in);

        while (value >= 100){
            System.out.println("Enter a value < 100: ");
            value=in.nextInt();
        }// Mirar Clase DoWhile
    }
}
