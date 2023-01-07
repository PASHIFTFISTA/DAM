package PrimeraEv.Tarea2_Iteracion1.Ejercicio2;

public class numeros200 {
    public static void main(String[] args) {
        int contador=1;
        int numfinal=200;

        while (contador <= numfinal) {

            if (contador %2 == 0){
            System.out.println(contador);}

            contador = contador +1;
        }
    }
}
