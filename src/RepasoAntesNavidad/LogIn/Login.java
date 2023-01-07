package RepasoAntesNavidad.LogIn;

import java.util.Scanner;

public class Login {


    public static void main(String[] args) {


        ComprobarLogin check = new ComprobarLogin();
        Scanner in  = new Scanner(System.in);

        String pass = in.nextLine();

        System.out.println(check.cantidadCaracteres(pass));
        System.out.println(check.CorrectaoNO(pass));






    }


}
