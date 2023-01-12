package SegundaEv.Arrarys.TareaArrays1.Ejercicio1;

import java.util.Scanner;

public class Main {
    int [] notas;
    Scanner sc;
    public void pedirNotas (int cantidad){
        sc = new Scanner (System.in);
        notas = new int [cantidad];

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Introduzca la nota del alumno %d: ",i+1);
            notas[i]=sc.nextInt();
        }
    }
    /* TODO: Programa este método para que calcule la diferencia entre
     * la nota mas alta y la mas baja
     */
    public void calcularDiferencia (){
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for (int nota : notas) {
            if (mayor < nota) {
                mayor = nota;
            }
            if (menor > nota) {
                menor = nota;
            }
        }

        System.out.println("La diferencia es: " + (mayor - menor));
    }
    public static void main(String[] args) {
        Main ejemplo = new Main();
        args = new String[1];
        args [0] = "5";
// Averigua cómo introducir un número en args[0] desde eclipse
        int elementos = Integer.parseInt(args[0]);
        System.out.println("Dime la cantidad de alumnos: " + elementos);
        ejemplo.pedirNotas(elementos);
        ejemplo.calcularDiferencia();
    }
}
