package PrimeraEv.CleanConsole;

import java.util.Scanner;

public class Clean {

    public static void main(String[] args)  {

        Scanner in = new Scanner(System.in);

        System.out.print("Dime una palabra: ");
        String s = in.nextLine();


        //Añade lineas para dar la impresión de un borrado de la terminal.
        /*
        * System.out.print("\033[H\033[2J");
        * System.out.flush();
        */

       //Borrar la terminal (en blanco/vacío)
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            /*No hacer nada*/
        }
        System.out.println("Ha funcionado");
        System.out.println("El texto era este: " + s);
    }

}
