package PrimeraEv.Bucles.DoWhile;

public class Ejercicio1V2  {

    public static void main(String[] args) {

        int circle = 1;

        while (circle<=25){

            if (circle%5 == 0)
                System.out.println("*");
            else
                System.out.print("*");
            circle++;
        }
    }

}
