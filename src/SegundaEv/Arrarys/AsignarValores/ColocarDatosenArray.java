package SegundaEv.Arrarys.AsignarValores;

public class ColocarDatosenArray {
    public static void main(String[] args) {

        int [] valores = new int [10];

        for (int i = 0; i < valores.length; i++)

            if (i<1) {
                valores[0] = 10;
                System.out.println(valores[0]);
            }
            else if (valores.length-1 == i){
                valores[valores.length-1]=10;
                System.out.println(valores[valores.length-1]);
            }
    }
}
