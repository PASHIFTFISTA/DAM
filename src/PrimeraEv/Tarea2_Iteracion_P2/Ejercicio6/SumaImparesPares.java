package PrimeraEv.Tarea2_Iteracion_P2.Ejercicio6;

public class SumaImparesPares {
    public static void main(String[] args) {

        int sumaImpar=0;
        int sumaPar=0;

        for (int i = 100; i<=200; i++){

            if (i%2==0)
                sumaPar+=i;
            else
                sumaImpar+=i;
        }
        System.out.println(sumaPar);
        System.out.println(sumaImpar);
    }
}
