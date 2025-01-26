package basic_maths;

public class CheckIfNumberIsArmstrongNumberOrNot {
    public static void main(String[] args) {
        CheckIfNumberIsArmstrongNumberOrNot c = new CheckIfNumberIsArmstrongNumberOrNot();
        System.out.println(c.isArmstrong(153));
        System.out.println(c.isArmstrong(12));
        System.out.println(c.isArmstrong(370));
    }

    public boolean isArmstrong(int n) {
        int numberOfDigits = String.valueOf(n).length();
        int newNum = 0;
        int existingNumber = n;
        while (n > 0) {
            int digit = n % 10;
            newNum += (int) Math.pow(digit, numberOfDigits);
            n /= 10;
        }
        return newNum == existingNumber;
    }
}
