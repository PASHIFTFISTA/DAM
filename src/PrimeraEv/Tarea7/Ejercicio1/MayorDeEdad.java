package PrimeraEv.Tarea7.Ejercicio1;

import java.util.Scanner;

public class MayorDeEdad {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int edad = in.nextInt();

        if (edad >= 18)
            System.out.println("Eres mayor de edad");
        else
            System.out.println("Eres menor de edad");
    }
}
