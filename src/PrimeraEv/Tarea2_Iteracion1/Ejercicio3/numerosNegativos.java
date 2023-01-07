package PrimeraEv.Tarea2_Iteracion1.Ejercicio3;

import java.util.Scanner;

public class numerosNegativos {

    public static void main(String[] args) {
        int count=1;
        Scanner in = new Scanner(System.in);
        String resultado="NO";
        while (count <= 10){
            int numero = in.nextInt();
            count +=1;
            if (numero<0)
                resultado = "SI";
        }
        System.out.print(resultado);
    }
}
