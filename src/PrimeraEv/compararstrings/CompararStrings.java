package PrimeraEv.compararstrings;

public class CompararStrings {

    public static void main(String[] args) {

        String first = "Uda";
        String second = "city";
        String firstAndSecond = first + second;
        String third = "Udacity";
        if (firstAndSecond.equals(third)) // Método "equals" para comparar strings
            System.out.println("They are de same");
        else
            System.out.println("firstAndSecond is " + firstAndSecond);
    }
}