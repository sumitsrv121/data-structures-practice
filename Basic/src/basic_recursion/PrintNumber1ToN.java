package basic_recursion;

public class PrintNumber1ToN {
    public static void main(String[] args) {
        PrintNumber1ToN p = new PrintNumber1ToN();
        p.printNumber1ToN(10);

    }

    public void printNumber1ToN(int num) {
        if (num == 0) {
            return;
        }
        printNumber1ToN(num - 1);
        System.out.println(num);
    }
}
