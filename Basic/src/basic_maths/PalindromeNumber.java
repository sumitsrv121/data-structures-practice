package basic_maths;

public class PalindromeNumber {
    public static void main(String[] args) {
        PalindromeNumber p = new PalindromeNumber();
        boolean palindrome = p.isPalindrome(1211);
        System.out.println(palindrome);
    }

    public boolean isPalindrome(int n) {
        if (n / 10 == 0) {
            return true;
        }
        String num = String.valueOf(n);
        int end = num.length() - 1;
        int start = 0;

        while(start < end) {
            if(num.charAt(start) != num.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
