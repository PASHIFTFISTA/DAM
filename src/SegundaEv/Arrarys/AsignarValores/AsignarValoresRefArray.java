package SegundaEv.Arrarys.AsignarValores;

public class AsignarValoresRefArray {
    public static void main(String[] args) {

        int [] temperatures = {65, 71, 68, 87, 89, 78};
        int [] dailyTemps = temperatures;
        dailyTemps[dailyTemps.length-1]=101;
        System.out.println(temperatures[temperatures.length-1]);

        for (int temperature:temperatures) System.out.println(temperature);
    }
}
