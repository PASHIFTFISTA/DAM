package PrimeraEv.Tarea2_Iteracion_P2.Ejercicio7;

import java.util.Scanner;

public class PotenciaFormato {
    public static void main(String[] args) {

        float myFloat;
        int potencia;
        float resultado=1;

        Scanner in = new Scanner(System.in);
        myFloat= in.nextFloat();
        potencia= in.nextInt();

        for (int i = potencia; i>0; i--){
            resultado*=myFloat;
        }
        System.out.printf("%.02f",resultado);
    }
}
