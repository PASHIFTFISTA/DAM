package SegundaEv.Arrarys.ArraysBidireccionales.CantidadRows;

public class CalcularConBucles {
    public static void main(String[] args) {

        double [][] precios =
                {
                        {3979, 4099},
                        {4199, 4299, 2299},
                        {4599, 4499}
                };
        int row = precios.length;
        int col = precios[0].length;
        System.out.println("En el array prices hay : " + row + " filas");
        System.out.println("En el array prices hay : " + col + " filas");

        for (int i = 0; i < precios.length; i++){

            for (int j = 0; j < precios [i].length; j++){
                System.out.printf("%10.3f", precios[i][j]);
            }
            System.out.println();

        }
    }
}
