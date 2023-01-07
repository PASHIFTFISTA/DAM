package PrimeraEv.Tarea2_Iteracion_P2.Ejercicio2;

import java.util.Scanner;
public class Factoriales {

    public  static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int factorial = in.nextInt();
        System.out.println(Factoriales.factorial(factorial));
    }
     static int factorial(int factorial){
        for (int i = factorial-1; i > 0 ; i-- ){
                factorial *= i;
        }
        if (factorial==0)
            factorial=1;
        return factorial;
    }
}
