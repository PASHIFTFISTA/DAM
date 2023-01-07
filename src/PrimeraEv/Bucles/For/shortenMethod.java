package PrimeraEv.Bucles.For;

import java.util.Scanner;

public class shortenMethod {

    public static void main(String[] args) {

        int count=0;

        Scanner in = new Scanner(System.in);
        String word= in.nextLine();

        for (int i = 0; i < word.length(); i++){
            String letter = word.substring(i, i + 1);

            if ("aeiouAEIOU".contains(letter))
                count++;
        }
        System.out.println(word + " tenía " + count + " vocales");
    }
}
