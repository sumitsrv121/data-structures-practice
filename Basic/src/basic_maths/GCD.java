package basic_maths;

public class GCD {
    public static void main(String[] args) {
        GCD gcd = new GCD();
        System.out.println(gcd.GCD(4, 6));
        System.out.println(gcd.GCD(9, 8));
        System.out.println(gcd.GCD(6, 12));

    }

    public int GCD(int n1, int n2) {
        int divisor = Math.min(n1, n2);
        int dividend = Math.max(n1, n2);

        while (dividend % divisor != 0) {
           int remainder =  dividend % divisor;
           dividend = divisor;
           divisor = remainder;
        }
        return divisor;
    }
}
