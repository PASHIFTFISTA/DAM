package PrimeraEv.Bucles.DoWhile;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int value;

        do {
            System.out.println("Enter an Integer value between 0 and 100 both included: ");
            value = in.nextInt();
        }
        while (value > 100  || value < 0);// No olvidar usar OR ||
        System.out.println("Thx for entering a number!!!!");

    }
}