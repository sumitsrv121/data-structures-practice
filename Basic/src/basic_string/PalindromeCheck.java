package basic_string;

public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "hannah";

    }

    public boolean palindromeCheck(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
