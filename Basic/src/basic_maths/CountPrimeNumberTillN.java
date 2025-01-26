package basic_maths;

public class CountPrimeNumberTillN {
    public static void main(String[] args) {
        CountPrimeNumberTillN c = new CountPrimeNumberTillN();
        System.out.println(c.primeUptoN(20));
    }

    public int primeUptoN(int n) {
        int count = 0;
        for (int i = 2; i <= n ; i++) {
            if(isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    private boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
