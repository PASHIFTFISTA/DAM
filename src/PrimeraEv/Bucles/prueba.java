package PrimeraEv.Bucles;

public class prueba {

    public static void main(String[] args) {
        int n = 10265;
        int sum = 0;
        int contador = 0;
        int impar= contador;

        while (n>0){

            contador++;
            int digit = n % 10;
            n = n / 10;

            if (impar == 0 )
                sum = sum + digit;

            impar = contador % 2;
        }

        System.out.println(sum);
    }
}
