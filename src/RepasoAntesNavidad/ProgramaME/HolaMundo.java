package RepasoAntesNavidad.ProgramaME;

import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numero = in.nextInt();

        for(int i=0; i< numero && numero <=5; i++ ){
            System.out.println("Hola mundo.");
        }
    }
}
