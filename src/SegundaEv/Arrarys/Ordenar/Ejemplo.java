package SegundaEv.Arrarys.Ordenar;

public class Ejemplo {
    public static void main(String[] args) {

        int[] listado1 = {6, 2, 3, 1, 4, 5, 7};
        int[] listado2 = {1, 2, 3, 4, 5, 6, 7};
        boolean isSort = false;

        // Implementa una forma de saber si el array está ordenado o no
        // Almacena el resultado en la variable isSort

        for (int i = 0; i < listado1.length - 1; i++) {

            isSort = listado1[i] < listado1[i + 1];

            if (!isSort) {
                i = listado1.length;
            }
        }
        if (isSort)
            System.out.println("El vector está ordenado");
        else
            System.out.println("El vector NO está ordenado");
    }
}