package PrimeraEv.Bucles.DoWhile;

public class Ejercicio2 {

    public static void main(String[] args) {
        int numprod=20;

        while (numprod<=80) {

            if (numprod % 5 == 0)
                System.out.println(numprod);
            numprod++;
        }
    }
}
