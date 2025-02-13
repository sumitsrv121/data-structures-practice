package basic_recursion;

public class FactorialOfNumber {
    public static void main(String[] args) {
        FactorialOfNumber factorialOfNumber = new FactorialOfNumber();
        long factorial = factorialOfNumber.factorial(3);
        System.out.println(factorial);
    }

    public long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
