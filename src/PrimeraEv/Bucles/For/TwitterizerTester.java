package PrimeraEv.Bucles.For;

public class TwitterizerTester {
    public static void main(String[] args) {
        Twitterizer Twitterizer = new Twitterizer();
        String longPost = "How did i ever program without loops?!";
        System.out.println("Primera instancia "+longPost);
        System.out.println("Actual " + Twitterizer.shorten(longPost));
        System.out.println("Expected Hw dd vr prgrm wtht lps?!");
    }
}
