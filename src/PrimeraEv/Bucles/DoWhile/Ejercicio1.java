package PrimeraEv.Bucles.DoWhile;

public class Ejercicio1 {
    public static void main(String[] args) {

        int circle = 0;

        do {

            circle++;
            if (circle%5 == 0)
                System.out.println("*");
            else
                System.out.print("*");
        }
        while (circle<=24);
    }
}
