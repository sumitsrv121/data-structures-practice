package basic_recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int num = 29;
        Fibonacci f = new Fibonacci();
        int ans = f.fib(num);
        System.out.println(ans);
    }

    private int fib(int num) {
        if (num == 0 || num == 1) {
            return num;
        }

        return fib(num - 1) + fib(num - 2);
    }
}
