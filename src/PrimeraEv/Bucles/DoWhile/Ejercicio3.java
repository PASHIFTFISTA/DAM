package PrimeraEv.Bucles.DoWhile;

public class Ejercicio3 {

    public static void main(String[] args) {
        int numero=100;

        while (numero>=50) {

            if (numero % 2 == 0)
                System.out.println(numero);
            numero--;
        }
    }
}
