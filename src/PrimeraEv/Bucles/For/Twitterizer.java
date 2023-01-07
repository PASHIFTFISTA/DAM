package PrimeraEv.Bucles.For;


public class Twitterizer {
    public String shorten(String longPost) {
        StringBuilder shorPost = new StringBuilder();
        for (int i = 0; i<longPost.length();i++){

            if (!"aieouAEIOU".contains(longPost.substring(i, i+1)))
                shorPost.append(longPost.charAt(i));
        }
        return shorPost.toString();
    }
}
