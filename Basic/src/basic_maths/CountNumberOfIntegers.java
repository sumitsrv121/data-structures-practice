package basic_maths;

public class CountNumberOfIntegers {
    public static void main(String[] args) {
        CountNumberOfIntegers c = new CountNumberOfIntegers();
        System.out.println(c.countDigit(190000000));
    }

    public int countDigit(int n) {
        if (n == 0) {
            return 1;
        }
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }
}
