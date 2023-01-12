package SegundaEv.Strings.Imprimir;

import java.util.Scanner;

public class Reto {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String input = sc.next();
        // Write your code here
        if (input.equalsIgnoreCase("Admin"))
            System.out.println("Username accepted");
        else
            System.out.println("Invalid username");

        // End
    }
}
