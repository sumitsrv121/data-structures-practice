package basic_recursion;

public class PrimeNumber {
    public static void main(String[] args) {
        PrimeNumber p = new PrimeNumber();
        System.out.println(p.checkPrime(15));
        System.out.println(p.checkPrime(7));
    }

    public boolean checkPrime(int num) {
        if (num <= 1) {
            return false;
        }
        return isPrime(2, num);
    }

    private boolean isPrime(int startNum, int num) {
        if (startNum > Math.sqrt(num)) {
            return true;
        }
        if (num % startNum == 0) {
            return false;
        }
        return isPrime(startNum + 1, num);
    }
}
