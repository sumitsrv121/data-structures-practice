package basic_maths;

public class PerfectNumber {
    public static void main(String[] args) {
        PerfectNumber p = new PerfectNumber();
        System.out.println(p.isPerfect(6));
        System.out.println(p.isPerfect(4));
        System.out.println(p.isPerfect(28));
    }

    public boolean isPerfect(int n) {
        int newNum = 1;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                newNum += i;
                if(i != n/i) {
                    newNum += n / i;
                }
            }
        }
        return newNum == n;
    }
}
