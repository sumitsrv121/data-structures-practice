package basic_recursion;

public class SumOfAllDigitsOfNumber {
    public static void main(String[] args) {
        SumOfAllDigitsOfNumber s = new SumOfAllDigitsOfNumber();
        int num = 529;
        int sumOfAllDigits = s.getSumOfAllDigits(num);
        System.out.println(sumOfAllDigits);

    }

    private int sumUpTheDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += (num % 10);
            num /= 10;
        }
        return sum;
    }

    private int getSumOfAllDigits(int num) {
        if (num / 10 == 0) {
            return num;
        }
        int newSum = sumUpTheDigits(num);
        return getSumOfAllDigits(newSum);
    }
}
