package SegundaEv.Arrarys.ForEachArrays;

public class ForEach {

    public static void main(String[] args) {

        int [] values = {1,2,0,4,5,0,7,8,9,10};

        ForEach check = new ForEach();
        System.out.println(check.getCount(values));
    }
    public int getCount (int [] values){

        int count = 0;

        for (int valor: values) {

             if (valor==0)
                 count++;
        }
        return count;
    }
}
