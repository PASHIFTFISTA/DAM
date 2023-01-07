package PrimeraEv.Condicionales_inputs;

public class Switch {

    public static void main(String[] args) {

        int j = 2;
        switch (j) {
            case 5:
                System.out.println("5********");
            case 4:
                System.out.println("4********");
                break;
            case 3:
                System.out.println("3********");
            case 2:
                System.out.println("2********");
            case 1:
                System.out.println("1********");
            default://No necesita valor
                System.out.println("Por defecto");
        }
    }
}
