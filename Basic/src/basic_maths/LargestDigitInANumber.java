package basic_maths;

public class LargestDigitInANumber {
    public static void main(String[] args) {
        LargestDigitInANumber l = new LargestDigitInANumber();
        System.out.println(l.largestDigit(197690));
    }

    public int largestDigit(int n) {
        if (n == 0) {
            return 0;
        }
        int largest = Integer.MIN_VALUE;

        while (n > 0) {
            largest = Math.max(n % 10, largest);
            n /= 10;
        }
        return largest;
    }
}
