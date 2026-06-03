package BasicProblems;

public class ReverseNumber {
    public static int reverseNumber(int n) {
        int reverse = 0;

        while (n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }
        return reverse;
    }
}
