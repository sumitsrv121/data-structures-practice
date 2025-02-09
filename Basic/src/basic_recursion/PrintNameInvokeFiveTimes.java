package basic_recursion;

public class PrintNameInvokeFiveTimes {
    public static void main(String[] args) {
        PrintNameInvokeFiveTimes printNameInvokeFiveTimes = new PrintNameInvokeFiveTimes();
        printNameInvokeFiveTimes.printName(0);
    }

    public void printName(int count) {
        if (count == 5) {
            return;
        }
        System.out.println("My name is Sumit");
        printName(count + 1);
    }
}
