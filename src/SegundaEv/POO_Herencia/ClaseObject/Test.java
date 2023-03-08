package SegundaEv.POO_Herencia.ClaseObject;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        System.out.println("Indica la clase");
        String resp = in.next();

        B objeto;
        if (resp.equalsIgnoreCase("C")) {
            objeto = new C();
        } else {
            objeto = new D();
        }
        objeto.disparar();


        // ((D) objeto).dispararOriginal();

        // cateo a C

        // objeto.metodoB();
        // Object objeto = new A();
        // Object objeto2 = new D();
    }
}
