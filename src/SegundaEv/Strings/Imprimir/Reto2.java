package SegundaEv.Strings.Imprimir;

import java.util.Scanner;

public class Reto2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the URL :");
        String s=sc.nextLine();
        Reto2 obj=new Reto2();
        s=obj.decodeURL(s);
        System.out.print("Decoded URL is :"+s);
    }

    String decodeURL (String s){

        s = s.replace("%20", " ").replace("%3A", "?").replace("%3A", "?");

        return s;
    }
}
