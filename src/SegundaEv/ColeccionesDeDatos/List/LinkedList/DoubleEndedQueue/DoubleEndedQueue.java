package SegundaEv.ColeccionesDeDatos.List.LinkedList.DoubleEndedQueue;

import java.util.ArrayDeque;

public class DoubleEndedQueue {
    public static void main(String[] args) {
        int [] ListadoInicial = {1,2,3,4,5,6,7,8,9,10};
        ArrayDeque <Integer> ListadoFinal = new ArrayDeque<>();
        for (Integer elto : ListadoInicial) {
//Por tú código aquí
            if (elto%2==0){
                ListadoFinal.addFirst(elto);
            }
            else {
                ListadoFinal.addLast(elto);
            }
        }
        System.out.println("Resultado Final:");
        for (Integer elto : ListadoFinal) {
            System.out.print(elto + " ");
        }
    }

}
