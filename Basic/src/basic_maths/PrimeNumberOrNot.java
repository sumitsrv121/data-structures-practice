package basic_maths;

public class PrimeNumberOrNot {
    public static void main(String[] args) {
        PrimeNumberOrNot p = new PrimeNumberOrNot();
        System.out.println(p.isPrime(7));
        System.out.println(p.isPrime(10));
    }

    public boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
