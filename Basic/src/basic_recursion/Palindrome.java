package basic_recursion;

public class Palindrome {
    public static void main(String[] args) {
        String s = "hannah";
        String s1 = "aabbaaa";

        Palindrome p = new Palindrome();
        System.out.println(p.palindromeCheck(s));
        System.out.println(p.palindromeCheck(s1));
    }

    public boolean palindromeCheck(String s) {
        return isPalindrome(s, 0, s.length() - 1);
    }

    private boolean isPalindrome(String s, int left, int right) {
        if (left >= right) {
            return true;
        }

        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }
        return isPalindrome(s, left + 1, right - 1);
    }
}
