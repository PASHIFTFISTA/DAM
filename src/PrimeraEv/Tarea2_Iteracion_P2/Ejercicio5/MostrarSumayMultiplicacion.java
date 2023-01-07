package PrimeraEv.Tarea2_Iteracion_P2.Ejercicio5;


public class MostrarSumayMultiplicacion {
    public static void main(String[] args) {

        int suma=0;
        int multiplicacion=1;

        for (int i = 1; i<=10 ; i++ ) {
            suma += i;
            multiplicacion *= i;
        }
        System.out.println(suma);
        System.out.println(multiplicacion);
    }
}
