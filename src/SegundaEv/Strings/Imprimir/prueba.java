package SegundaEv.Strings.Imprimir;

import java.util.Arrays;

public class prueba {
    public static void main(String[] args) {
        int [] numeros = {1,4,9,7,3,2,5,11,0,9};
        int [] aux = numeros.clone();

        int a;
//Utiliza este for para realizar el intercambio tal y como muestra el gráfico
        for (int i = 0; i < numeros.length/2; i++) { //Solo nos interesa la mitad de operaciones, ya que el índice total es par (10).
            //Con únicamente bucle, intercambiando el índice.
            a = numeros [numeros.length/2+i];
            numeros[numeros.length/2+i]= numeros[i];
            numeros[i]=a;

            //Si tuviéramos números impares podría considerar declarar una variable booleana que nos diga si es impar
            //Con eso, podríamos abrir dos caminos, uno en el que tomamos la parte entera y otro en el que tomamos el número siguiente.
        }
        System.out.println(Arrays.toString(numeros));
    }
}
