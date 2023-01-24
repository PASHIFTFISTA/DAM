package SegundaEv.Strings.Imprimir;

import java.util.Scanner;

public class Reto3 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string:");
        String s = scanner.next();

        System.out.println(Reto3.toUpperCase(s));
        // /{write you code here
        // /}
    }

    static String toUpperCase(String s){

        if (s.length()>2) {

            return s.substring(0, 3)+s.substring(s.length()-3).toUpperCase();
        }
        return s.toUpperCase();
    }
}
