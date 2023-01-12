package SegundaEv.Arrarys.ArraysBidireccionales.Declaracion;

import java.util.Arrays;

public class DeclaracionArrayBidireccional1 {

    public static void main(String[] args) {
        double [][] prices = new double [3][2];//Forma tradicional

        double [][] precios = //Forma declarativa (con los datos)
                {
                        {3979, 4099},
                        {4199, 4299},
                        {4599, 4499}
                };
        System.out.println(Arrays.toString(precios));

    }
}
