package basic_recursion;

public class PrintNTo1 {
    public static void main(String[] args) {
        PrintNTo1 p = new PrintNTo1();
        p.printNTo1(10);
    }

    private void printNTo1(int num) {
        if (num == 0) {
            return;
        }
        System.out.println(num);
        printNTo1(num - 1);
    }
}
