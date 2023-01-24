package SegundaEv.Strings.Imprimir;

import java.util.Scanner;

public class FiestaAburrida {

    public static void main(String[] args) {


        FiestaAburrida.Fiesta();

    }


    public  static void Fiesta (){

        Scanner in = new Scanner(System.in);

        String invitados = in.nextLine();

        int invitadosInt= Integer.parseInt(invitados);

        String [] nombreInvitados= new String [invitadosInt];

        for (int i = 0; i < invitadosInt; i++){

            nombreInvitados[i]=in.nextLine();
        }

        for (int i = 0; i < invitadosInt; i++){

            System.out.println("Hola,"+ nombreInvitados[i].substring(3)+".");
        }

    }
}
