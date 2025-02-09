package basic_recursion;

public class SumOfFirstNNumber {
    public static void main(String[] args) {
        SumOfFirstNNumber s = new SumOfFirstNNumber();
        int ans = s.NnumbersSum(10);
        System.out.println(ans);
    }

    public int NnumbersSum(int N) {
        if (N == 0) {
            return 0;
        }
        return N + NnumbersSum(N - 1);
    }
}
