package SegundaEv.Strings.StringTokenizer;

import java.util.StringTokenizer;

public class TokenizerString {

    public static void main(String[] args) {
        StringTokenizer str;
        str = new StringTokenizer("Uno dos tres perico de los_palotes", "_ ");
        System.out.println("la cadena str tiene " + str.countTokens() + " elementos");
        while (str.hasMoreTokens())//hasMoreTokens devuelve valor booleano
            System.out.println(str.nextToken());//nexToken devuelve la siguiente palabra.
    }


}