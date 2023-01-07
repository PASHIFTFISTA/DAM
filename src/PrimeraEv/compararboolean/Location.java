package PrimeraEv.compararboolean;

import java.util.Scanner;

public class Location {

    public static void main(String[] args) {

        Scanner xy = new Scanner(System.in);

        System.out.println("Dime, del 1 al 9 tu poscición de coordenada en y: ");
        int y = xy.nextInt();

        System.out.println();

        System.out.println("Dime, del 1 al 9 tu poscición de coordenada en x: ");
        int x = xy.nextInt();

        if (x>3 && y>3 && y<7 && x<7)
            System.out.println("Color azul ");
        else
            System.out.println("Color blanco ");
        if (x==3 || y==3)
            System.out.println("Los dos son 3 ");

    }
}
