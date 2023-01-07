package PrimeraEv.Bucles.For;

public class Multiplicar {

    public static void main(String[] args) {

        int multiplo = 7;
        int i;
        for (int i2=0;i2<11;i2++){

            for (i=0;i<11;i++) {
                System.out.println(multiplo + " * "+i + " = " + multiplo * i);
                if (multiplo==0 || multiplo==11)
                    multiplo=1;
                if (i==10)
                    multiplo++;
                else if (multiplo>=10)

                    multiplo=10;
            }
        }

    }

}
