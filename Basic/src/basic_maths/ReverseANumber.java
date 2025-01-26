package basic_maths;

public class ReverseANumber {
    public static void main(String[] args) {
        ReverseANumber r = new ReverseANumber();
        int i = r.reverseNumber(24);
        System.out.println(i);
    }

    public int reverseNumber(int n) {
        if (n / 10 == 0) {
            return n;
        }
        int num = 0;
        while(n > 0) {
            int lastDigit = n % 10;
            num *= 10;
            num += lastDigit;
            n /= 10;
        }
        return num;
    }
}
