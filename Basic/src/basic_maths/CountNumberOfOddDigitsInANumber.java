package basic_maths;

public class CountNumberOfOddDigitsInANumber {
    public static void main(String[] args) {
        CountNumberOfOddDigitsInANumber c = new CountNumberOfOddDigitsInANumber();
        System.out.println(c.countOddDigit(120065));

    }

    public int countOddDigit(int n) {
        if (n == 0) {
            return 0;
        }
        int count = 0;
        while (n > 0) {
            if ((n % 10) % 2 != 0) {
                count++;
            }
            n /= 10;
        }
        return count;
    }
}
