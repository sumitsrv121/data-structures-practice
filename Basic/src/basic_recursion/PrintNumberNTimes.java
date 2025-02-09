package basic_recursion;

public class PrintNumberNTimes {
    public static void main(String[] args) {
        PrintNumberNTimes p = new PrintNumberNTimes();
        p.printNumberNTimes(10, 4);
    }

    public void printNumberNTimes(int num, int n) {
        if (n == 0) {
            return;
        }
        System.out.println(num);
        printNumberNTimes(num, n - 1);
    }
}
