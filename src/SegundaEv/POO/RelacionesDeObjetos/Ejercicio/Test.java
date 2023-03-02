package SegundaEv.POO.RelacionesDeObjetos.Ejercicio;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Libro Quijote = new Libro("Quijote",126533627,"Cervantes",1573, 100);

        Scanner in = new Scanner(System.in);


        System.out.println("Escribe el contenido de la pagina: ");
        String contenido = in.nextLine();

        System.out.println("Dime el numero de pagina: ");
        int numpag= in.nextInt();


        Quijote.añadirPagina(contenido, numpag);


        Quijote.mostrarLibro();





    }



}
