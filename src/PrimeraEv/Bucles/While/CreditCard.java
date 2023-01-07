package PrimeraEv.Bucles.While;

public class CreditCard {
    final private long cardNumber;

    public CreditCard(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public boolean sumCertainDigits() {
        long n = cardNumber;

        long sum = 0;
        int count = 0;
        while (n > 0) {
            long digit = n % 10;
            count++;
            if (count % 2 != 0) {
                sum = (sum + digit);
            } else if (digit < 5) {
                sum = (sum + 2 * digit);
            } else {
                sum = (sum + 2 * digit - 9);
            }
            n = n / 10;
        }
        return sum % 10 == 0;

    }

    public static void main(String[] args) {
        CreditCard ejemplo = new CreditCard(347984920271357L);
        System.out.println(ejemplo.sumCertainDigits());
    }
}