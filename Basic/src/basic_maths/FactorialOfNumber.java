package basic_maths;

public class FactorialOfNumber {
    public static void main(String[] args) {
        FactorialOfNumber f = new FactorialOfNumber();
        System.out.println(f.factorial(0));
        System.out.println(f.factorial(10));
    }

    public int factorial(int n) {
        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
