package PrimeraEv.compararnull;

import java.util.Scanner;

public class Null_Alcalde {

    public static void main(String[] args) {

        Scanner str = new Scanner(System.in);

        System.out.print("El alcalde ha dicho: ");
        String comment = str.nextLine();

        if (comment.equals("") )//Las comillas vacías indican nada en el espacio asignado.
            System.out.println("No comment");//Null significa ausencia de objeto (existe sin existir)
        else
            System.out.println(comment);
    }
}
