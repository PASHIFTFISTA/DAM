package SegundaEv.Arrarys.DeclaracionArrays;

public class Declaracion {

    public static void main(String[] args) {

        int [] sueldos = new int [5];

        sueldos[0]=1000;
        sueldos[1]=1120;
        sueldos[2]=1130;
        sueldos[3]=1210;
        sueldos[4]=1240;

        for (int sueldo : sueldos) System.out.println(sueldo);

    }
}
